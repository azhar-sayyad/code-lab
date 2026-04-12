#include <bits/stdc++.h>
using namespace std;
int binarySearch(int arr[][], int n, int m, int key)
{
    int i, j;
    i = 0;
    j = m - 1;
    while ((i >= 0 && i < n) && (j >= 0 && j < m))
    {
        if (arr[i][j] == key)
        {
            return i;
        }
        else if (arr[i][j] > key)
        {
            j--;
        }
        else if (arr[i][j] < key)
        {
            i++;
        }
    }
    return -1;
}
int main()
{
    int n, m, k;
    cin >> n;
    cin >> m;
    int arr[n][m];

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> arr[i][j];
        }
    }
    cin >> k;

    binarySearch(arr[n][m], n, m, k);

    return 0;
}