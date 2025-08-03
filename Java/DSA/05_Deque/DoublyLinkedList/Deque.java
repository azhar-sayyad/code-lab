class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Deque{
    Node front;
    Node rear;

    public void enqueueFront(int data){
        Node newNode = new Node(data);

        if(rear == null){
            rear = newNode;
            front = newNode;
            return;
        }
        newNode.next = front;
        front.prev = newNode;
        front = newNode;
    }

    public void enqueueRear(int data){
        Node newNode = new Node(data);

        if(front == null){
            front = newNode;
            rear = newNode;
            return;
        }
        newNode.prev = rear;
        rear.next = newNode;
        rear = newNode;        
    }

    public void dequeueFront(){
        if(isEmpty()){
            println("deque is empty");
            return;
        }

        if(front == rear){
            front = rear = null;
        }else{
            front.next.prev = null;
            front = front.next;
        }
    }

    public void dequeueRear(){
        if(isEmpty()){
            println("deque is empty");
            return;
        }

        if(front == rear){
            front = rear = null;
        }else{
            rear.prev.next = null;
            rear = rear.prev;
        }
    }

    public int peekFront(){
        if(isEmpty()){
            println("deque is empty");
            return -1;
        }
        println("front -> " + front.data);
        return front.data;
    }

    public int peekRear(){
        if(isEmpty()){
            println("deque is empty");
            return -1;
        }
        println("rear -> " + rear.data);
        return rear.data;
    }

    public boolean isEmpty(){
        return rear == null ? true : false;
    }

    private void displayFront(){
        if(isEmpty()){
            println("deque is empty");
            return;
        }

        for(Node i = front; i != null; i = i.next){
            print(i.data + " ");
        }
        println("");
    }

    private void displayRear(){
        if(isEmpty()){
            println("deque is empty");
            return;
        }

        for(Node i = rear; i != null; i = i.prev){
            print(i.data + " ");
        }
        println("");
    }

    private static void print(Object obj){
        System.out.print(obj);
    }

    private static void println(Object obj){
        print(obj+"\n");
    }


    public static void main(String args []){
        Deque dq = new Deque();

        dq.enqueueFront(10);
        dq.enqueueFront(20);
        dq.enqueueFront(30);
        dq.enqueueFront(40);
        dq.enqueueFront(50);
        dq.enqueueFront(60);

        dq.enqueueRear(70);
        dq.enqueueRear(80);
        dq.enqueueRear(90);
        dq.enqueueRear(110);
        dq.enqueueRear(100);

        dq.peekFront();
        dq.peekRear();

        dq.displayFront();

        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueFront();
        // deque is empty now
        dq.dequeueFront();
        dq.dequeueFront();


        dq.enqueueFront(10);
        dq.enqueueFront(20);
        dq.enqueueFront(30);
        dq.enqueueFront(40);
        dq.enqueueFront(50);
        dq.enqueueFront(55);

        dq.enqueueRear(9);
        dq.enqueueRear(8);
        dq.enqueueRear(7);
        dq.enqueueRear(6);
        dq.enqueueRear(5);

        dq.peekFront();
        dq.peekRear();

        dq.displayRear();

    }
}