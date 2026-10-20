

public class MinMax {

    // Record to hold both the minimum and maximum values
    public record MinMaxVal(int min, int max) {}

    /**
     * Divide and Conquer (Tournament Method) to find Min and Max.
     * Time Complexity: O(n) with ~ 3n/2 - 2 comparisons.
     */
    public MinMaxVal findMinMax(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        // Base Case 1: Only 1 element in the range
        if (start == end) {
            return new MinMaxVal(arr[start], arr[start]);
        }

        // Base Case 2: Exactly 2 elements in the range
        if (start + 1 == end) {
            if (arr[start] < arr[end]) {
                // arr[start] is min, arr[end] is max
                return new MinMaxVal(arr[start], arr[end]);
            } else {
                // arr[end] is min, arr[start] is max
                return new MinMaxVal(arr[end], arr[start]);
            }
        }

        // Divide Step: Find middle index
        // NOTE: Must use parentheses (start + end) / 2 or start + (end - start) / 2
        // to avoid operator precedence bugs and integer overflow.
        int mid = start + (end - start) / 2;

        // Conquer Step: Recursively find min and max of left and right halves
        MinMaxVal leftResult = findMinMax(arr, start, mid);
        MinMaxVal rightResult = findMinMax(arr, mid + 1, end);

        // Combine Step: Compare results from left and right halves
        int overallMin = Math.min(leftResult.min(), rightResult.min());
        int overallMax = Math.max(leftResult.max(), rightResult.max());

        return new MinMaxVal(overallMin, overallMax);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 10, 5, 200, 5, 4, 3};
        MinMax obj = new MinMax();

        // Pass arr.length - 1
        MinMaxVal result = obj.findMinMax(arr, 0, arr.length - 1);

        System.out.println("Array: [0, 1, 2, 10, 5, 200, 5, 4, 3]");
        System.out.println("Min: " + result.min());
        System.out.println("Max: " + result.max());
    }
}