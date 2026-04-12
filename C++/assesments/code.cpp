#include <bits/stdc++.h>
using namespace std;

int main()
{
    int days, products;
    cin >> days >> products;
    int arr[days][products];

    // input
    for (int i = 0; i < days; i++)
        for (int j = 0; j < products; j++)
            cin >> arr[i][j];

    for (int i = 0; i < days; i++)
    {
        int max = arr[i][0];
        for (int j = 0; j < products; j++)
            if (arr[i][j] > max)
                max = arr[i][j];
        cout << max << " ";
    }
    return 0;
}