#include <bits/stdc++.h>
using namespace std;

bool palindrome(string str, int s, int e)
{
    if (s > e)
        return true;

    if (str[s] == str[e])
        return palindrome(str, ++s, --e);
    else
        return false;
}

int main()
{
    string str = "abbccbba";

    bool ans = palindrome(str, 0, str.length() - 1);
    cout << ans;
    return 0;
}