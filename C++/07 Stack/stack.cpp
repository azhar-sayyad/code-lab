#include <bits/stdc++.h>
using namespace std;
class Stack
{
public:
    int top;
    int *arr;
    int size;
    Stack(int size)
    {
        this->size = size;
        arr = new int[size];
        top = -1;
    }
    void push(int e)
    {
        if (top < size - 1)
        {
            top++;
            arr[top] = e;
        }
        else
            cout << "Stack Overflow..." << endl;
    }
    void pop()
    {
        if (top != -1)
            top--;
        else
            cout << "Stack underflow..." << endl;
    }
    int peek()
    {
        if (top != -1)
            return arr[top];
        else
            return -1;
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
    Stack st(5);
    st.push(11);
    st.push(22);
    st.push(33);
    st.push(44);
    st.push(55);
    st.push(55);
    cout << st.peek() << endl;
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    st.pop();
    st.pop();

    cout << st.peek() << endl;
    cout << st.isEmpty() << endl;

    return 0;
}