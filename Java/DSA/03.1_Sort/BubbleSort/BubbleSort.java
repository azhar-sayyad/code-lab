/**
 * ============================================================
 *  BUBBLE SORT
 * ============================================================
 *
 *  ALGORITHM IDEA:
 *    Repeatedly compare adjacent elements and swap them if they
 *    are in the wrong order. After each pass, the largest unsorted
 *    element "bubbles up" to its correct position at the end.
 *    An early-exit (isSorted flag) stops the loop as soon as
 *    no swaps occur in a full pass → already sorted.
 *
 * ------------------------------------------------------------
 *  STEP-BY-STEP EXAMPLE:
 *    Input:  [10, 5, 8, 2, 3, 1, -3]
 *
 *    Pass 1 (i=0): compare pairs across full range (0..5)
 *      [10,5]  → swap → [5, 10, 8, 2, 3, 1, -3]
 *      [10,8]  → swap → [5, 8, 10, 2, 3, 1, -3]
 *      [10,2]  → swap → [5, 8, 2, 10, 3, 1, -3]
 *      [10,3]  → swap → [5, 8, 2, 3, 10, 1, -3]
 *      [10,1]  → swap → [5, 8, 2, 3, 1, 10, -3]
 *      [10,-3] → swap → [5, 8, 2, 3, 1, -3, 10]   ← 10 settled
 *
 *    Pass 2 (i=1): range (0..4)
 *      → [5, 2, 3, 1, -3, 8, 10]                   ← 8 settled
 *
 *    Pass 3 (i=2): range (0..3)
 *      → [2, 3, 1, -3, 5, 8, 10]                   ← 5 settled
 *    ... (continues)
 *
 *    Output: [-3, 1, 2, 3, 5, 8, 10]
 *
 * ------------------------------------------------------------
 *  COMPLEXITY:
 *    ┌─────────────┬────────────────────────────────────────┐
 *    │  Case       │  Time          │  Explanation          │
 *    ├─────────────┼────────────────┼───────────────────────┤
 *    │  Best       │  O(n)          │  Already sorted;      │
 *    │             │                │  isSorted flag exits  │
 *    │             │                │  after 1 pass         │
 *    │  Average    │  O(n²)         │  ~n²/4 comparisons    │
 *    │  Worst      │  O(n²)         │  Reverse sorted input │
 *    ├─────────────┼────────────────┼───────────────────────┤
 *    │  Space      │  O(1)          │  In-place swaps only  │
 *    └─────────────┴────────────────┴───────────────────────┘
 *
 *  STABILITY  : ✅ STABLE
 *    Equal elements are never swapped (condition: arr[j] > arr[j+1]),
 *    so their original relative order is preserved.
 *
 *  IN-PLACE   : ✅ YES  (no extra array needed)
 *
 *  WHEN TO USE:
 *    • Educational / teaching purposes
 *    • Nearly-sorted small arrays (benefits from O(n) best case)
 *    • Avoid for large datasets — O(n²) is too slow
 * ============================================================
 */
public class BubbleSort {

    /**
     * Sorts the given array in ascending order using Bubble Sort.
     *
     * @param arr the integer array to sort (modified in-place)
     * @return the same sorted array
     *
     * Example:
     *   Input:  [10, 5, 8, 2, 3, 1, -3]
     *   Output: [-3, 1, 2, 3, 5, 8, 10]
     */
    public static int[] sortArray(int[] arr) {
        int n = arr.length;

        // Outer loop: each pass places the next largest element at the end
        for (int i = 0; i < n - 1; i++) {

            boolean isSorted = true; // Optimization: exit early if already sorted

            // Inner loop: compare adjacent pairs; shrinks by i each pass
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false; // A swap happened → not sorted yet
                }
            }

            // No swaps in this pass → array is already sorted
            if (isSorted) {
                break;
            }
        }
        return arr;
    }

    /** Prints all elements of the array on one line. */
    public static void printArray(int[] arr) {
        for (int item : arr) { // forEach Loop
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 10, 5, 8, 2, 3, 1, -3 };

        System.out.println("Original array before sort:");
        BubbleSort.printArray(arr);          // 10 5 8 2 3 1 -3

        BubbleSort.sortArray(arr);

        System.out.println("After sort Array:");
        BubbleSort.printArray(arr);          // -3 1 2 3 5 8 10
    }

}

