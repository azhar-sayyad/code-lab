#include <iostream>
using namespace std;
int main()
{
    int row, column;
    cin >> row >> column;
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; column < 4; j++)
        {
            cout << "* ";
        }
        cout << endl;
    }
}