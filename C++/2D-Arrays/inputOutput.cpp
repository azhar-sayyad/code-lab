#include <bits/stdc++.h>

using namespace std;

bool isPresent(int arr[][3], int target, int row, int col)
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            if (arr[i][j] == target)
            {
                return 1;
            }
        }
    }
    return 0;
}
void rowSum(int arr[][3], int row, int col)
{
    for (int i = 0; i < row; i++)
    {
        int sum = 0;
        for (int j = 0; j < col; j++)
        {
            sum += arr[i][j];
        }
        cout << "Row sum " << sum << endl;
    }
}
void colSum(int arr[][3], int row, int col)
{
    for (int i = 0; i < row; i++)
    {
        int sum = 0;
        for (int j = 0; j < col; j++)
        {
            sum += arr[j][i];
        }
        cout << "Col sum " << sum << endl;
    }
}
int maxRowInd(int arr[][3], int row, int col)
{
    int max = INT_MIN;
    int index = -1;
    for (int i = 0; i < row; i++)
    {
        int sum = 0;
        for (int j = 0; j < col; j++)
        {
            sum += arr[i][j];
        }
        if (max < sum)
        {
            max = sum;
            index = i;
        }
    }
    cout << "max Row Sum" << max << endl;
    return index;
}

int main()
{
    // create 2d array row*column
    // int arr[3][4];
    int arr[3][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // int arr[3][4] = {{1,11,111,1111},{2,22,222,2222},{3,33,333,3333}};

    // tacking input
    // for (int i = 0; i < 3; i++)
    // {
    //     for (int j = 0; j < 4; j++)
    //     {
    //         cin >> arr[i][j];
    //     }
    // }

    // output
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
    cout << "enter target element" << endl;
    int target;
    cin >> target;

    if (isPresent(arr, target, 3, 3))
    {
        cout << "Element Found!!" << endl;
    }
    else
    {
        cout << "Not Found!!" << endl;
    }

    rowSum(arr, 3, 3);
    colSum(arr, 3, 3);
    // maxRowInd(arr, 3, 3);

    cout << "max row index " << maxRowInd(arr, 3, 3) << endl;
}