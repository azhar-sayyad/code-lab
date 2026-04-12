#include <bits/stdc++.h>
using namespace std;

class Queue
{
    int *arr;
    int size;
    int front;
    int rear;

public:
    Queue(int e)
    {
        size = e;
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    void push(int e)
    {
        if (rear >= size)
        {
            cout << "Queue is full" << endl;
        }
        else
        {
            arr[rear] = e;
            rear++;
        }
    }
    void pop()
    {
        if (front != rear)
        {
            arr[front] = -1;
            front++;
            if (front == rear)
            {
                front = 0;
                rear = 0;
            }
        }
        else
            cout << "fjhjhj";
    }
    bool isEmpty()
    {
        if (front == rear)
            return 1;
        else
            return 0;
    }
    int quefront()
    {
        if (front != rear)
            return arr[front];
        else
            return -1;
        // cout << "empty";
    }
};

int main()
{
    Queue q(10);
    q.push(11);
    q.push(12);
    q.push(13);
    q.push(14);
    cout << q.quefront() << " " << q.isEmpty() << endl;
    q.pop();
    q.pop();
    q.pop();
    q.pop();
    cout << q.quefront() << " " << q.isEmpty() << endl;
    return 0;
}