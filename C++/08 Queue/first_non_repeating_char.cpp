#include <bits/stdc++.h>
using namespace std;

string solution(string str)
{
    unordered_map<char, int> count;
    queue<int> q;
    string ans = "";

    for (int i = 0; i < str.length(); i++)
    {
        char ch = str[i];

        count[ch]++;

        q.push(ch);

        while (!q.empty())
        {
            if (count[q.front()] > 1)
                q.pop();
            else
            {
                ans.push_back(q.front());
                break;
            }
            if (q.empty())
                ans.push_back('#');
        }
    }
    return ans;
}

int main()
{
    string str;
    cin >> str;
    cout << solution(str);
    return 0;
}