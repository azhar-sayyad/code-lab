#include <bits/stdc++.h>
using namespace std;
void forLoop(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
            cout << "* ";
        cout << endl;
    }
}
void whileLoop(int n)
{
    int i = 0;
    while (i++ < n)
    {
        int j = 0;
        while (j++ < i)
            cout << "* ";
        cout << endl;
    }
}
void recursion(int n, int cnt)
{
    if (cnt > n)
        return;
    for (int i = 0; i < cnt; i++)
        cout << "* ";
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