/*
========================================
        STACK USING LINKED LIST
========================================

Concept:
--------
Stack follows LIFO principle:
Last In First Out

Example:
--------
Push: 10 20 30
Top -> 30

Pop:
30 removed first

Why Linked List for Stack?
--------------------------
- Dynamic size
- No fixed capacity like arrays
- Push and Pop are O(1)

Important Operations:
---------------------
1. push(data)
   Adds element at top

2. pop()
   Removes top element

3. peek()
   Returns top element without removing

4. isEmpty()
   Checks stack empty or not

5. display()
   Prints stack elements

Time Complexity:
----------------
Push  -> O(1)
Pop   -> O(1)
Peek  -> O(1)

Memory:
-------
Each node stores:
- data
- next pointer

========================================
*/


// Node class for Linked List
class Node {

    int data;      // Stores value
    Node next;     // Points to next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedListStack {

    // Top points to top element of stack
    Node top;


    /*
    ============================
            PUSH OPERATION
    ============================

    Adds element at top of stack

    Steps:
    ------
    1. Create new node
    2. Point new node to current top
    3. Move top to new node
    */
    public void push(int data) {

        Node newNode = new Node(data);

        // New node points to old top
        newNode.next = top;

        // Top becomes new node
        top = newNode;
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
    3. Move top to next node
    4. Return removed value
    */
    public int pop() {

        // Stack empty
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        // Store top value
        int value = top.data;

        // Move top forward
        top = top.next;

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

        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }


    /*
    ============================
          CHECK EMPTY
    ============================

    Returns true if stack empty
    */
    public boolean isEmpty() {

        return top == null;

        // OR
        // return top == null ? true : false;
    }


    /*
    ============================
            DISPLAY STACK
    ============================

    Traverses linked list
    from top to bottom
    */
    public void display() {

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        System.out.print("Top -> ");

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;
        }

        System.out.println();
    }



    /*
    ============================
              MAIN METHOD
    ============================

    Execution starts here
    */
    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Remove top element
        System.out.println("Popped: " + stack.pop());

        // Show top element
        System.out.println("Peek: " + stack.peek());

        // Check stack empty
        System.out.println("Is Empty: " + stack.isEmpty());

        // Display stack
        stack.display();
    }
}