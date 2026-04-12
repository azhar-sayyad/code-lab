#include <bits/stdc++.h>
using namespace std;

int main()
{
    string str = {"my name is khan"};
    // cin >> str;

    // cout << str << endl;

    string ans = "";
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] == ' ')
        {
            ans.push_back('@');
            ans.push_back('4');
            ans.push_back('0');
        }
        else
            ans.push_back(str[i]);
    }

    cout << ans;
    return 0;
}

/*
        input
        my name is khan

        output
        my@40name@40is@40khan
*/