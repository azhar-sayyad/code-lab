package DSAlgo.CollectionFramework.LinkedList;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListInsretion {
    static Node head;

    LinkedListInsretion() {
        head = null;
    }

    void printList() {
        Node h = head;
        while (h != null) {
            System.out.println(h.data + " ");
            h = h.next;
        }
    }

    void insertAtBeg(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    void insertAtEnd(int data) {
        Node h = head;
        if (h == null) {
            Node temp = new Node(data);
            temp.next = null;
            head = temp;
        } else {
            while (h.next != null) {
                h = h.next;
            }
            Node temp = new Node(data);
            temp.next = null;
            h.next = temp;
        }
    }
}