#include <bits/stdc++.h>
using namespace std;
int search(int *arr, int n, int k)
{
    if (n == 0)
        return 0;

    if (arr[0] == k)
        return 1;
    else
        return search(arr + 1, n - 1, k);
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
    cout << search(arr, n, key);

    return 0;
}