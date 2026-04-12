/*

input
4
1 5 4 3

1+4 = 5 count++;
1+3 = 4 count++;

output 2 (count = 2)

*/

#include <bits/stdc++.h>
using namespace std;

int sum(int arr[], int size)
{
    int count = 0;
    for (int i = 0; i < size - 1; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            for (int k = 1; k <= size; k++)
            {
                if (arr[i] + arr[j] == arr[k])
                {
                    count++;
                }
            }
        }
    }
    return count;
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

    cout << sum(arr, n);
    return 0;
}