#include <bits/stdc++.h>
using namespace std;
void forLoop(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
            cout << j << " ";
        cout << endl;
    }
}
void whileLoop(int n)
{
    int i = 1;
    while (i++ <= n)
    {
        int j = 1;
        while (j <= n)
            cout << j++ << " ";
        cout << endl;
    }
}
void recursion(int n, int cnt)
{
    if (cnt == 0)
        return;
    for (int i = n; i > 0; i--)
        cout << i << " ";
    cout << endl;
    recursion(n, cnt - 1);
}

int main()
{
    int n;
    cin >> n;
    forLoop(n);
    whileLoop(n);
    recursion(n, n);
    return 0;
}