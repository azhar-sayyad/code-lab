#include <bits/stdc++.h>
using namespace std;

void interleave(queue<int> &q)
{
    queue<int> first;

    int n = q.size() / 2;

    while (n--)
    {
        first.push(q.front());
        q.pop();
    }
    while (!q.empty())
    {
        q.push(first.front());
        first.pop();
        q.push(q.front());
        q.pop();
    }
}

void stackSolution(queue<int> &q)
{
    stack<int> s;

    int n = q.size() / 2;
    // pusing size/2 elements in stack
    while (n--)
    {
        s.push(q.front());
        q.pop();
    }
    // push all stack element in queue in rev ordr
    while (!s.empty())
    {
        q.push(s.top());
        s.pop();
    }
    n = q.size() / 2;
    while (n--)
    {
        q.push(q.front());
        q.pop();
    }
    n = q.size() / 2;
    while (n--)
    {
        s.push(q.front());
        q.pop();
    }
    while (!s.empty())
    {
        q.push(s.top());
        s.pop();
        q.push(q.front());
        q.pop();
    }
}

int main()
{
    queue<int> q;
    for (int i = 1; i <= 10; i++)
        q.push(i);
        
    interleave(q);
    // stackSolution(q);

    int n = q.size();

    while (n--)
    {
        cout << q.front() << " ";
        q.pop();
    }

    return 0;
}