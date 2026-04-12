#include <bits/stdc++.h>

using namespace std;

void solution(string str, string output, int index, string map[], vector<string> &ans)
{
    // base case
    if (index >= str.length())
    {
        ans.push_back(output);
        return;
    }

    int num = str[index] - '0';
    string val = map[num];

    for (int i = 0; i < val.length(); i++)
    {
        output.push_back(val[i]);
        solution(str, output, index + 1, map, ans);
        output.pop_back();
    }
}

int main()
{
    string str;
    cin >> str;

    vector<string> ans;
    string output = "";
    int index = 0;
    string map[10] = {" ", " ", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uvw", "xyz"};

    // if (str.length() == 0)
    //     return ans;

    solution(str, output, index, map, ans);

    // output
    for (int i = 0; i < ans.size(); i++)
        cout << ans[i] << " ";

    return 0;
}