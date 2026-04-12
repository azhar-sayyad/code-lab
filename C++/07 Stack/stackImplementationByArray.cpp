#include <bits/stdc++.h>
using namespace std;

class Stack
{
public:
    int *arr;
    int top;
    int size;

    Stack(int size)
    {
        this->size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int element)
    {
        if (size - top > 1)
        {
            top++;
            arr[top] = element;
        }
        else
            cout << "stack OverFlow..." << endl;
    }
    void pop()
    {
        if (top == -1)
            cout << "stack UnderFlow..." << endl;
        else
            top--;
    }
    int peek()
    {
        if (top == -1)
        {
            cout << "stack is empty..." << endl;
            return -1;
        }
        return arr[top];
    }
    bool isEmpty()
    {
        if (top == -1)
            return 1;
        else
            return 0;
    }
};

int main()
{

    int size = 5;
    Stack st(size);

    st.push(5);
    cout << st.peek() << endl;
    st.push(4);
    cout << st.peek() << endl;
    st.push(3);
    cout << st.peek() << endl;
    st.push(2);
    cout << st.peek() << endl;
    st.push(1);
    cout << st.peek() << endl;
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    cout << st.peek() << endl;

    return 0;
}