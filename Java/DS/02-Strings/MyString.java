/**
 * A custom String implementation using dynamic arrays
 * Provides basic string operations with automatic resizing
 */
public class MyString{
    private char[] arr;
    private int size;

    /**
     * Default constructor with initial capacity of 10
     */
    public MyString(){
        this(10);
    }

    /**
     * Constructor with custom initial capacity
     * @param capacity the initial capacity of the character array
     */
    public MyString(int capacity){
        this.arr = new char[capacity];
        this.size = 0;
    }


    /**
     * Constructor that creates MyString from a Java String
     * @param str the string to initialize with
     */
    public MyString(String str){
        this.arr = new char[str.length()];
        this.size = str.length();

        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }
    }

    /**
     * Adds a single character to the end of the string
     * Automatically resizes if capacity is reached
     * @param val the character to add
     */
    public void add(char val){
        if(size == arr.length){
            resize();
        }
        arr[size++] = val;
    }

    /**
     * Adds a string to the end of this MyString
     * @param str the string to append
     */
    public void add(String str){
        for(int i = 0; i < str.length(); i++){
            add(str.charAt(i));
        }
    }

    /**
     * Retrieves the character at the specified index
     * @param index the index of the character
     * @return the character at the given index
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public char get(int index){
        this.checkIndex(index);
        return arr[index];
    }

    /**
     * Removes the character at the specified index
     * Shifts remaining characters to the left
     * @param index the index of the character to remove
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public void remove(int index){
        this.checkIndex(index);
        for(int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void update(int index, char val){
        this.checkIndex(index);
        arr[index] = val;
    }

    /**
     * Returns the length of the string (number of characters)
     * @return the length of the string
     */
    public int length(){
        return size;
    }

    /**
     * Checks if the string is empty
     * @return true if empty, false otherwise
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * Returns a substring from the specified start index to end index
     * @param start the starting index (inclusive)
     * @param end the ending index (exclusive)
     * @return a new MyString containing the substring
     * @throws IndexOutOfBoundsException if indices are out of bounds
     */
    public MyString substring(int start, int end){
        if(start < 0 || end > size || start > end){
            throw new IndexOutOfBoundsException("Invalid substring indices");
        }

        MyString result = new MyString(end - start);
        for(int i = start; i < end; i++){
            result.add(arr[i]);
        }
        return result;
    }

    /**
     * Concatenates this string with another MyString
     * @param other the MyString to concatenate
     * @return a new MyString containing the concatenated result
     */
    public MyString concat(MyString other){
        MyString result = new MyString(this.size + other.size);
        // Add current string
        for(int i = 0; i < this.size; i++){
            result.add(this.arr[i]);
        }
        // Add other string
        for(int i = 0; i < other.size; i++){
            result.add(other.arr[i]);
        }
        return result;
    }

    /**
     * Converts this MyString to a Java String
     * @return the string representation
     */
    @Override
    public String toString(){
        return new String(arr, 0, size);
    }

    /**
     * Compares this MyString with another object for equality
     * @param obj the object to compare with
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        MyString other = (MyString) obj;
        if(this.size != other.size) return false;

        for(int i = 0; i < size; i++){
            if(this.arr[i] != other.arr[i]) return false;
        }
        return true;
    }

    /**
     * Returns a hash code value for this MyString
     * @return the hash code
     */
    @Override
    public int hashCode(){
        int hash = 0;
        for(int i = 0; i < size; i++){
            hash = 31 * hash + arr[i];
        }
        return hash;
    }

    /**
     * Resizes the internal array when capacity is reached
     * Doubles the current capacity
     */
    private void resize(){
        char newArr[] = new char[size * 2];  // Double the current size
        for(int i = 0; i < size; i++){  // Fixed: was i < arr.length
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