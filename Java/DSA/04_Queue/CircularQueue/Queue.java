public class Queue{
    int arr[];
    int size;
    int rear;
    int front;

    Queue(int size){
        this.arr = new int[size];
        this.size = size;
        this.rear = -1;
        this.front = -1;
    }


    public void enqueue(int data){
        if(rear == -1){
            rear = front = 0;
            arr[rear] = data;
            return;
        }

        if(((rear + 1) % size) == front){
            System.out.println("Overflow");
        }else{
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

    }

    public void dequeue(){
        if(rear == -1){
            System.out.println("Underflow");
            return;
        }

        if(front == rear){
            front = rear = -1;
        }else{
            front = (front + 1) % size;
        }

    }

    public int peek(){
        if(rear == -1){
            return -1;
        }

        System.out.println(arr[front]);
        return arr[front];

    }

    public boolean isEmpty(){
        return rear == -1 ? true : false;
    }


    public static void main(String args[]){

        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);

        q.dequeue();
        q.dequeue();
        // q.dequeue();
        // q.dequeue();

        q.peek();
        
        System.out.println(q.isEmpty());

    }
}