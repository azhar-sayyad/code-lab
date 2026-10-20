/*
=========================================================
                CHARACTER ARRAY IN JAVA
=========================================================

Concept:
--------
Character Array stores multiple characters
in contiguous memory locations.

Data Type:
----------
char

Example:
--------

Index:   0   1   2   3   4
Value:   H   E   L   L   O

Character arrays are commonly used for:
---------------------------------------
1. String manipulation
2. Password checking
3. Parsing
4. Reversing text
5. Character frequency

=========================================================
                    IMPORTANT NOTE
=========================================================

Difference Between:
-------------------

String:
-------
- Immutable
- Built-in methods
- Easier to use

char[]:
-------
- Mutable
- Faster modifications
- Used in DSA/interviews

=========================================================
                    OPERATIONS
=========================================================

1. insert()
2. display()
3. search()
4. update()
5. delete()
6. reverse()
7. countVowels()
8. countConsonants()
9. toUpperCase()
10. toLowerCase()

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


public class CharArray {

    // Character array
    char arr[];

    // Current size
    int size;



    /*
    =====================================================
                        CONSTRUCTOR
    =====================================================
    */
    CharArray(int capacity) {

        arr = new char[capacity];

        size = 0;
    }



    /*
    =====================================================
                        INSERT
    =====================================================

    Inserts character at end
    */
    public void insert(char ch) {

        if (size == arr.length) {

            System.out.println("Character Array is full");
            return;
        }

        arr[size] = ch;

        size++;
    }



    /*
    =====================================================
                        DISPLAY
    =====================================================
    */
    public void display() {

        if (size == 0) {

            System.out.println("Character Array is empty");
            return;
        }

        System.out.print("Characters: ");

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
    public int search(char key) {

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

    Updates old character
    */
    public void update(char oldChar,
                       char newChar) {

        int index = search(oldChar);

        if (index == -1) {

            System.out.println(
                "Character not found"
            );

            return;
        }

        arr[index] = newChar;

        System.out.println(
            "Character updated successfully"
        );
    }



    /*
    =====================================================
                        DELETE
    =====================================================

    Deletes character by shifting
    */
    public void delete(char key) {

        int index = search(key);

        if (index == -1) {

            System.out.println(
                "Character not found"
            );

            return;
        }

        // Shift left
        for (int i = index;i < size - 1; i++) {

            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println(
            "Character deleted successfully"
        );
    }



    /*
    =====================================================
                        REVERSE
    =====================================================

    Reverse using two pointers
    */
    public void reverse() {

        int left = 0;
        int right = size - 1;

        while (left < right) {

            char temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(
            "Character Array reversed"
        );
    }



    /*
    =====================================================
                    COUNT VOWELS
    =====================================================
    */
    public int countVowels() {

        int count = 0;

        for (int i = 0; i < size; i++) {

            char ch =
                Character.toLowerCase(arr[i]);

            if (ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u') {

                count++;
            }
        }

        return count;
    }



    /*
    =====================================================
                COUNT CONSONANTS
    =====================================================
    */
    public int countConsonants() {

        int count = 0;

        for (int i = 0; i < size; i++) {

            char ch =
                Character.toLowerCase(arr[i]);

            if (Character.isLetter(ch) &&
               !(ch == 'a' ||
                 ch == 'e' ||
                 ch == 'i' ||
                 ch == 'o' ||
                 ch == 'u')) {

                count++;
            }
        }

        return count;
    }



    /*
    =====================================================
                    TO UPPERCASE
    =====================================================
    */
    public void toUpperCase() {

        for (int i = 0; i < size; i++) {

            arr[i] =
                Character.toUpperCase(arr[i]);
        }

        System.out.println(
            "Converted to Uppercase"
        );
    }



    /*
    =====================================================
                    TO LOWERCASE
    =====================================================
    */
    public void toLowerCase() {

        for (int i = 0; i < size; i++) {

            arr[i] =
                Character.toLowerCase(arr[i]);
        }

        System.out.println(
            "Converted to Lowercase"
        );
    }



    /*
    =====================================================
                    MAIN METHOD
    =====================================================
    */
    public static void main(String args[]) {

        // Create object
        CharArray charArray =
                new CharArray(20);


        /*
        ==============================================
                    INSERT CHARACTERS
        ==============================================
        */
        charArray.insert('H');
        charArray.insert('e');
        charArray.insert('l');
        charArray.insert('l');
        charArray.insert('o');


        /*
        ==============================================
                    DISPLAY
        ==============================================
        */
        charArray.display();


        /*
        ==============================================
                    SEARCH
        ==============================================
        */
        int index = charArray.search('e');

        if (index != -1) {

            System.out.println(
                "'e' found at index: "
                + index
            );
        }


        /*
        ==============================================
                    UPDATE
        ==============================================
        */
        charArray.update('H', 'Y');

        charArray.display();


        /*
        ==============================================
                    DELETE
        ==============================================
        */
        charArray.delete('l');

        charArray.display();


        /*
        ==============================================
                    REVERSE
        ==============================================
        */
        charArray.reverse();

        charArray.display();


        /*
        ==============================================
                    COUNT VOWELS
        ==============================================
        */
        System.out.println(
            "Vowels: "
            + charArray.countVowels()
        );


        /*
        ==============================================
                COUNT CONSONANTS
        ==============================================
        */
        System.out.println(
            "Consonants: "
            + charArray.countConsonants()
        );


        /*
        ==============================================
                    TO UPPERCASE
        ==============================================
        */
        charArray.toUpperCase();

        charArray.display();


        /*
        ==============================================
                    TO LOWERCASE
        ==============================================
        */
        charArray.toLowerCase();

        charArray.display();
    }
}