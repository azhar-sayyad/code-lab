/**
 * ============================================================
 *  INSERTION SORT
 * ============================================================
 *
 *  ALGORITHM IDEA:
 *    Think of sorting a hand of playing cards.
 *    Start from the second element (index 1). Pick it as the "key"
 *    and shift all larger elements one position to the right to
 *    make room, then insert the key at its correct position.
 *    The left portion of the array is always sorted.
 *
 * ------------------------------------------------------------
 *  STEP-BY-STEP EXAMPLE:
 *    Input:  [3, 0, -1, 5, 9, -3, 2, 1]
 *
 *    i=1, key=0  : [0, 3, -1, 5, 9, -3, 2, 1]   (0 inserted before 3)
 *    i=2, key=-1 : [-1, 0, 3, 5, 9, -3, 2, 1]   (-1 goes to front)
 *    i=3, key=5  : [-1, 0, 3, 5, 9, -3, 2, 1]   (5 already in place)
 *    i=4, key=9  : [-1, 0, 3, 5, 9, -3, 2, 1]   (9 already in place)
 *    i=5, key=-3 : [-3, -1, 0, 3, 5, 9, 2, 1]   (-3 goes to front)
 *    i=6, key=2  : [-3, -1, 0, 2, 3, 5, 9, 1]   (2 inserted after 0)
 *    i=7, key=1  : [-3, -1, 0, 1, 2, 3, 5, 9]   (1 inserted after 0)
 *
 *    Output: [-3, -1, 0, 1, 2, 3, 5, 9]
 *
 * ------------------------------------------------------------
 *  COMPLEXITY:
 *    ┌─────────────┬────────────────────────────────────────────┐
 *    │  Case       │  Time          │  Explanation              │
 *    ├─────────────┼────────────────┼───────────────────────────┤
 *    │  Best       │  O(n)          │  Already sorted; inner    │
 *    │             │                │  while loop never runs    │
 *    │  Average    │  O(n²)         │  ~n²/4 shifts             │
 *    │  Worst      │  O(n²)         │  Reverse sorted; every    │
 *    │             │                │  element shifts maximally │
 *    ├─────────────┼────────────────┼───────────────────────────┤
 *    │  Space      │  O(1)          │  In-place, only 'key' var │
 *    └─────────────┴────────────────┴───────────────────────────┘
 *
 *  STABILITY  : ✅ STABLE
 *    The while condition uses strict greater-than (arr[j] > key),
 *    so equal elements are never moved past each other.
 *
 *  IN-PLACE   : ✅ YES
 *
 *  WHEN TO USE:
 *    • Small arrays (very low constant factor, fast in practice)
 *    • Nearly-sorted data → approaches O(n)
 *    • Online sorting: can sort a list as it receives elements
 *    • Used as the base case inside TimSort (Java's Arrays.sort)
 * ============================================================
 */
class InsertionSort {

    /**
     * Sorts the given array in ascending order using Insertion Sort.
     *
     * @param arr the integer array to sort (modified in-place)
     * @return the same sorted array
     *
     * Example:
     *   Input:  [3, 0, -1, 5, 9, -3, 2, 1]
     *   Output: [-3, -1, 0, 1, 2, 3, 5, 9]
     */
    public static int[] sortArray(int[] arr) {
        int n = arr.length;

        // Start from index 1; element at index 0 is trivially sorted
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be inserted into the sorted left portion
            int j = i - 1;

            // Shift elements that are greater than 'key' one position to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift right
                j--;
            }

            // Insert key at its correct sorted position
            arr[j + 1] = key;
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
        InsertionSort.printArray(arr);      // 3 0 -1 5 9 -3 2 1

        InsertionSort.sortArray(arr);

        System.out.println("After sort Array:");
        InsertionSort.printArray(arr);      // -3 -1 0 1 2 3 5 9
    }

}

