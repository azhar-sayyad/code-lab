class QuickSort {

    public static void sortArray(int arr[], int start, int end) {
        if (start < end) {
            int pIndex = partition(arr, start, end);
            System.out.println("p index " + pIndex);

            sortArray(arr, start, pIndex - 1);
            sortArray(arr, pIndex + 1, end);

        }

    }

    private static int partition(int arr[], int start, int end) {
        int pivit = arr[start];
        int i = start - 1;
        int j = end + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivit);

            do {
                j--;
            } while (arr[j] > pivit);

            if (i >= j) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 10, 5, 8, 2, 3, 1, -3 };

        System.out.println("Original array before sort:");
        QuickSort.printArray(arr);
        QuickSort.sortArray(arr, 0, arr.length - 1);
        System.out.println("After sort Array:");
        QuickSort.printArray(arr);
    }
}