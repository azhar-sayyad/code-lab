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

    int largestArray = INT_MIN;
    int secondLargestArray = INT_MIN;

    for (int i = 0; i < n; i++)
    {
        if (arr[i] > largestArray)
        {
            secondLargestArray = largestArray;
            largestArray = arr[i];
        }
        else if (arr[i] > secondLargestArray && arr[i] < largestArray)
        {
            secondLargestArray = arr[i];
        }
    }
    cout << secondLargestArray << endl;
    cout << largestArray/secondLargestArray << endl;

}