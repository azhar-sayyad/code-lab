#include <bits/stdc++.h>
using namespace std;

bool Binary(int *arr, int s, int e, int k)
{
    if (s > e)
        return false;

    int mid = s + (e - s) / 2;

    if (arr[mid] == k)
        return true;

    if (arr[mid] > k)
    {
        return Binary(arr, s, mid - 1, k);
    }
    else
    {
        return Binary(arr, mid + 1, e, k);
    }
}

int main()
{
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int key;
    cin >> key;
    int ans = Binary(arr, 0, n - 1, key);
    cout << ans;
    return 0;
}