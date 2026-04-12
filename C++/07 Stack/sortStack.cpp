#include <bits/stdc++.h>

using namespace std;
void sortedInsert(stack<int> &s, int element)
{
    if (s.empty() || (!s.empty() && s.top() < element))
    {
        s.push(element);
        return;
    }
    int top = s.top();
    s.pop();

    sortedInsert(s, element);

    s.push(top);
}

void sort(stack<int> &s)
{
    if (s.empty())
        return;

    int top = s.top();
    s.pop();

    sort(s);

    sortedInsert(s, top);
}

int main()
{
    stack<int> s;
    s.push(5);
    s.push(7);
    s.push(2);
    s.push(3);

    cout << s.top() << endl;

    sort(s);
    cout << s.top() << endl;
}