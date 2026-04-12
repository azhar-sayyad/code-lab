#include <bits/stdc++.h>

using namespace std;
int main()
{
    int n = 6;
    int row = 1;
    char ch ='A';
    while (row <= n)
    {
        int col = 1;
        while (col <= n)
        {
            char ch1 = 'A' + row - 1;
            char ch2 = 'A' + col - 1;
            // cout << ch1;
            cout << ch++;
            col++;
        }
        cout << endl;
        row++;
    }
}