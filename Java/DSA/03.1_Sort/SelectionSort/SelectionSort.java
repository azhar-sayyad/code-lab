/**
 * ============================================================
 *  SELECTION SORT
 * ============================================================
 *
 *  ALGORITHM IDEA:
 *    Divide the array into a sorted (left) and unsorted (right) part.
 *    On each pass, find the minimum element in the unsorted portion
 *    and swap it with the first element of the unsorted portion.
 *    After n-1 passes the entire array is sorted.
 *
 *    Two variants are implemented here:
 *      sortArray1 — always swaps (even if element is already in place)
 *      sortArray2 — skips the swap when element is already at minIndex
 *
 * ------------------------------------------------------------
 *  STEP-BY-STEP EXAMPLE:
 *    Input:  [3, 0, -1, 5, 9, -3, 2, 1]
 *
 *    Pass 1 (i=0): min=-3 at idx=5 → swap arr[0] & arr[5]
 *      → [-3, 0, -1, 5, 9, 3, 2, 1]
 *
 *    Pass 2 (i=1): min=-1 at idx=2 → swap arr[1] & arr[2]
 *      → [-3, -1, 0, 5, 9, 3, 2, 1]
 *
 *    Pass 3 (i=2): min=0 at idx=2 → already in place (sortArray2 skips)
 *      → [-3, -1, 0, 5, 9, 3, 2, 1]
 *
 *    Pass 4 (i=3): min=1 at idx=7 → swap arr[3] & arr[7]
 *      → [-3, -1, 0, 1, 9, 3, 2, 5]
 *
 *    Pass 5 (i=4): min=2 at idx=6 → swap arr[4] & arr[6]
 *      → [-3, -1, 0, 1, 2, 3, 9, 5]
 *
 *    Pass 6 (i=5): min=3 at idx=5 → already in place (sortArray2 skips)
 *      → [-3, -1, 0, 1, 2, 3, 9, 5]
 *
 *    Pass 7 (i=6): min=5 at idx=7 → swap arr[6] & arr[7]
 *      → [-3, -1, 0, 1, 2, 3, 5, 9]
 *
 *    Output: [-3, -1, 0, 1, 2, 3, 5, 9]
 *
 * ------------------------------------------------------------
 *  COMPLEXITY:
 *    ┌─────────────┬────────────────────────────────────────────┐
 *    │  Case       │  Time          │  Explanation              │
 *    ├─────────────┼────────────────┼───────────────────────────┤
 *    │  Best       │  O(n²)         │  Always scans full        │
 *    │             │                │  unsorted portion         │
 *    │  Average    │  O(n²)         │  ~n²/2 comparisons        │
 *    │  Worst      │  O(n²)         │  Same — no early exit     │
 *    ├─────────────┼────────────────┼───────────────────────────┤
 *    │  Space      │  O(1)          │  In-place                 │
 *    │  Swaps      │  O(n)          │  At most n-1 swaps        │
 *    └─────────────┴────────────────┴───────────────────────────┘
 *
 *  STABILITY  : ❌ UNSTABLE
 *    Long-range swaps can change the relative order of equal elements.
 *    Example:  [3a, 3b, 1]
 *      Pass 1: min=1 at idx=2 → swap arr[0] & arr[2] → [1, 3b, 3a]
 *      3a and 3b are now reversed! → UNSTABLE
 *
 *  IN-PLACE   : ✅ YES
 *
 *  KEY ADVANTAGE:
 *    Makes at most O(n) swaps — useful when write operations are costly
 *    (e.g., flash memory). Even though comparisons are O(n²), the swap
 *    count is the lowest of the simple O(n²) sorts.
 *
 *  WHEN TO USE:
 *    • Memory writes are expensive (minimises swaps)
 *    • Small arrays where simplicity matters
 *    • Avoid for large datasets or when stability is required
 * ============================================================
 */
public class SelectionSort {

    /**
     * Variant 1 — always swaps (even if minIndex == i).
     * Simpler code; exactly (n-1) swaps always occur.
     *
     * @param arr the integer array to sort (modified in-place)
     * @return the same sorted array
     *
     * Example:
     *   Input:  [3, 0, -1, 5, 9, -3, 2, 1]
     *   Output: [-3, -1, 0, 1, 2, 3, 5, 9]
     */
    public static int[] sortArray1(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume current position holds the minimum

            // Find the actual minimum in the unsorted portion [i+1 .. n-1]
            for (int j = i; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first unsorted element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    /**
     * Variant 2 — skips the swap when the element is already in place.
     * Slightly optimized: avoids unnecessary self-swaps.
     * Behaviour is otherwise identical to sortArray1.
     *
     * @param arr the integer array to sort (modified in-place)
     * @return the same sorted array
     *
     * Example:
     *   Input:  [3, 0, -1, 5, 9, -3, 2, 1]
     *   Output: [-3, -1, 0, 1, 2, 3, 5, 9]
     */
    public static int[] sortArray2(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find minimum in unsorted portion, but skip comparing element with itself
            for (int j = i; j < n; j++) {
                if (arr[minIndex] > arr[j] && i != j) {
                    minIndex = j;
                }
            }

            // Only swap if the minimum is not already at position i
            if (arr[i] != arr[minIndex]) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

    /** Prints all elements of the array on one line. */
    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 3, 0, -1, 5, 9, -3, 2, 1 };

        System.out.println("Original array before sort:");
        SelectionSort.printArray(arr);      // 3 0 -1 5 9 -3 2 1

        SelectionSort.sortArray2(arr);      // Using optimised variant

        System.out.println("After sort Array:");
        SelectionSort.printArray(arr);      // -3 -1 0 1 2 3 5 9
    }

}

