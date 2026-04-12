#include <bits/stdc++.h>
using namespace std;
int minCost(string str)
{
    if (str.length() % 2 != 0)  //if str length is Odd
        return -1;

    stack<char> s;
    for (int i = 0; i < str.length(); i++)
    {
        char ch = str[i];
        if (ch == '{')
            s.push(ch);
        else
        {
            if (s.top() = +'{')
                s.pop();
            else
                s.push(ch);
        }
    }
    int a = 0; // count of {
    int b = 0; // count of }

    while (!s.empty())
    {
        if (s.top() == '{')
            a++;
        else
            b++;
        s.pop();
    }
    int ans = (a + 1) / 2 + (b + 1) / 2;
    return ans;
}

int main()
{
    string str = "{}{}{}{{}}{{{{";

    cout << minCost(str);
}