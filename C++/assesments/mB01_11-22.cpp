#include <bits/stdc++.h>
using namespace std;
/*
        input(int)
        35 | 9876 | 

        output(string)
        30+5 | 9000+800+70+6  |

        530
*/

void solution(int n, string &str)
{
    vector<int> ans;

    for (int i = 1; n != 0; i *= 10)
    {
        int lastDigit = n % 10;
        ans.push_back(lastDigit * i);
        n /= 10;
    }

    reverse(ans.begin(), ans.end());

    for (int i = 0; i < ans.size(); i++)
    {
        str += to_string(ans[i]);
        if (i != ans.size() - 1)
            str += '+';
    }
}

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int num ;
        cin >> num;
        string ans = "";

        solution(num, ans);
        cout << ans << endl;
    }
    return 0;
}