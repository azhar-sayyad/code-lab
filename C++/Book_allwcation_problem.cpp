

// Time Complixity
// O(n2)

#include <bits/stdc++.h>
using namespace std;

int BookAllow(int arr[], int size)
{
    int minn = INT_MAX;
    int maxx = INT_MIN;
    for (int i = 0; i < size; i++)
    {
        int left = 0;
        int right = 0;
        for (int j = 0; j < size; j++)
        {
            if (j <= i)
            {
                left = left + arr[j];
            }
            else
            {
                right = right + arr[j];
            }
            maxx = max(left, right);
        }
        minn = min(minn, maxx);
    }
    return minn;
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
    int ans = BookAllow(arr, n);
    cout << ans;
}