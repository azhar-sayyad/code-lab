#include <bits/stdc++.h>
using namespace std;

void wavePrint(int arr[][3])
{
    for (int col = 0; col < 3; col++)
    {
        if (col % 2 == 0)
            for (int row = 0; row < 3; row++)
                cout << arr[row][col];
        else
            for (int row = 3 - 1; row >= 0; row--)
                cout << arr[row][col];
    }
}

int main()
{
    int arr[3][3];

    for (int row = 0; row < 3; row++)
        for (int col = 0; col < 3; col++)
            cin >> arr[row][col];

    wavePrint(arr);
    return 0;
}
/*
    print the first column top to bottom,
    next column bottom to top, and So on___
*/