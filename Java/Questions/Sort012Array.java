public class Sort012Array {
    public static void main(String[] args) {
        int[] arr = { 2,1, 0, 2, 2, 1, 0 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid < high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            if (arr[mid] == 1) {
                mid++;
            }
            if (arr[mid] == 2) {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
