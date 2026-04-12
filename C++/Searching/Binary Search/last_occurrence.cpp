#include <bits/stdc++.h>
using namespace std;

int BS(int arr[], int size, int key)
{
    int start = 0;
    int end = size - 1;
    int index = 0;
    while (start <= end)
    {
        int mid = start + (end - start) / 2;
        if (arr[mid] == key)
        {
            index = mid;
            start = mid + 1;
        }
        else if (key < arr[mid])
            end = mid - 1;

        else
            start = mid + 1;
    }
    return index;
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
    int k;
    cin >> k;
    cout << BS(arr, n, k);
}