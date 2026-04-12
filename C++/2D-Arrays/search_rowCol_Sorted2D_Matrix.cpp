#include <bits/stdc++.h>
using namespace std;

bool solution(int arr[][5], int k)
{
    int row = 0;
    int col = 4;

    while (row <= 4 && col >= 0)
    {
        if (arr[row][col] == k)
            return 1;
        else if (arr[row][col] < k)
            row++;
        else if (arr[row][col] > k)
            col--;
    }
    return 0;
}

int main()
{
    int arr[5][5];
    for (int row = 0; row < 5; row++)
        for (int col = 0; col < 5; col++)
            cin >> arr[row][col];
    int target;
    cin >> target;

    cout << solution(arr, target);

    return 0;
}

/*
        input
        1 4 7 11 15
        2 5 8 12 19
        3 6 9 16 22
        10 13 14 17 24
        18 21 23 26 30

        target = 22

        output
        1
*/