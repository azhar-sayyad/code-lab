#include <bits/stdc++.h>
using namespace std;

int sol(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int left = 0;
        for (int j = 0; j < i; j++)
            left += arr[j];

        int right = 0;
        for (int j = i + 1; j < n; j++)
            right += arr[j];

        if (left == right)
            return arr[i];
    }
    return -1;
}

int main()
{
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    int ans = sol(arr, n);
    cout << ans;

    return 0;
}