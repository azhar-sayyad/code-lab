#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n = 5;
    // cin >> n;
    int row = 1;
    while (row <= n)
    {
        int col = 1;
        while (col <= row)
        {
            cout << row + col - 1;
            // cout << row -col+1;
            col++;
        }
        cout << endl;
        row++;
    }
    cout << endl;
    for (int i = 1; i <= n; i++)
    {
        int count = i;
        for (int j = 1; j <= i; j++)
            cout << count++ << " ";
        cout << endl;
    }
}