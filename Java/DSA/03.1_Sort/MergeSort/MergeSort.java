class MergeSort {
    public static void sortArray(int[] arr) {
        divide(arr, 0, arr.length - 1);
        return;
    }

    private static void divide(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }

    }

    private static void merge(int arr[], int start, int mid, int end) {
        int size1 = mid - start + 1;
        int size2 = end - mid;

        int leftArr[] = new int[size1];
        int rightArr[] = new int[size2];

        for (int i = 0; i < size1; i++) {
            leftArr[i] = arr[start + i];
        }

        for (int i = 0; i < size2; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < size1 && j < size2) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                k++;
                i++;
            } else {
                arr[k] = rightArr[j];
                k++;
                j++;
            }
        }

        while (i < size1) {
            arr[k] = leftArr[i];
            k++;
            i++;
        }

        while (j < size2) {
            arr[k] = rightArr[j];
            k++;
            j++;
        }

        return;

    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 10, 5, 8, 2, 3, 1, -3 };

        System.out.println("Original array before sort:");
        MergeSort.printArray(arr); // 10 5 8 2 3 1 -3

        MergeSort.sortArray(arr);

        System.out.println("After sort Array:");
        MergeSort.printArray(arr); // -3 1 2 3 5 8 10

    }
}