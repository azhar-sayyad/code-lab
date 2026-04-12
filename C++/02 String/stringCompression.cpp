#include <bits/stdc++.h>

using namespace std;
void solution1(string str) // tc O(n) sc O(n)
{
    string ans = "";
    int count = 0;
    for (int i = 0; i < str.length();)
    {
        char ch = str[i];
        while (ch == str[i])
        {
            count++;
            i++;
        }
        ans.push_back(ch);
        if (count > 1)
            ans.push_back(count + '0');
        count = 0;
    }
    cout << ans << endl;
    return;
}
int solution2(string &str) // tc O(n) sc O(1)
{
    int i = 0;
    int ansIndex = 0;
    int n = str.length();
    while (i < n)
    {
        int j = i + 1;
        while (j < n && str[i] == str[j])
            j++;
        str[ansIndex++] = str[i];
        int count = j - i;
        if (count > 1)
        {
            string cnt = to_string(count);
            for (char ch : cnt)
            {
                str[ansIndex++] = ch;
            }
        }
        i = j;
    }
    return ansIndex;
}

int main()
{
    string str;
    cin >> str;

    solution1(str);
    int index = solution2(str);

    cout << str.substr(0,index) << endl;

    return 0;
}

/*
        input
        "a","a","b","b","b","c","c","d","1","1","2","3","3"

        output
        a2b3c2d12232
*/