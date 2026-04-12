#include <bits/stdc++.h>
using namespace std;

// find out if any int occures more than n/3 times

// TC O(n)     SC O(n)
int solution(int arr[], int size)
{
    int arr2[size] = {0};
    for (int i = 0; i < size; i++)
        arr2[arr[i]]++;

    for (int i = 0; i < size; i++)
        if (arr2[i] != 0 && arr2[i] > size / 3)
            return i;

    return -1;
}

int main()
{
    int size;
    cin >> size;

    int arr[size];
    for (int i = 0; i < size; i++)
        cin >> arr[i];
    int ans = solution(arr, size);
    cout << ans << endl;
}