#include <iostream>
using namespace std;
int main()
{
    // int row, column;
    // cin >> row >> column;
    int count = 1;
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= i; j++)
            cout << count++ << " ";

        cout << endl;
    }
}