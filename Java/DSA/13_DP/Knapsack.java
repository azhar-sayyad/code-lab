
/*
 * ============================================================================
 * 📌 PROBLEM: 0/1 KNAPSACK (Dynamic Programming)
 * ============================================================================
 *
 * PROBLEM IN SIMPLE WORDS:
 * -------------------------
 * You have a bag (knapsack) with a max weight limit.
 * You have N items, each with a WEIGHT and a VALUE.
 * You can either TAKE an item fully or LEAVE it (no fractions!).
 * Goal: Maximize the total VALUE without exceeding the weight CAPACITY.
 *
 * WHY "0/1"?
 * ----------
 * Each item can be taken (1) or not taken (0). No halves.
 * (This is different from Fractional Knapsack where fractions are allowed.)
 *
 * ============================================================================
 * 🔍 STEP-BY-STEP EXAMPLE WITH FULL 2D MATRIX TRACE:
 * ============================================================================
 *
 * Input:
 *   Items:    Item1  Item2  Item3  Item4
 *   Value  :  [  3,    4,    5,    6  ]
 *   Weight :  [  2,    3,    4,    5  ]
 *   Capacity: 5
 *
 * We build a 2D table dp[i][w] where:
 *   - i  = number of items considered (0 to n)
 *   - w  = current weight capacity (0 to capacity)
 *   - dp[i][w] = max value using first i items with capacity w
 *
 * Rule for each cell dp[i][w]:
 *   1. EXCLUDE item i: dp[i][w] = dp[i-1][w]       (don't take item i)
 *   2. INCLUDE item i: dp[i][w] = dp[i-1][w - weight[i]] + value[i]
 *                      (only if weight[i] <= w)
 *   3. dp[i][w] = max(exclude, include)
 *
 * ┌─────────────────────────────────────────────────────────────────────────┐
 * │                    dp[i][w] — Full 2D Table                            │
 * │                                                                         │
 * │         w=0   w=1   w=2   w=3   w=4   w=5                              │
 * │  i=0  [  0,    0,    0,    0,    0,    0  ]  ← no items, always 0      │
 * │  i=1  [  0,    0,    3,    3,    3,    3  ]  ← Item1 (val=3, wt=2)     │
 * │  i=2  [  0,    0,    3,    4,    4,    7  ]  ← Item2 (val=4, wt=3)     │
 * │  i=3  [  0,    0,    3,    4,    5,    7  ]  ← Item3 (val=5, wt=4)     │
 * │  i=4  [  0,    0,    3,    4,    5,    7  ]  ← Item4 (val=6, wt=5)     │
 * │                                                              ↑          │
 * │                                                         ANSWER = 7     │
 * └─────────────────────────────────────────────────────────────────────────┘
 *
 * HOW EACH ROW IS FILLED (step by step):
 *
 * --- i=1: Consider only Item1 (value=3, weight=2) ---
 *   w=0: dp[1][0] = 0  (no capacity)
 *   w=1: item1 weight (2) > w (1), can't include → dp[1][1] = dp[0][1] = 0
 *   w=2: item1 fits! include=dp[0][0]+3=3, exclude=dp[0][2]=0 → max=3
 *   w=3: include=dp[0][1]+3=3, exclude=dp[0][3]=0 → max=3
 *   w=4: include=dp[0][2]+3=3, exclude=dp[0][4]=0 → max=3
 *   w=5: include=dp[0][3]+3=3, exclude=dp[0][5]=0 → max=3
 *   Row: [0, 0, 3, 3, 3, 3]
 *
 * --- i=2: Consider Item1 + Item2 (value=4, weight=3) ---
 *   w=0: 0
 *   w=1: item2 weight (3) > 1 → exclude=dp[1][1]=0 → 0
 *   w=2: item2 weight (3) > 2 → exclude=dp[1][2]=3 → 3
 *   w=3: include=dp[1][0]+4=4, exclude=dp[1][3]=3 → max=4
 *   w=4: include=dp[1][1]+4=4, exclude=dp[1][4]=3 → max=4
 *   w=5: include=dp[1][2]+4=3+4=7, exclude=dp[1][5]=3 → max=7
 *   Row: [0, 0, 3, 4, 4, 7]
 *
 * --- i=3: Consider Item1+2+3 (value=5, weight=4) ---
 *   w=0: 0
 *   w=1: item3 wt=4>1 → exclude=dp[2][1]=0 → 0
 *   w=2: item3 wt=4>2 → exclude=dp[2][2]=3 → 3
 *   w=3: item3 wt=4>3 → exclude=dp[2][3]=4 → 4
 *   w=4: include=dp[2][0]+5=5, exclude=dp[2][4]=4 → max=5
 *   w=5: include=dp[2][1]+5=5, exclude=dp[2][5]=7 → max=7
 *   Row: [0, 0, 3, 4, 5, 7]
 *
 * --- i=4: Consider all items (value=6, weight=5) ---
 *   w=0: 0
 *   w=1: item4 wt=5>1 → exclude=dp[3][1]=0 → 0
 *   w=2: item4 wt=5>2 → exclude=dp[3][2]=3 → 3
 *   w=3: item4 wt=5>3 → exclude=dp[3][3]=4 → 4
 *   w=4: item4 wt=5>4 → exclude=dp[3][4]=5 → 5
 *   w=5: include=dp[3][0]+6=6, exclude=dp[3][5]=7 → max=7
 *   Row: [0, 0, 3, 4, 5, 7]
 *
 * ✅ Answer: dp[4][5] = 7
 *    (Take Item1 (val=3, wt=2) + Item2 (val=4, wt=3) = total val=7, wt=5)
 *
 * ============================================================================
 * ⏱️ COMPLEXITY:
 *   Time : O(n * capacity)  — fills every cell of the 2D table once
 *   Space: O(n * capacity)  — the dp table itself
 * ============================================================================
 */

// 01 knapsack problem
public class Knapsack {

    // 2^n exponential recursive solution (brute force — NOT implemented yet)
    public static void recursiveSol(int[] value, int[] weight, int capacity) {
        // TODO: Try all 2^n subsets and return max value within capacity
    }

    /**
     * 0/1 Knapsack — Bottom-Up Dynamic Programming Solution
     *
     * Builds a 2D DP table where dp[i][w] = max value
     * using first i items with weight limit w.
     *
     * For each item i and each capacity w:
     *   - EXCLUDE item i → dp[i][w] = dp[i-1][w]
     *   - INCLUDE item i → dp[i][w] = dp[i-1][w - weight[i-1]] + value[i-1]
     *                      (only if weight[i-1] <= w)
     *   - Take the maximum of both choices.
     *
     * Full 2D table trace for value=[3,4,5,6], weight=[2,3,4,5], capacity=5:
     *
     *         w=0  w=1  w=2  w=3  w=4  w=5
     *  i=0  [  0,   0,   0,   0,   0,   0  ]
     *  i=1  [  0,   0,   3,   3,   3,   3  ]  ← Item1 (val=3, wt=2)
     *  i=2  [  0,   0,   3,   4,   4,   7  ]  ← Item2 (val=4, wt=3)
     *  i=3  [  0,   0,   3,   4,   5,   7  ]  ← Item3 (val=5, wt=4)
     *  i=4  [  0,   0,   3,   4,   5,   7  ]  ← Item4 (val=6, wt=5)
     *
     * Answer = dp[n][capacity] = dp[4][5] = 7
     */
    public static void solution(int[] value, int[] weight, int capacity) {
        int n = weight.length;

        // dp[i][w] = max value using first i items with weight limit w
        int[][] dp = new int[n + 1][capacity + 1];

        // Row 0: 0 items → all values are 0 (auto-initialized in Java)
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {

                // Choice 1: Exclude current item i (use result from i-1 items)
                int excludeItems = dp[i - 1][w];

                // Choice 2: Include current item i (only if it fits in capacity w)
                int includeItems = 0;
                if (weight[i - 1] <= w) {
                    // Remaining capacity after taking item i = w - weight[i-1]
                    includeItems = dp[i - 1][w - weight[i - 1]] + value[i - 1];
                }

                // Take the better choice
                dp[i][w] = Math.max(excludeItems, includeItems);
            }
        }

        // Print the final DP table for visualization
        System.out.println("Full DP Table:");
        System.out.print("       ");
        for (int w = 0; w <= capacity; w++) System.out.printf("w=%-3d", w);
        System.out.println();
        for (int i = 0; i <= n; i++) {
            System.out.printf("i=%-3d  ", i);
            for (int w = 0; w <= capacity; w++) System.out.printf("%-5d", dp[i][w]);
            System.out.println();
        }

        // Answer is at dp[n][capacity]
        System.out.println("\nMax Value (dp[" + n + "][" + capacity + "]) = " + dp[n][capacity]);
    }

    public static void main(String[] args) {
        int[] value  = { 3, 4, 5, 6 };
        int[] weight = { 2, 3, 4, 5 };
        int capacity = 6;

        Knapsack.solution(value, weight, capacity);
    }
}