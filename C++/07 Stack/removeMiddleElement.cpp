#include <bits/stdc++.h>
using namespace std;

void removeMid(stack<int> &stack, int count, int size)
{
    if (count == size / 2)
    {
        stack.pop();
        return;
    }

    int stackTop = stack.top();
    stack.pop();
    count++;
    removeMid(stack, count, size);

    stack.push(stackTop);
}

int main()
{
    stack<int> st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);

    int size = st.size();
    cout << size << endl;
    int count = 0;

    removeMid(st, count, size);
    cout << st.size() << endl;
}