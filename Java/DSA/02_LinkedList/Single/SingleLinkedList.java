/*
=================================================
        SINGLY LINKED LIST IN JAVA
=================================================

Concept:
--------
Linked List is a linear data structure where
elements are stored in nodes.

Each node contains:
1. data
2. next pointer

Unlike arrays:
----------------
- Dynamic size
- Memory allocated dynamically
- Easy insertion/deletion

Node Structure:
----------------

[data | next]

Example:
--------
10 -> 20 -> 30 -> null

head points to first node.

=================================================
        IMPORTANT OPERATIONS
=================================================

1. insertAtBeg(element)
   Insert node at beginning

2. insertAtEnd(element)
   Insert node at end

3. updateElement(key, element)
   Replace existing value

4. removeElement(key)
   Delete node

5. searchElement(key)
   Search node

6. printLinkedList()
   Print all nodes

=================================================
        TIME COMPLEXITY
=================================================

Insert at Beginning -> O(1)
Insert at End       -> O(n)
Delete              -> O(n)
Search              -> O(n)
Update              -> O(n)

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


public class SingleLinkedList {

    // Head points to first node
    Node head;


    /*
    =================================================
            INSERT AT BEGINNING
    =================================================

    Steps:
    ------
    1. Create new node
    2. Point new node to current head
    3. Move head to new node

    Example:
    --------
    Before:
    10 -> 20

    Insert 5

    After:
    5 -> 10 -> 20
    */
    public void insertAtBeg(int element) {

        Node newNode = new Node(element);

        // New node points to current head
        newNode.next = head;

        // Head becomes new node
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
    */
    public void insertAtEnd(int element) {

        Node newNode = new Node(element);

        // If linked list empty
        if (head == null) {

            head = newNode;
            return;
        }

        Node temp = head;

        // Traverse till last node
        while (temp.next != null) {

            temp = temp.next;
        }

        // Connect last node to new node
        temp.next = newNode;
    }


    /*
    =================================================
            UPDATE ELEMENT
    =================================================

    Replaces existing value with new value

    Example:
    --------
    updateElement(10, 100)

    10 becomes 100
    */
    public void updateElement(int key, int element) {

        // Empty linked list
        if (head == null) {

            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {

            // Element found
            if (temp.data == key) {

                temp.data = element;

                System.out.println("Element updated");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Element not found for updation");
    }


    /*
    =================================================
            REMOVE ELEMENT
    =================================================

    Deletes node from linked list

    Cases:
    ------
    1. Empty list
    2. Delete head node
    3. Delete middle/last node
    */
    public void removeElement(int key) {

        // Empty linked list
        if (head == null) {

            System.out.println("Linked List is empty");
            return;
        }

        // If head node needs deletion
        if (head.data == key) {

            head = head.next;

            System.out.println("Element deleted");
            return;
        }

        Node temp = head;
        Node previousNode = null;

        while (temp != null) {

            // Node found
            if (temp.data == key) {

                previousNode.next = temp.next;

                System.out.println("Element deleted");
                return;
            }

            previousNode = temp;
            temp = temp.next;
        }

        System.out.println("Element not found for deletion");
    }


    /*
    =================================================
            SEARCH ELEMENT
    =================================================

    Searches node in linked list

    Returns:
    --------
    true  -> found
    false -> not found
    */
    public boolean searchElement(int key) {

        Node temp = head;

        while (temp != null) {

            // Element found
            if (temp.data == key) {

                System.out.println("Element found in Linked List");
                return true;
            }

            temp = temp.next;
        }

        System.out.println("Element not found in Linked List");
        return false;
    }


    /*
    =================================================
            PRINT LINKED LIST
    =================================================

    Traverses and prints all nodes
    */
    public void printLinkedList() {

        // Empty linked list
        if (head == null) {

            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        System.out.print("Head -> ");

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
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

        SingleLinkedList ll = new SingleLinkedList();


        // Insert elements at end
        ll.insertAtEnd(100);
        ll.insertAtEnd(10);
        ll.insertAtEnd(50);
        ll.insertAtEnd(20);

        // Insert at beginning
        ll.insertAtBeg(30);


        // Search element
        ll.searchElement(20);


        // Remove elements
        ll.removeElement(30);
        ll.removeElement(20);


        // Update element
        ll.updateElement(100, 111);


        // Search updated value
        ll.searchElement(111);


        // Print linked list
        ll.printLinkedList();
    }
}