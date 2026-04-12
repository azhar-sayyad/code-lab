#include <bits/stdc++.h>
using namespace std;

void solution(queue<int> &q)
{
    stack<int> s;
    while (!q.empty())
    {
        s.push(q.front());
        q.pop();
    }
    while (!s.empty())
    {
        q.push(s.top());
        s.pop();
    }
}
void solution2(queue<int> &q)
{
    if (q.empty())
        return;
        
    int front = q.front();
    q.pop();

    solution2(q);
    q.push(front);
}
int main()
{
    queue<int> q;

    q.push(4);
    q.push(3);
    q.push(1);
    q.push(10);
    q.push(2);
    q.push(6);
    cout << q.front() << " ";
    solution(q);
    // solution2(q);
    cout << q.front() << " ";
    return 0;
}