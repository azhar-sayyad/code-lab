#include <bits/stdc++.h>
using namespace std;

int sol(int arr[], int n, int k)
{
    int max;
    int ans = INT_MAX;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] > k)
        {
            max = arr[i];
            ans = min(ans, max);
        }
    }
    if (ans == INT_MAX)
        return -1;

    return ans;
}
int main()
{
    int n;
    cin >> n;
    // key
    int k;
    cin >> k;
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << sol(arr, n, k);
    return 0;
}