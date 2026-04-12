#include <bits/stdc++.h>
using namespace std;
void forLoop(int n)
{
    int count = 1;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
            cout << (char)(65 + count++ - 1) << " ";
        cout << endl;
    }
}
void whileLoop(int n)
{
    int count = 1;
    int i = 1;
    while (i <= n)
    {
        int j = 1;
        while (j++ <= n)
            cout << (char)(65 + count++ - 1) << " ";
        cout << endl;
        i++;
    }
}
void recursion(int n, int cnt,int count)
{
    if (cnt > n)
        return;
    for (int i = 1; i <= n; i++)
        cout << (char)(65 + count++ - 1) << " ";
    cout << endl;
    recursion(n, cnt + 1,count);
}

int main()
{
    int n;
    cin >> n;
    forLoop(n);
    whileLoop(n);
    recursion(n, 1,1);
    return 0;
}