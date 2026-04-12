#include <bits/stdc++.h>

using namespace std;

class Stack
{
public:
    int *arr;
    int top1;
    int top2;
    int size;
    Stack(int size)
    {

        this->size = size;
        arr = new int[size];
        this->top1 = -1;
        this->top2 = size;
    }
    void push1(int element)
    {
        if (top2 - top1 > 1)
        {
            top1++;
            arr[top1] = element;
        }
        else
            cout << "Stack Overflow..." << endl;
    }
    void push2(int element)
    {
        if (top2 - top1 > 1)
        {
            top2--;
            arr[top2] = element;
        }
        else
            cout << "Stack Overflow..." << endl;
    }
    void pop1()
    {
        if (top1 != -1)
            top1--;
        else
            cout << "Stack Underflow..." << endl;
    }
    void pop2()
    {
        if (top2 != size)
            top2++;
        else
            cout << "Stack Underflow..." << endl;
    }
    int peek1()
    {
        if (top1 != -1)
            return arr[top1];
        else
            return -1;
    }
    int peek2()
    {
        if (top2 != size)
            return arr[top2];
        else
            return -1;
    }
    bool isEmpty1()
    {
        if (top1 == -1)
            return 1;
        else
            return 0;
    }
    bool isEmpty2()
    {
        if (top2 == size)
            return 1;
        else
            return 0;
    }
};

int main()
{
    Stack st(5);
    st.push1(1);
    st.push1(2);
    st.push1(3);
    st.push1(4);
    st.push1(5);
    cout << st.peek1() << endl;
    st.push2(1);
    cout << st.peek2() << endl;
    return 0;
}