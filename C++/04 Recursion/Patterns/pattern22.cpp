#include <bits/stdc++.h>
using namespace std;

void forLoop(int n)
{
    for (int i = 1; i <= n; i++)
    {
        // space
        for (int j = 0; j < n - i; j++)
            cout << "  ";
        // value print
        int count = 0;
        for (int j = 0; j < i; j++)
            cout << ++count << " ";
        // last value 0 to i-1 times
        for (int j = 0; j < i - 1; j++)
            cout << --count << " ";
        cout << endl;
    }
}
void whileLoop(int n)
{
    int i = 1;
    while (i <= n)
    {
        // spaces
        int j = 0;
        while (j < n - i)
        {
            cout << "  ";
            j++;
        }
        int count = 0;
        j = 0;
        while (j < i)
        {
            cout << ++count << " ";
            j++;
        }
        j = 0;
        while (j < i - 1)
        {
            cout << --count << " ";
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
    int i = 0;
    while (i++ < n - count)
        cout << "  ";
    i = 1;
    while (i <= count)
        cout << i++ << " ";
    while (i)
        cout << i-- << " ";
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