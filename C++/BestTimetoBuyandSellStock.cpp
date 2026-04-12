#include <bits/stdc++.h>

using namespace std;

int buySell(int arr[], int size)
{
    int cur_price = INT_MAX;
    int cur_profit = 0;

    for (int i = 0; i < size; i++)
    {
        // cur_price = min(cur_price, arr[i]);
        // cur_profit = max((arr[i] - cur_price), cur_profit);
        if (arr[i] < cur_price)
        {
            cur_price = arr[i];
        }

        if ((arr[i] - cur_price) > cur_profit)
        {
            cur_profit = (arr[i] - cur_price);
        }
    }
    if (cur_profit == 0)
        return 0;

    return cur_profit;
}

int main()
{
    int n;
    cin >> n;
    // int arr[6] = {7, 1, 5, 3, 6, 4};
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << buySell(arr, n);
}