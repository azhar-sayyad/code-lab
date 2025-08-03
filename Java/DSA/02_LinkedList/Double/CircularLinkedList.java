/*
=========================================================
    DOUBLY CIRCULAR LINKED LIST IN JAVA
=========================================================

Concept:
--------
This Linked List has:

1. next pointer
2. prev pointer
3. Circular connection

Meaning:
--------
- Last node points to head
- Head.prev points to last node

Structure:
----------

        ┌──────────────────────┐
        ↓                      │
20 <-> 40 <-> 50 <-> 100 <-> 120
↑                                ↓
└────────────────────────────────┘

Important:
----------
head.prev = last node
last.next = head

=========================================================
                ADVANTAGES
=========================================================

1. Forward traversal
2. Backward traversal
3. Circular traversal
4. Efficient insertion/deletion

Used In:
--------
- Browser tabs
- Music playlists
- OS scheduling
- Multiplayer turn systems

=========================================================
                TIME COMPLEXITY
=========================================================

Insert Beginning -> O(1)
Insert End       -> O(1)
Delete           -> O(n)
Traversal        -> O(n)

=========================================================
                IMPORTANT POINTER LOGIC
=========================================================

Suppose:

head = 20
tail = 100

Connections:
------------
head.prev = tail
tail.next = head

=========================================================
*/


// Node class
class Node {

    int data;

    Node next;
    Node prev;

    // Constructor
    Node(int data) {

        this.data = data;

        this.next = null;
        this.prev = null;
    }
}


public class CircularLinkedList {

    // Points to first node
    Node head;


    /*
    =====================================================
                INSERT AT BEGINNING
    =====================================================

    Pointer Flow:
    -------------

    BEFORE:

    tail <-> head <-> node2

    AFTER:

    tail <-> newNode <-> head <-> node2


    IMPORTANT UNDERSTANDING:
    ------------------------

    head.prev = tail

    So:
    ----
    head.prev.next means:
    tail.next

    Therefore:
    -----------
    head.prev.next = newNode
    means:
    tail.next = newNode

    =====================================================
    */
    public void insertAtBeg(int data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {

            head = newNode;

            head.next = newNode;
            head.prev = newNode;

            return;
        }

        /*
        ============================================
            STEP BY STEP POINTER CONNECTION
        ============================================

        OLD:
        ----
        tail.next = head
        head.prev = tail

        NEW:
        ----
        tail.next = newNode
        newNode.prev = tail

        newNode.next = head
        head.prev = newNode

        move head to newNode
        */

        // tail.next = newNode
        head.prev.next = newNode;

        // newNode.prev = tail
        newNode.prev = head.prev;

        // newNode.next = old head
        newNode.next = head;

        // old head.prev = newNode
        head.prev = newNode;

        // move head to new node
        head = newNode;
    }


    /*
    =====================================================
                INSERT AT END
    =====================================================

    Logic:
    ------
    Insert node between:
    tail and head

    Since:
    -------
    head.prev = tail

    We can insert in O(1)
    */
    public void insertAtEnd(int data) {

        Node newNode = new Node(data);

        // Empty list
        if (head == null) {

            head = newNode;

            head.prev = newNode;
            head.next = newNode;

            return;
        }

        /*
        BEFORE:
        -------
        tail <-> head

        AFTER:
        ------
        oldTail <-> newNode <-> head
        */

        // oldTail.next = newNode
        head.prev.next = newNode;

        // newNode.prev = oldTail
        newNode.prev = head.prev;

        // newNode.next = head
        newNode.next = head;

        // head.prev = newNode
        head.prev = newNode;
    }


    /*
    =====================================================
                    DELETE NODE
    =====================================================

    Cases:
    ------
    1. Empty list
    2. Delete head
    3. Delete middle
    4. Delete tail
    */
    public void remove(int key) {

        // Empty list
        if (head == null)
            return;


        /*
        ============================================
                DELETE HEAD NODE
        ============================================
        */
        if (head.data == key) {

            // Single node case
            if (head.next == head) {

                head = null;
                return;
            }

            /*
            Remove head:

            tail.next = head.next
            head.next.prev = tail
            move head forward
            */

            head.prev.next = head.next;

            head.next.prev = head.prev;

            head = head.next;

            return;
        }


        /*
        ============================================
            DELETE MIDDLE/LAST NODE
        ============================================
        */
        Node temp = head.next;

        while (temp != head) {

            if (temp.data == key) {

                /*
                Skip current node
                */

                temp.prev.next = temp.next;

                temp.next.prev = temp.prev;

                return;
            }

            temp = temp.next;
        }
    }


    /*
    =====================================================
                DISPLAY FORWARD
    =====================================================
    */
    void display() {

        if (head == null) {

            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        System.out.print("Head -> ");

        while (temp.next != head) {

            System.out.print(temp.data + " <-> ");

            temp = temp.next;
        }

        System.out.println(temp.data + " -> Head");
    }


    /*
    =====================================================
                DISPLAY REVERSE
    =====================================================

    Traverse backward using prev
    */
    void displayRev() {

        if (head == null) {

            System.out.println("List is empty");
            return;
        }

        // tail node
        Node temp = head.prev;

        System.out.print("Tail -> ");

        while (temp != head) {

            System.out.print(temp.data + " <-> ");

            temp = temp.prev;
        }

        System.out.println(temp.data + " -> Tail");
    }


    /*
    =====================================================
                CYCLE CHECK (FLOYD)
    =====================================================

    Uses:
    -----
    Slow & Fast Pointer

    slow = moves 1 step
    fast = moves 2 steps

    If they meet:
    -------------
    Cycle exists
    */
    void Circular() {

        if (head == null)
            return;

        Node slow = head;
        Node fast = head;

        while (fast != null &&
               fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;

            // Cycle found
            if (slow == fast) {

                System.out.println(
                    "Cycle detected at node: "
                    + slow.data
                );

                return;
            }
        }

        System.out.println("No cycle found");
    }



    /*
    =====================================================
                    MAIN METHOD
    =====================================================
    */
    public static void main(String[] args) {

        CircularLinkedList ll =
                new CircularLinkedList();


        // Insert elements
        ll.insertAtEnd(130);

        ll.insertAtBeg(100);
        ll.insertAtBeg(50);
        ll.insertAtBeg(40);
        ll.insertAtBeg(20);

        ll.insertAtEnd(120);
        ll.insertAtEnd(112);


        // Forward display
        ll.display();


        // Cycle check
        ll.Circular();


        // Delete nodes
        ll.remove(50);
        ll.remove(40);
        ll.remove(130);
        ll.remove(112);


        // Reverse display
        ll.displayRev();
    }
}