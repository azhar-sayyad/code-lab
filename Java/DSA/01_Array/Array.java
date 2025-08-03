/*
=========================================================
                    ARRAY IN JAVA
=========================================================

Concept:
--------
Array is a linear data structure used to store
multiple elements of same data type in
contiguous memory locations.

Example:
--------

Index:   0   1   2   3   4
Value:  10  20  30  40  50

Important:
----------
- Fixed size
- Index starts from 0
- Fast random access

=========================================================
                    ADVANTAGES
=========================================================

1. Fast access using index -> O(1)
2. Easy traversal
3. Cache friendly
4. Memory efficient

=========================================================
                    DISADVANTAGES
=========================================================

1. Fixed size
2. Costly insertion/deletion
3. Same data type only

=========================================================
                    OPERATIONS
=========================================================

1. insert()
2. display()
3. search()
4. update()
5. delete()
6. reverse()
7. findMax()
8. findMin()
9. sum()
10. average()

=========================================================
                    TIME COMPLEXITY
=========================================================

Access      -> O(1)
Traversal   -> O(n)
Search      -> O(n)
Insertion   -> O(n)
Deletion    -> O(n)

=========================================================
*/


public class Array {

    // Array declaration
    int arr[];

    // Current number of elements
    int size;



    /*
    =====================================================
                        CONSTRUCTOR
    =====================================================

    Creates array with given capacity
    */
    Array(int capacity) {

        arr = new int[capacity];

        size = 0;
    }



    /*
    =====================================================
                        INSERT
    =====================================================

    Inserts element at end
    */
    public void insert(int element) {

        // Check array full
        if (size == arr.length) {

            System.out.println("Array is full");
            return;
        }

        arr[size] = element;

        size++;
    }



    /*
    =====================================================
                        DISPLAY
    =====================================================

    Prints array elements
    */
    public void display() {

        if (size == 0) {

            System.out.println("Array is empty");
            return;
        }

        System.out.print("Array: ");

        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }



    /*
    =====================================================
                        SEARCH
    =====================================================

    Returns index if found
    otherwise returns -1
    */
    public int search(int key) {

        for (int i = 0; i < size; i++) {

            if (arr[i] == key) {

                return i;
            }
        }

        return -1;
    }



    /*
    =====================================================
                        UPDATE
    =====================================================

    Updates old value with new value
    */
    public void update(int oldValue, int newValue) {

        int index = search(oldValue);

        if (index == -1) {

            System.out.println("Element not found");
            return;
        }

        arr[index] = newValue;

        System.out.println(
            "Element updated successfully"
        );
    }



    /*
    =====================================================
                        DELETE
    =====================================================

    Deletes element by shifting
    elements to left
    */
    public void delete(int key) {

        int index = search(key);

        if (index == -1) {

            System.out.println("Element not found");
            return;
        }

        // Shift elements left
        for (int i = index; i < size - 1; i++) {

            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println(
            "Element deleted successfully"
        );
    }



    /*
    =====================================================
                        REVERSE
    =====================================================

    Reverses array using two pointers
    */
    public void reverse() {

        int left = 0;
        int right = size - 1;

        while (left < right) {

            // Swap
            int temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Array reversed");
    }



    /*
    =====================================================
                        FIND MAX
    =====================================================

    Returns maximum element
    */
    public int findMax() {

        if (size == 0)
            return -1;

        int max = arr[0];

        for (int i = 1; i < size; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }

        return max;
    }



    /*
    =====================================================
                        FIND MIN
    =====================================================

    Returns minimum element
    */
    public int findMin() {

        if (size == 0)
            return -1;

        int min = arr[0];

        for (int i = 1; i < size; i++) {

            if (arr[i] < min) {

                min = arr[i];
            }
        }

        return min;
    }



    /*
    =====================================================
                        SUM
    =====================================================

    Returns sum of array
    */
    public int sum() {

        int total = 0;

        for (int i = 0; i < size; i++) {

            total += arr[i];
        }

        return total;
    }



    /*
    =====================================================
                        AVERAGE
    =====================================================

    Returns average of array
    */
    public double average() {

        if (size == 0)
            return 0;

        return (double) sum() / size;
    }



    /*
    =====================================================
                        MAIN METHOD
    =====================================================
    */
    public static void main(String args[]) {

        // Create array object
        Array array = new Array(10);


        /*
        ==============================================
                    INSERT ELEMENTS
        ==============================================
        */
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);


        /*
        ==============================================
                    DISPLAY ARRAY
        ==============================================
        */
        array.display();


        /*
        ==============================================
                    SEARCH ELEMENT
        ==============================================
        */
        int index = array.search(30);

        if (index != -1) {

            System.out.println(
                "30 found at index: " + index
            );
        } else {

            System.out.println("30 not found");
        }


        /*
        ==============================================
                    UPDATE ELEMENT
        ==============================================
        */
        array.update(30, 300);

        array.display();


        /*
        ==============================================
                    DELETE ELEMENT
        ==============================================
        */
        array.delete(20);

        array.display();


        /*
        ==============================================
                    REVERSE ARRAY
        ==============================================
        */
        array.reverse();

        array.display();


        /*
        ==============================================
                    FIND MAX
        ==============================================
        */
        System.out.println(
            "Maximum Element: "
            + array.findMax()
        );


        /*
        ==============================================
                    FIND MIN
        ==============================================
        */
        System.out.println(
            "Minimum Element: "
            + array.findMin()
        );


        /*
        ==============================================
                    SUM OF ARRAY
        ==============================================
        */
        System.out.println(
            "Sum: " + array.sum()
        );


        /*
        ==============================================
                    AVERAGE
        ==============================================
        */
        System.out.println(
            "Average: "
            + array.average()
        );
    }
}