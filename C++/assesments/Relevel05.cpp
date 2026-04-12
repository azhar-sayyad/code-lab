#include <bits/stdc++.h>

using namespace std;

int solution(int arr[], int n)
{
    int maxi = 0;
    for (int i = 0; i < n; i++)
    {
        int min = 1;
        while (arr[i] != 1)
        {
            arr[i]--;
            min++;
        }
        maxi = max(maxi, min);
    }
    return maxi;
}

int main()
{
    int t, n;
    cin >> t;
    while (t--)
    {
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++)
            cin >> arr[i];
        cout << solution(arr, n);
    }
    return 0;
}