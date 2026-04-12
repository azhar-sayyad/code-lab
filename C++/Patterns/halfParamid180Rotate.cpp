#include <iostream>
using namespace std;
int main()
{
    // int row, column;
    // cin >> row >> column;
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            if (j <= 5 - i)
                cout << "  ";
            else
                cout << "* ";
        }
        cout << endl;
    }
}