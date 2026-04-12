#include <bits/stdc++.h>
using namespace std;

void solve(string str, string output, int index, vector<string> &ans)
{
    if (index >= str.length())
    {
        if (output.length() > 0)
            ans.push_back(output);
        return;
    }

    // exclude
    solve(str, output, index + 1, ans);

    // include
    char element = str[index];
    output.push_back(element);
    solve(str, output, index + 1, ans);
}

int main()
{
    string str;
    cin >> str;

    string output = "";
    vector<string> ans;
    int index = 0;

    solve(str, output, index, ans);

    cout << ans.size() << endl;
    for (int i = 0; i < ans.size(); i++)
        cout << ans[i] << " ";
}