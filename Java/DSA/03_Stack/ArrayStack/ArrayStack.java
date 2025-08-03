/*
========================================
         STACK USING ARRAY
========================================

Concept:
--------
Stack follows LIFO:
Last In First Out

Example:
--------
Push -> 10 20 30

Top = 30

Pop:
30 removed first

Why Array Stack?
----------------
- Simple implementation
- Fast operations
- Memory efficient

Disadvantage:
-------------
- Fixed size
- Can cause Stack Overflow

Important Variables:
--------------------
1. arr[]
   Stores stack elements

2. top
   Tracks top element index

3. size
   Maximum capacity of stack

Stack Visualization:
--------------------

Index:  0   1   2
Value: 10  20  30
               ↑
              top

Important Operations:
---------------------
1. push(data)
   Insert element at top

2. pop()
   Remove top element

3. peek()
   View top element

4. isEmpty()
   Checks stack empty or not

5. display()
   Prints stack elements

Time Complexity:
----------------
Push  -> O(1)
Pop   -> O(1)
Peek  -> O(1)

========================================
*/


public class ArrayStack {

    // Array to store stack elements
    int arr[];

    // Maximum size of stack
    int size;

    // Top index of stack
    int top;


    /*
    ============================
            CONSTRUCTOR
    ============================

    Initializes:
    - Array
    - Size
    - Top pointer
    */
    ArrayStack(int size) {

        this.arr = new int[size];
        this.size = size;

        // Stack initially empty
        this.top = -1;
    }


    /*
    ============================
            PUSH OPERATION
    ============================

    Adds element at top

    Steps:
    ------
    1. Check stack overflow
    2. Increment top
    3. Insert value
    */
    public void push(int data) {

        // Stack full
        if (top == size - 1) {

            System.out.println("Stack Overflow");
            return;
        }

        // Move top forward
        top++;

        // Insert element
        arr[top] = data;
    }


    /*
    ============================
            POP OPERATION
    ============================

    Removes top element

    Steps:
    ------
    1. Check stack empty
    2. Store top value
    3. Decrement top
    4. Return removed value
    */
    public int pop() {

        // Stack empty
        if (top == -1) {

            System.out.println("Stack is empty");
            return -1;
        }

        // Store top value
        int value = arr[top];

        // Remove element logically
        top--;

        return value;
    }


    /*
    ============================
            PEEK OPERATION
    ============================

    Returns top element
    without removing it
    */
    public int peek() {

        if (top == -1) {

            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }


    /*
    ============================
            CHECK EMPTY
    ============================

    Returns true if stack empty
    */
    public boolean isEmpty() {

        return top == -1;

        // OR
        // return top == -1 ? true : false;
    }


    /*
    ============================
            DISPLAY STACK
    ============================

    Prints elements from
    top to bottom
    */
    public void display() {

        // Empty stack
        if (top == -1) {

            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top -> ");

        for (int i = top; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }



    /*
    ============================
              MAIN METHOD
    ============================

    Program execution starts here
    */
    public static void main(String[] args) {

        // Create stack of size 10
        ArrayStack stack = new ArrayStack(10);


        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);


        // Pop top element
        System.out.println("Popped: " + stack.pop());


        // Peek top element
        System.out.println("Peek: " + stack.peek());


        // Check stack empty
        System.out.println("Is Empty: " + stack.isEmpty());


        // Display stack
        stack.display();
    }
}