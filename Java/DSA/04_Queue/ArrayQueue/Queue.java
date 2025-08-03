public class Queue{

    int arr[];
    int size;
    int rear;
    int front;

    Queue(int size){
        this.size = size;
        this.arr = new int[size];
        this.rear = -1;
        this.front = -1;
    }

    public void enque(int data){

        if(rear == size - 1){
            System.out.println("overflow");
            return;
        }
        
        if(rear == -1){
            rear = 0;
            front = 0;
            arr[rear] = data;
        }else{
            rear++;
            arr[rear] = data;
        }

    }

    public void deque(){
        if(rear == -1){
            System.out.println("Underflow");
            return;
        }

        if(rear == front){
            rear = -1;
            front = -1;
        }else{
            front++;
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


    public static void main(String args []){

        Queue q = new Queue(5);

        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);

        q.deque();
        q.deque();
        q.deque();
        q.deque();
        // q.deque();
        // q.deque();

        q.enque(60);
        q.enque(70);
        q.peek();

    }
}

//unused spaces remain wasted 