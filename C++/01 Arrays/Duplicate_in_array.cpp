#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int duplicate = 0;
    for (int i = 0; i < n; i++)
    {
        duplicate = duplicate ^ arr[i];
    }
    for (int i = 1; i < n; i++)
    {
        duplicate = duplicate ^ i;
    }
    cout << duplicate;
}