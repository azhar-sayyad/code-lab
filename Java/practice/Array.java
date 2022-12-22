public class Array {

    // Write a java program to find second largest element in an array. If not
    // exist, then return -1.
    public static void findSecondLargest(int[] arr) {

        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }

        System.out.println("Largest element: " + large);
        if (secondLarge == Integer.MIN_VALUE) {
            System.out.println("Second largest element: -1");
        } else {
            System.out.println("Second largest element: " + secondLarge);
        }
    }

    // Write a java program to input elements in array from user and count duplicate
    // elements in array and print them.
    public static void countDuplicateElements(int[] arr) {

        // Find the maximum value to size the count array, or use a high enough value.
        // For practice, let's find the max.
        int max = 0;
        for (int val : arr)
            if (val > max)
                max = val;

        int dupArr[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            dupArr[value]++;
        }
        int countOfDuplicate = 0;
        System.out.println("\nDuplicate elements and their counts: ");
        for (int i = 0; i < dupArr.length; i++) {
            if (dupArr[i] > 1) {
                countOfDuplicate++;
                System.out.println("Element: " + i + ", Count: " + dupArr[i]);
            }
        }
        System.out.println("Total count of unique duplicate values: " + countOfDuplicate);
    }

    // Write a Java program to left rotate an array by k position.
    public static void leftRotate(int[] arr, int k) {

        if (arr.length == 0)
            return;
        k = k % arr.length;

        int tempArr[] = new int[arr.length];
        int tempIndex = 0;

        for (int i = k; i < arr.length; i++) {
            tempArr[tempIndex] = arr[i];
            tempIndex++;
        }

        for (int i = 0; i < k; i++) {
            tempArr[tempIndex] = arr[i];
            tempIndex++;
        }

        System.out.println("\nArray after " + k + " Left Rotations: ");
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();
    }

    // Write a java program to print all negative elements in an array.

    public static void printNegative(int[] arr) {

        System.out.println("\nNegative elements in array: ");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }
        if (!found)
            System.out.print("None");
        System.out.println();
    }

    // Write a java program to find maximum and minimum element in array.
    public static void printMaxMin(int[] arr) {
        if (arr.length == 0)
            return;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("\nMaximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    // Write a java program to to count total number of even and odd elements in an
    // array.
    public static void printEvenOdd(int[] arr) {

        int evenElement = 0;
        int oddElement = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenElement++;
            } else {
                oddElement++;

            }
        }

        System.out.println("\nTotal even elements: " + evenElement);
        System.out.println("Total odd elements: " + oddElement);
    }

    // Write a java program to print the reverse of array.

    public static void printReverseArr(int[] arr) {

        System.out.println("\nArray elements in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Write a java program to insert an element in an array.
    public static void insertInArray(int arr[], int element, int position) {

        if (position < 1 || position > arr.length + 1) {
            System.out.println(
                    "\nInvalid position " + position + ". Position should be between 1 and " + (arr.length + 1));
            return;
        }

        int tempArr[] = new int[arr.length + 1];

        for (int i = 0; i < position - 1; i++) {
            tempArr[i] = arr[i];
        }

        tempArr[position - 1] = element;

        for (int i = position; i <= arr.length; i++) {
            tempArr[i] = arr[i - 1];
        }
        System.out.println("\nArray after inserting " + element + " at position " + position + ": ");
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();
    }

    // Write a java program to delete element from array at specified position.
    public static void deleteInArr(int[] arr, int position) {

        if (position < 1 || position > arr.length) {
            System.out.println("\nInvalid position " + position + ". Position should be between 1 and " + arr.length);
            return;
        }

        int tempArr[] = new int[arr.length - 1];

        for (int i = 0; i < position - 1; i++) {
            tempArr[i] = arr[i];
        }

        for (int i = position - 1; i < tempArr.length; i++) {
            tempArr[i] = arr[i + 1];
        }

        System.out.println("\nArray after deletion at position " + position + ": ");
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();
    }

    // Write a java program to input elements in array and print all unique elements
    // of that array.
    public static void printUnique(int arr[]) {

        // Find the maximum value to size the count array correctly
        int max = 0;
        for (int val : arr)
            if (val > max)
                max = val;

        int countArr[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            countArr[val]++;
        }

        System.out.println("\nUnique elements (appearing exactly once): ");
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Write a java program to merge two sorted array to third array.
    public static void mergeTwoSortedArray(int arr[], int arr2[]) {

        int tempArr[] = new int[arr.length + arr2.length];

        int index = 0;
        int i = 0;
        int j = 0;

        // Merge elements while both arrays have remaining items
        while (i < arr.length && j < arr2.length) {

            if (arr[i] < arr2[j]) {
                tempArr[index++] = arr[i++];
            } else {
                tempArr[index++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr[]
        while (i < arr.length) {
            tempArr[index++] = arr[i++];
        }

        // Copy remaining elements of arr2[]
        while (j < arr2.length) {
            tempArr[index++] = arr2[j++];
        }

        System.out.println("\nMerged two sorted arrays: ");
        for (int k = 0; k < tempArr.length; k++) {
            System.out.print(tempArr[k] + " ");
        }
        System.out.println();

    }

    // Write a java program to reverse the elements of an array.
    public static void reverseArray(int arr[]) {
        int tempArr[] = new int[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            tempArr[index++] = arr[i];
        }

        System.out.println("\nNew reversed array: ");
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();
    }

    // Write a java program to search element in an array.
    public static void searchInArray(int arr[], int element) {

        int elementIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                elementIndex = i;
                break;
            }
        }

        if (elementIndex != -1) {
            System.out.println("\nElement " + element + " found at index " + elementIndex);
        } else {
            System.out.println("\nElement " + element + " not found in array");
        }

    }

    // Write a java program to right rotate array by n position.
    public static void rotateArray(int arr[], int n) {

        if (arr.length == 0)
            return;
        n = n % arr.length;

        if (n == 0) {
            return;
        }

        int tempArr[] = new int[arr.length];
        int index = 0;

        int start = arr.length - n;

        for (int i = start; i < arr.length; i++) {
            tempArr[index++] = arr[i];
        }

        for (int i = 0; i < start; i++) {
            tempArr[index++] = arr[i];
        }

        System.out.println("\nArray after " + n + " Right Rotations: ");
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 5, 4, 8, 2, 4 };

        System.out.println("Original Array: ");
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("\n");

        findSecondLargest(arr);
        countDuplicateElements(arr);
        leftRotate(arr, 5);
        printMaxMin(arr);
        printEvenOdd(arr);
        printReverseArr(arr);
        insertInArray(arr, 99, 4);
        deleteInArr(arr, 3);
        printUnique(arr);

        System.out.println("\n--- Sorting/Merging Section ---");
        mergeTwoSortedArray(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 6, 7, 8, 9, 10 });

        System.out.println("\n--- Utility Section ---");
        reverseArray(arr);
        searchInArray(arr, 5);
        rotateArray(arr, 4);

    }

}