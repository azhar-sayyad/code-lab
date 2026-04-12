/*
    4
* * * *
  * * *
    * *
      *
*/

#include <bits/stdc++.h>
using namespace std;
void forLoop(int n)
{
    for (int i = 1; i <= n; i++)
    {
        for (int j = 0; j < i - 1; j++)
            cout << "  ";
        for (int j = 0; j < n - i + 1; j++)
            cout << i << " ";

        cout << endl;
    }
}
void whileLoop(int n)
{
    int i = 1;
    while (i <= n)
    {
        int j = 1;
        while (j <= i - 1)
        {
            cout << "  ";
            j++;
        }
        j = 1;
        while (j <= n - i + 1)
        {
            cout << i << " ";
            j++;
        }
        cout << endl;
        i++;
    }
}

void recursion(int n, int count)
{
    if (n < count)
        return;
    for (int i = 0; i < count - 1; i++)
        cout << "  ";
    for (int i = 0; i < n - count + 1; i++)
        cout << count << " ";
    cout << endl;
    recursion(n, count + 1);
}

int main()
{
    int n = 4;
    // cin >> n;
    forLoop(n);
    whileLoop(n);
    recursion(n, 1);
    return 0;
}