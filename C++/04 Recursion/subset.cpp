#include <bits/stdc++.h>
using namespace std;

void solve(vector<int> num, vector<int> output, int index, vector<vector<int>> &ans)
{
    // base case
    if (index >= num.size())
    {
        ans.push_back(output);
        return;
    }
    // exclude
    solve(num, output, index + 1, ans);

    // includec
    int element = num[index];
    output.push_back(element);
    solve(num, output, index + 1, ans);
}

int main()
{
    vector<int> num;
    int a;
    cin >> a;
    num.push_back(a);
    
    cout << num[0] << endl;
    vector<vector<int>> ans;
    vector<int> output;
    int index = 0;

    solve(num, output, index, ans);
    cout << ans.size();

    // for (int i = 0; i < ans.size() - 1; i++)
    // {
    //     cout << ans[0][i] << " ";
    // }

    return 0;
}