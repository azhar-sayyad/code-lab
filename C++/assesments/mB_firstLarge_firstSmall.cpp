/*
        input 
        8
        9 2 1 7 3 4 8 28

        output
        28 1 9 2 8 3 7 4
        1st largest , 1st smallest, 2nd largest , 2nd smallest....So on

*/
#include <bits/stdc++.h>

using namespace std;

void solution(vector<int> arr, vector<int> &ans)
{
    int start = 0,
        end = arr.size() - 1;
    sort(arr.begin(), arr.end());

    while (start <= end)
    {
        ans.push_back(arr[end--]);
        ans.push_back(arr[start++]);
    }
}

int main()
{
    int n, input;
    cin >> n;
    vector<int> arr;
    // tacking input
    for (int i = 0; i < n; i++)
    {
        cin >> input;
        arr.push_back(input);
    }
    vector<int> ans;
    solution(arr, ans);

    // output the ans array
    for (int i = 0; i < n; i++)
        cout << ans[i] << " ";
    return 0;
}