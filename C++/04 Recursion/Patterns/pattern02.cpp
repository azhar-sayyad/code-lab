#include <bits/stdc++.h>
using namespace std;
void forLoop(int n)
{
    int cnt = 1;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
            cout << cnt++ << " ";
        cout << endl;
    }
}
void whileLoop(int n)
{
    int cnt = 1;
    int i = n;
    while (i--)
    {
        int j = n;
        while (j--)
            cout << cnt++ << " ";
        cout << endl;
    }
}
void recursion(int n, int cnt)
{
    if (n * n < cnt)
        return;
    recursion(n, cnt + 1);
    if (cnt % n == 0 && cnt != n * n)
        cout << endl;
    cout << cnt << " ";
}

int main()
{
    int n;
    cin >> n;
    // forLoop(n);
    // whileLoop(n);
    recursion(n, 1);
    return 0;
}