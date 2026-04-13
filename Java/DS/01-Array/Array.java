public class Array{

    private int[] arr;
    private int size;

    /**
     * Default constructor initializes array with capacity of 2
     */
    public Array(){
        this(2);
    }

    /**
     * Constructor with custom initial capacity
     * @param capacity the initial capacity of the array
     */
    public Array(int capacity){
        this.arr = new int[capacity];
        this.size = 0;
    }

    /**
     * Adds a value to the end of the array
     * Automatically resizes if capacity is reached
     * @param value the value to add
     */
    public void add(int value){
        if(size == arr.length){
            resize();
        }
        arr[size++] = value;
    }

    /**
     * Retrieves the element at the specified index
     * @param index the index of the element
     * @return the element at the given index
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public int get(int index) {
        this.checkIndex(index);
        return arr[index];
    }

    /**
     * Removes the element at the specified index
     * Shifts remaining elements to the left
     * @param index the index of the element to remove
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public void remove(int index) {
        this.checkIndex(index);

        int value = arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    /**
     * Updates the element at the specified index with a new value
     * @param index the index of the element to update
     * @param value the new value
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public void update(int index, int value){
        this.checkIndex(index);
        arr[index] = value;
    }

    /**
     * Searches for the first occurrence of a value in the array
     * @param value the value to search for
     * @return the index of the value, or -1 if not found
     */
    public int indexOf(int value){
        for(int i = 0; i < size; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    /**
     * Prints all elements in the array
     */
    public void print(){
        for(int i=0; i< size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    /**
     * Returns the current number of elements in the array
     * @return the number of elements
     */
    public int size(){
        return size;
    }

    /**
     * Checks if the array is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * Clears all elements from the array and resets to initial capacity
     */
    public void clear(){
        this.arr = new int[2];
        this.size = 0;
    }

    private void resize(){
        int newArr[] = new int[arr.length * 2];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    /**
     * Validates if the index is within bounds
     * @param index the index to check
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}