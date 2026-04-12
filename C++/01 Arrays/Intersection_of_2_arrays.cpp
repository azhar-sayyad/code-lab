#include <bits/stdc++.h>
using namespace std;
int main()
{
    int m, n;
    cin >> m;
    cin >> n;
    int arr1[n];
    int arr2[m];

    for (int i = 0; i < n; i++)
    {
        cin >> arr1[i];
    }
    for (int i = 0; i < m; i++)
    {
        cin >> arr2[i];
    }

    int flag = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (arr1[i] == arr2[j])
            {
                cout << arr2[j] << endl;
                flag = 1;
                break;
            }
        }
    }
    if (!flag)
        cout << -1;
}