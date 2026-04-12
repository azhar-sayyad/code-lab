#include <bits/stdc++.h>
using namespace std;

int largestRowSum(int arr[][4])
{
    int maxi = 0;
    int maxIndex = 0;
    for (int row = 0; row < 3; row++)
    {
        int sum = 0;
        for (int col = 0; col < 4; col++)
            sum += arr[row][col];
        if (maxi < sum)
        {
            maxi = sum;
            maxIndex = row;
        }
    }
    cout << "max row-sum: " << maxi << " at: ";
    return maxIndex;
}
int largestColSum(int arr[][4])
{
    int maxi = 0;
    int maxIndex = 0;
    for (int col = 0; col < 4; col++)
    {
        int sum = 0;
        for (int row = 0; row < 3; row++)
            sum += arr[row][col];
        if (maxi < sum)
        {
            maxi = sum;
            maxIndex = col;
        }
    }
    cout << "max row-sum: " << maxi << " at: ";
    return maxIndex;
}

int main()
{

    int arr[3][4];
    // int arr[3][4] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    // int arr[3][4] = {{1, 11, 111, 1111}, {2, 22, 222, 2222}, {3, 33, 333, 3333}};

    for (int row = 0; row < 3; row++)
        for (int col = 0; col < 4; col++)
            cin >> arr[row][col];

    for (int row = 0; row < 3; row++)
    {
        for (int col = 0; col < 4; col++)
            cout << arr[row][col] << " ";
        cout << endl;
    }

    cout << largestRowSum(arr) << endl;
    cout << largestColSum(arr) << endl;
}