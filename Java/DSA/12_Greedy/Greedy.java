import java.util.*;

/**
 * Problem: Maximum and Minimum Difference (Pairing 2N elements).
 *
 * Given an array of 2N elements, partition them into N pairs (a_i, b_i) such that:
 * 1. The sum of absolute differences |a_i - b_i| is MAXIMIZED.
 * 2. The sum of absolute differences |a_i - b_i| is MINIMIZED.
 *
 * Greedy Strategy:
 * - To Maximize: Pair the smallest elements with the largest elements:
 *                (arr[0], arr[2N-1]), (arr[1], arr[2N-2]), ...
 * - To Minimize: Pair adjacent elements when sorted:
 *                (arr[0], arr[1]), (arr[2], arr[3]), ...
 */
public class Greedy {

  public void getMaxMinDifference(int[] arr) {
    if (arr == null || arr.length == 0) {
      System.out.println("Array is empty.");
      return;
    }

    if (arr.length % 2 != 0) {
      System.out.println(
        "Warning: Array length is odd (" +
          arr.length +
          "). One element will be left out of pairing."
      );
    }

    // Step 1: Sort the array - O(n log n)
    Arrays.sort(arr);

    // Use long to prevent integer overflow for large values
    long minDiff = 0;
    long maxDiff = 0;

    int i = 0;
    int j = arr.length - 1;

    // Step 2: Calculate max and min differences in a single pass
    while (i < j) {
      // Maximize: Take difference between smallest (i) and largest (j)
      // (arr is sorted, so arr[j] >= arr[i], Math.abs is optional)
      maxDiff += (arr[j] - arr[i]);

      // Minimize: Take difference between adjacent sorted pairs (2*i, 2*i + 1)
      if (2 * i + 1 < arr.length) {
        minDiff += (arr[2 * i + 1] - arr[2 * i]);
      }

      i++;
      j--;
    }

    System.out.println("Minimum Difference Sum: " + minDiff);
    System.out.println("Maximum Difference Sum: " + maxDiff);
  }

  public static void main(String[] args) {
    Greedy g = new Greedy();

    // Note: This problem typically operates on an EVEN number of elements (2N).
    // Example with 6 elements (even):
    int[] arrEven = { 1, 3, 6, 20, 40, 50 };
    System.out.println("--- Test 1: Even length array (6 elements) ---");
    System.out.println("Input: " + Arrays.toString(arrEven));
    g.getMaxMinDifference(arrEven);

    // Example with 8 elements:
    int[] arr8 = { 1, 3, 6, 20, 40, 50, 80, 100 };
    System.out.println("\n--- Test 2: Even length array (8 elements) ---");
    System.out.println("Input: " + Arrays.toString(arr8));
    g.getMaxMinDifference(arr8);

    // Example with odd length:
    int[] arrOdd = { 1, 3, 6, 20, 40, 50, 100 };
    System.out.println("\n--- Test 3: Odd length array (7 elements) ---");
    System.out.println("Input: " + Arrays.toString(arrOdd));
    g.getMaxMinDifference(arrOdd);
  }
}
