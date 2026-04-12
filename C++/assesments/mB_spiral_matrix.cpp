#include <bits/stdc++.h>

using namespace std;

int main()
{
    int arr[4][4];
    for (int i = 0; i < 4; i++)
        for (int j = 0; j < 4; j++)
            cin >> arr[i][j];
    // spiral print....

    int rows = 4;
    int cols = 4;

    int count = 0;
    int total = rows * cols;

    int rowStart = 0;
    int colStart = 0;
    int rowEnd = 4 - 1;
    int colEnd = 4 - 1;

    while (count < total)
    {
        // start row
        for (int i = colStart; i <= colEnd && count < total; i++)
        {
            cout << arr[rowStart][i] << " ";
            count++;
        }
        rowStart++;
        // end column
        for (int i = rowStart; i <= rowEnd && count < total; i++)
        {
            cout << arr[i][colEnd] << " ";
            count++;
        }
        colEnd--;
        // end row
        for (int i = colEnd; i >= colStart && count < total; i--)
        {
            cout << arr[rowEnd][i] << " ";
            count++;
        }
        rowEnd--;
        // start column
        for (int i = rowEnd; i >= rowStart && count < total; i--)
        {
            cout << arr[i][colStart] << " ";
            count++;
        }
        colStart++;
    }
}