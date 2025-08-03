/*
=================================================
         CIRCULAR LINKED LIST IN JAVA
=================================================

Concept:
--------
In Circular Linked List:

- Last node points back to head
- No node points to null
- Traversal becomes circular

Structure:
----------

10 -> 20 -> 30
^             |
|_____________|

Important Point:
----------------
LastNode.next = head

=================================================
        ADVANTAGES
=================================================

1. Continuous traversal possible
2. Efficient for round-robin scheduling
3. Used in:
   - CPU scheduling
   - Multiplayer turn systems
   - Music playlists

=================================================
        OPERATIONS
=================================================

1. insertAtBeg(data)
2. insertAtEnd(data)
3. delete(key)
4. display()

=================================================
        TIME COMPLEXITY
=================================================

Insert Beginning -> O(n)
Insert End       -> O(n)
Delete           -> O(n)
Traversal        -> O(n)

NOTE:
-----
Using a tail pointer can optimize
insert operations to O(1)

=================================================
*/


// Node class
class Node {

    int data;      // Stores value
    Node next;     // Points to next node

    // Constructor
    Node(int data) {

        this.data = data;
        this.next = null;
    }
}


public class CircularLinkedList {

    // Head points to first node
    Node head;


    /*
    =================================================
            INSERT AT BEGINNING
    =================================================

    Steps:
    ------
    1. Create new node
    2. Find last node
    3. Last node points to new node
    4. New node points to old head
    5. Move head to new node

    Example:
    --------
    Before:
    10 -> 20 -> 30

    Insert 5

    After:
    5 -> 10 -> 20 -> 30
    */
    public void insertAtBeg(int data) {

        Node newNode = new Node(data);

        // Empty linked list
        if (head == null) {

            head = newNode;

            // Circular connection
            newNode.next = head;

            return;
        }

        Node temp = head;

        // Find last node
        while (temp.next != head) {

            temp = temp.next;
        }

        // Last node points to new node
        temp.next = newNode;

        // New node points to old head
        newNode.next = head;

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
    2. Find last node
    3. Connect last node to new node
    4. New node points to head
    */
    public void insertAtEnd(int data) {

        Node newNode = new Node(data);

        // Empty linked list
        if (head == null) {

            head = newNode;

            // Circular connection
            head.next = newNode;

            return;
        }

        Node temp = head;

        // Traverse till last node
        while (temp.next != head) {

            temp = temp.next;
        }

        // Connect last node to new node
        temp.next = newNode;

        // New node points back to head
        newNode.next = head;
    }


    /*
    =================================================
                DELETE NODE
    =================================================

    Cases:
    ------
    1. Empty linked list
    2. Delete beginning node
    3. Delete middle node
    4. Delete last node
    */
    public void delete(int key) {

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

            Node temp = head;

            // Single node case
            if (head.next == head) {

                head = null;

                System.out.println("Element deleted");
                return;
            }

            // Find last node
            while (temp.next != head) {

                temp = temp.next;
            }

            // Move head forward
            head = head.next;

            // Last node points to new head
            temp.next = head;

            System.out.println("Element deleted");
            return;
        }


        /*
        =========================================
              DELETE MIDDLE/LAST NODE
        =========================================
        */
        Node temp = head;
        Node prev = null;

        while (temp.next != head) {

            // Node found
            if (temp.data == key) {

                prev.next = temp.next;

                System.out.println("Element deleted");
                return;
            }

            prev = temp;
            temp = temp.next;
        }

        /*
        =========================================
              DELETE LAST NODE
        =========================================
        */
        if (temp.data == key) {

            prev.next = head;

            System.out.println("Element deleted");
            return;
        }

        System.out.println("Element not found");
    }


    /*
    =================================================
                DISPLAY LINKED LIST
    =================================================

    Traverses circular linked list

    IMPORTANT:
    ----------
    We stop traversal when temp
    again reaches head.
    */
    public void display() {

        // Empty linked list
        if (head == null) {

            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        System.out.print("Head -> ");

        // Traverse till last node
        while (temp.next != head) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        // Print last node
        System.out.print(temp.data);

        System.out.println(" -> Head");
    }



    /*
    =================================================
                    MAIN METHOD
    =================================================

    Program execution starts here
    */
    public static void main(String[] args) {

        CircularLinkedList ll = new CircularLinkedList();


        // Insert at end
        ll.insertAtEnd(90);

        // Insert at beginning
        ll.insertAtBeg(10);
        ll.insertAtBeg(20);
        ll.insertAtBeg(30);
        ll.insertAtBeg(40);

        // Insert at end
        ll.insertAtEnd(100);


        // Display linked list
        ll.display();


        // Delete elements
        ll.delete(40);
        ll.delete(10);
        ll.delete(100);


        // Display after deletion
        ll.display();
    }
}