#include <iostream>
using namespace std;
int main()
{
    // int row, column;
    // cin >> row >> column;
    int n = 5;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++)
            cout << "  ";
        for (int j = 1; j <= n; j++)
            cout << "* ";
        cout << endl;
    }
}