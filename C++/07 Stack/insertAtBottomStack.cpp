#include <bits/stdc++.h>
using namespace std;

void insertBottom(stack<int> &stack, int element)
{
    if (stack.empty())
    {
        stack.push(element);
        return;
    }

    int stackTop = stack.top();
    stack.pop();
    insertBottom(stack, element);

    stack.push(stackTop);
}

int main()
{
    stack<int> st;
    st.push(5);
    st.push(4);
    st.push(3);
    st.push(2);
    st.push(1);

    int element = 6;

    cout << st.size() << endl;

    insertBottom(st, element);
    cout << st.size() << endl;
}