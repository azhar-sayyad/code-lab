public class Deque{
    int arr[];
    int capacity;
    int size;
    int front;
    int rear;

    Deque(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
        this.front = -1;
        this.rear = -1;
    }

    public void enqueueFront(int data){
        if(isFull()){
            println("Deque is full");
            return;
        }

        if(isEmpty()){
            front = rear = 0;
        }else{
            front = (front - 1 + capacity) % capacity;
        }
        arr[front] = data;
        size++;
    }

    public void enqueueRear(int data){
        if(isFull()){
            println("Deque is full");
            return;
        }

        if(isEmpty()){
            rear = front = 0;
        }else{
            rear = (rear + 1) % capacity;
        }
        arr[rear] = data;
        size++;
        
    }

    public void dequeueFront(){
        if(isEmpty()){
            println("deque is empty");
            return;
        }
        
        if(front == rear){
            front = rear = -1;
        }else{
            front = (front + 1) % capacity;
        }
        size--;
    }

    public void dequeueRear(){
        if(isEmpty()){
            println("deque is empty");
            return;
        }

        if(rear == front){
            rear = front = -1;
        }else{
            rear = (rear -1 + capacity) % capacity;
        }
        size--;        
    }

    public int peekFront(){
        if(isEmpty()){
            println("deque is empty");
            return -1;
        }
        println("Front -> " + arr[front]);
        return arr[front];
    }

    public int peekRear(){
        if(isEmpty()){
            println("deque is empty");
            return -1;
        }
        println("Rear -> " + arr[rear]);
        return arr[rear];
    }

    public boolean isEmpty(){
        return size == 0 ? true : false;
    }

    public boolean isFull(){
        return size == capacity ? true : false;
    }

    private void display(){
        for(int i=front; i != rear ; i = (i+1)%capacity){
            print(arr[i]+ " ");
        }
        println(arr[rear]);
    }











































































    private static void print(Object obj){
        System.out.print(obj);
    }

    private static void println(Object obj){
        print(obj+"\n");
    }


    public static void main(String args []){
        Deque dq = new Deque(5);

        dq.enqueueFront(10);
        dq.enqueueFront(20);
        dq.enqueueFront(30);
        dq.enqueueFront(40);
        dq.enqueueRear(50);
        // dq.enqueueFront(50);

        dq.display();

        dq.dequeueFront();
        dq.dequeueFront();
        dq.dequeueRear();
        dq.dequeueRear();
        dq.dequeueRear();

        dq.peekFront();
        dq.peekRear();


    }
}