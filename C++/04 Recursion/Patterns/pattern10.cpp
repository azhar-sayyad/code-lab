#include <bits/stdc++.h>
using namespace std;
void forLoop(int n)
{
    for (int i = 1; i <= n; i++)
    {
        int count = i;
        for (int j = 1; j <= n; j++)
            cout << (char)(65 + count++ - 1) << " ";
        cout << endl;
    }
}
void whileLoop(int n)
{
    int i = 1;
    while (i <= n)
    {
        int count = i;
        int j = 1;
        while (j++ <= n)
            cout << (char)(65 + count++ - 1) << " ";
        cout << endl;
        i++;
    }
}
void recursion(int n, int cnt)
{
    if (cnt > n)
        return;
    int count = cnt;
    for (int i = 1; i <= n; i++)
        cout << (char)(65 + count++ - 1) << " ";
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