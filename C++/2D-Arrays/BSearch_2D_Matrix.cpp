#include <bits/stdc++.h>

using namespace std;

bool bSearch(int arr[][3], int k)
{
    int row = 3;
    int col = 3;

    int s = 0;
    int e = row * col - 1;

    while (s < e)
    {
        int mid = (s + e) / 2;
        int element = arr[mid / col][mid % col];
        if (element == k)
            return 1;
        else if (element < k)
            s = mid + 1;
        else if (element > k)
            e = mid - 1;
    }
    return 0;
}

int main()
{
    int arr[3][3];

    for (int row = 0; row < 3; row++)
        for (int col = 0; col < 3; col++)
            cin >> arr[row][col];
    int target;
    cin >> target;

    cout << bSearch(arr, target);

    return 0;
}