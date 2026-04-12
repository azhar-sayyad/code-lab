#include <bits/stdc++.h>

using namespace std;

int solution(int arr[], int n)
{
    int ans = 0;
    for (int i = 0; i < n; i++)
    {
        int value = arr[i];
        int count = 0;
        while (value != 1)
        {
            value--;
            count++;
        }
        ans = max(ans, count);
    }
    return ans;
}

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++)
            cin >> arr[i];
        cout << solution(arr, n)<<endl;;
    }

    return 0;
}