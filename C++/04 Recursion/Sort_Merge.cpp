#include <bits/stdc++.h>

using namespace std;

// merge two sorted array
void merge(int *arr, int s, int e)
{
    int mid = s + (e - s) / 2;

    int len1 = mid - s + 1;
    int len2 = e - mid;

    int *firstArr = new int[len1];
    int *secondArr = new int[len2];

    int mainIndex = s;
    // copy into firstArr
    for (int i = 0; i < len1; i++)
        firstArr[i] = arr[mainIndex++];

    mainIndex = mid + 1;
    // copy into secondArr
    for (int i = 0; i < len2; i++)
        secondArr[i] = arr[mainIndex++];

    // merge
    int i = 0, j = 0;
    mainIndex = s;

    while (i < len1 && j < len2)
    {
        if (firstArr[i] < secondArr[j])
            arr[mainIndex++] = firstArr[i++];
        else
            arr[mainIndex++] = secondArr[j++];
    }
    while (i < len1)
        arr[mainIndex++] = firstArr[i++];

    while (j < len2)
        arr[mainIndex++] = secondArr[j++];
}

void mergeSort(int *arr, int s, int e)
{
    if (s >= e) // basecase
        return;

    int mid = s + (e - s) / 2;
    // left part
    mergeSort(arr, s, mid);

    // right part
    mergeSort(arr, mid + 1, e);

    // merge
    merge(arr, s, e);
}

int main()
{
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    mergeSort(arr, 0, n - 1);

    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
}