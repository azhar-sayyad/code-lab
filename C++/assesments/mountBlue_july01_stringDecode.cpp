/*
        input
        i3s m1y name2 k3han

        output
        my name is khan
*/
#include <bits/stdc++.h>
using namespace std;

void solution(string &str, string &ans)
{
    map<int, string> map;
    int start = 0; // end = (start - i)
    int end = 0;
    int num = 0;

    for (int i = 0; i <= str.length(); i++)
    {
        int ch = str[i] - '0';
        // cout << (int)(str[i] - '0') << endl;
        if (ch >= 0 && ch <= 9)
        {
            num = ch;
            str.erase(i, 1);
        }
        // char ch = str[i];
        // if (ch == '1' || ch == '2' || ch == '3' ||
        //     ch == '4' || ch == '5' || ch == '6' ||
        //     ch == '7' || ch == '8' || ch == '9')
        // {
        //     num = ch - '0';
        //     str.erase(i, 1);
        // }

        if (str[i] == ' ' || str[i] == '\0')
        {
            string st = str.substr(start, i - start);
            // cout << start << " " << end << " " << i << endl;
            map[num] = st;
            end = 0;
            start = i + 1;
        }
        end++;
    }
    // print
    for (auto i : map)
        cout << i.second << " ";
    cout << endl;
    // copy map into string ans;
    for (int i = 1; i <= map.size(); i++)
    {
        ans += map[i];
        ans += " ";
    }
}

int main()
{
    string str = "i3s m1y name2 k4han";
    string str1 = "App5les are1 go2od fo4r hea3lth";

    // string ch = str.substr(0, 4);
    cout << str << endl;
    // str.erase(1, 1);
    string ans = "";
    solution(str1, ans);

    cout << ans;
}
