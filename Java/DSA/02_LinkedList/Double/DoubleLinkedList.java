/*
=================================================
        DOUBLY LINKED LIST IN JAVA
=================================================

Concept:
--------
In Doubly Linked List each node contains:

1. data
2. next pointer
3. prev pointer

Structure:
----------

null <- 10 <-> 20 <-> 30 -> null

Advantages:
------------
1. Forward traversal possible
2. Backward traversal possible
3. Easier deletion compared to singly LL

Disadvantages:
--------------
1. Extra memory for prev pointer
2. More pointer handling
3. Slightly complex implementation

=================================================
        OPERATIONS
=================================================

1. insertAtBeg(element)
2. insertAtEnd(element)
3. remove(key)
4. display()
5. displayReverse()

=================================================
        TIME COMPLEXITY
=================================================

Insert Beginning -> O(1)
Insert End       -> O(n)
Delete           -> O(n)
Traversal        -> O(n)

NOTE:
-----
Using a tail pointer can make
insertAtEnd() -> O(1)

=================================================
*/


// Node class
class Node {

    int data;      // Stores value

    Node next;     // Points to next node
    Node prev;     // Points to previous node


    // Constructor
    Node(int data) {

        this.data = data;

        this.next = null;
        this.prev = null;
    }
}


public class DoubleLinkedList {

    // Head points to first node
    Node head;


    /*
    =================================================
            INSERT AT BEGINNING
    =================================================

    Steps:
    ------
    1. Create new node
    2. New node points to current head
    3. Old head.prev points to new node
    4. Move head to new node

    Example:
    --------
    Before:
    10 <-> 20

    Insert 5

    After:
    5 <-> 10 <-> 20
    */
    public void insertAtBeg(int element) {

        Node newNode = new Node(element);

        // Empty linked list
        if (head == null) {

            head = newNode;
            return;
        }

        // New node points to old head
        newNode.next = head;

        // Old head points back to new node
        head.prev = newNode;

        // Move head to new node
        head = newNode;
    }


    /*
    =================================================
            INSERT AT END
    =================================================

    Steps:
    ------
    1. Create new node
    2. Traverse till last node
    3. Connect last node to new node
    4. New node points back to last node
    */
    public void insertAtEnd(int element) {

        Node newNode = new Node(element);

        // Empty linked list
        if (head == null) {

            head = newNode;
            return;
        }

        Node temp = head;

        // Traverse till last node
        while (temp.next != null) {

            temp = temp.next;
        }

        // Last node points to new node
        temp.next = newNode;

        // New node points back to last node
        newNode.prev = temp;
    }


    /*
    =================================================
                REMOVE NODE
    =================================================

    Cases:
    ------
    1. Empty linked list
    2. Delete head node
    3. Delete middle node
    4. Delete last node
    */
    public void remove(int key) {

        // Empty linked list
        if (head == null) {

            System.out.println("Linked List is empty");
            return;
        }


        /*
        =========================================
                DELETE HEAD NODE
        =========================================
        */
        if (head.data == key) {

            // Single node case
            if (head.next == null) {

                head = null;

                System.out.println("Element deleted");
                return;
            }

            // Move head forward
            head = head.next;

            // Remove backward connection
            head.prev = null;

            System.out.println("Element deleted");
            return;
        }


        /*
        =========================================
            DELETE MIDDLE/LAST NODE
        =========================================
        */
        Node temp = head;

        while (temp != null) {

            // Node found
            if (temp.data == key) {

                Node previousNode = temp.prev;
                Node nextNode = temp.next;

                // Connect previous node to next node
                previousNode.next = nextNode;

                // If next node exists
                if (nextNode != null) {

                    nextNode.prev = previousNode;
                }

                System.out.println("Element deleted");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Element not found");
    }


    /*
    =================================================
                DISPLAY FORWARD
    =================================================

    Traverses from head to last node
    */
    public void display() {

        // Empty linked list
        if (head == null) {

            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        System.out.print("Head -> ");

        while (temp != null) {

            System.out.print(temp.data + " <-> ");

            temp = temp.next;
        }

        System.out.println("null");
    }


    /*
    =================================================
                DISPLAY REVERSE
    =================================================

    Steps:
    ------
    1. Move to last node
    2. Traverse backward using prev
    */
    public void displayReverse() {

        // Empty linked list
        if (head == null) {

            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        // Move to last node
        while (temp.next != null) {

            temp = temp.next;
        }

        System.out.print("Tail -> ");

        // Traverse backward
        while (temp != null) {

            System.out.print(temp.data + " <-> ");

            temp = temp.prev;
        }

        System.out.println("null");
    }



    /*
    =================================================
                    MAIN METHOD
    =================================================

    Program execution starts here
    */
    public static void main(String[] args) {

        DoubleLinkedList ll = new DoubleLinkedList();


        // Insert at beginning
        ll.insertAtBeg(10);
        ll.insertAtBeg(5);

        // Insert at end
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);


        // Display forward
        ll.display();


        // Display backward
        ll.displayReverse();


        // Delete elements
        ll.remove(5);
        ll.remove(20);
        ll.remove(50);
        ll.remove(30);


        // Display after deletion
        ll.display();
    }
}