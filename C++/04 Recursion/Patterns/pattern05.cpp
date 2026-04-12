#include <bits/stdc++.h>
using namespace std;

void forLoop(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 0; j < i; j++)
            cout << i + j << " ";
        cout << endl;
    }
}
void whileLoop(int n)
{
    int i = 1;
    while (i <= n)
    {
        int count = i;
        int j = i;
        while (j--)
            cout << count++ << " ";
        cout << endl;
        i++;
    }
}
void recursion(int n, int cnt)
{
    if (n < cnt)
        return;
    int count = cnt;
    for (int i = 0; i < cnt; i++)
        cout << count++ << " ";
    cout << endl;
    recursion(n, cnt + 1);
}

int main()
{
    int n;
    cin >> n;
    forLoop(n);
    whileLoop(n);
    recursion(n, 1);
    return 0;
}