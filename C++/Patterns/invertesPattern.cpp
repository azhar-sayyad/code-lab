#include <iostream>
using namespace std;
int main()
{
    // int row, column;
    // cin >> row >> column;
    int n = 5;
    for (int i = n; i >= 0; i--)
    {
        for (int j = 1; j <= i; j++)
            cout << j << " ";
        cout << endl;
    }
}