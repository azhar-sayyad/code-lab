#include <bits/stdc++.h>

using namespace std;

void addBottom(stack<int> &st, int element)
{
    if (st.empty())
    {
        st.push(element);
        return;
    }
    int top = st.top();
    st.pop();

    addBottom(st, element);

    st.push(top);
}

void reverse(stack<int> &st)
{
    if (st.empty())
        return;

    int top = st.top();
    st.pop();

    reverse(st);

    addBottom(st, top);
}

int main()
{
    stack<int> st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);

    cout << st.top() << endl;
    reverse(st);

    while (!st.empty())
    {
        cout << st.top() << " " ;
        st.pop();
    }
}