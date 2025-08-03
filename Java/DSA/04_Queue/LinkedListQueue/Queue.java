class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Queue{
    Node front;
    Node rear;

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue(){
        if(front == null){
            System.out.println("Underflow");
            return;
        }

        if(front == rear){
            front = null;
            rear = null;
        }else{
            front = front.next;
        }
    }

    public int peek(){
        if(front == null){
            System.out.println("Underflow");
            return -1;            
        }
        System.out.println(front.data);
        return front.data;
    }

    public boolean isEmpty(){
        return front == null ? true : false;
    }


    public static void main(String args []){
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(20);
        // q.enqueue(60);
        // q.enqueue(70);
        // q.enqueue(80);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        // q.dequeue();

        q.enqueue(100);

        q.dequeue();

        q.peek();
    }

}