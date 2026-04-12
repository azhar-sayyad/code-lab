#include <bits/stdc++.h>
using namespace std;
// column * i + j

int main()
{
    int n, queries;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    // cin>>queries;
    int q[][2] = {{1, 2}, {3, 3}, {2, 4}, {3, 1}};

    int col = arr[0];

    for (int i = 0; i < 4; i++)
    {
        int first = q[i][0] - 1;
        cout << arr[column * first + q[i][1]] << " ";
    }

    return 0;
}