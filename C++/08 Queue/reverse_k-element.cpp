/*
        input
        1 2 3 4 5
        k = 3

        output
        3 2 1 4 5
*/
#include <bits/stdc++.h>
using namespace std;

void solution1(queue<int> &q, int n)
{
    if (q.size() == n)
        return;

    int front = q.front();
    q.pop();

    solution1(q, n);
    q.push(front);
}

int main()
{
    queue<int> q;
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);
    q.push(5);
    q.push(6);

    int k = 3;
    int n = q.size() - k;
    cout << q.front() << " " << q.back() << endl;

    solution1(q, n);
    while (n--)
    {
        int front = q.front();
        q.pop();
        q.push(front);
    }
    cout << q.front() << " " << q.back() << endl;

    return 0;
}