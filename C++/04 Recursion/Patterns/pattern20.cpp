/*
4
      1 
    2 3 
  4 5 6 
7 8 9 10 
*/

#include <bits/stdc++.h>
using namespace std;
void forLoop(int n)
{
    int count = 1;
    for (int i = 1; i <= n; i++)
    {
        // space
        for (int j = 0; j < n - i; j++)
            cout << "  ";
        for (int j = 0; j < i; j++)
            cout << count++ << " ";
        cout << endl;
    }
}
void whileLoop(int n)
{
    int i = 1;
    int count = 1;
    while (i <= n)
    {
        int j = 0;
        while (j++ < n - i)
            cout << "  ";
        j = 0;
        while (j++ < i)
            cout << count++ << " ";
        cout << endl;
        i++;
    }
}
void recursion(int n, int cnt,int count)
{
    if (n < cnt)
        return;
    for (int i = 0; i < n - cnt; i++)
        cout << "  ";
    for (int i = 0; i < cnt; i++)
        cout << count++ << " ";
    cout << endl;
    recursion(n, cnt + 1,count);
}
int main()
{
    int n = 4;
    // cin >> n;
    forLoop(n);
    whileLoop(n);
    recursion(n, 1,1);
    return 0;
}