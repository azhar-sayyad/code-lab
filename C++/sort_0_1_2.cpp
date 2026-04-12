#include <bits/stdc++.h>
using namespace std;
int Swap(int i, int j)
{
    int temp = i;
    i = j;
    j = temp;
}

int Sort(int arr[], int size)
{
    for (int i = 0; i < size - 1; i++)
    {
        int minInd = i;
        for (int j = i + 1; j < size; j++)
        {
            if (arr[j] < arr[minInd])
                minInd = j;
        }
        int temp = arr[minInd];
        arr[minInd] = arr[i];
        arr[i] = temp;
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
    cout << Sort(arr, n);
}