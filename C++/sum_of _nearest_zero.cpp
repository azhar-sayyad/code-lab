#include <bits/stdc++.h>
using namespace std;

int Solution(int arr[], int n)
{
    sort(arr, arr + n); // sorting the array
    int i = 0, j = n - 1;
    int sum = arr[i] + arr[j]; // initializing sum
    int diff = abs(sum);       // initializing the result

    while (i < j)
    {
        if (arr[i] + arr[j] == 0)
            return 0;
        if (abs(arr[i] + arr[j]) < abs(diff))
        {
            diff = (arr[i] + arr[j]);
            sum = arr[i] + arr[j];
        }
        else if (abs(arr[i] + arr[j]) == abs(diff))
        {
            sum = max(sum, arr[i] + arr[j]);
        }
        if (arr[i] + arr[j] > 0)
            j--;
        else
            i++;
    }
    return sum;
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

    int ans = Solution(arr, n);
    cout << ans;
}