#include <bits/stdc++.h>
using namespace std;
bool isValid(char s)
{
    if (s >= 'a' && s <= 'z' || s >= 'A' && s <= 'Z' || s >= '0' && s <= '9')
        return 1;
    return 0;
}
void toLower(char &ch)
{
    if (ch >= 'A' && ch <= 'Z')
        ch = ch - 'A' + 'a';
}

bool validPalindrome(string str)
{
    int s = 0;
    int e = str.length() - 1;
    while (s < e)
    {
        while (!isValid(str[s]))
            s++;
        while (!isValid(str[e]))
            e--;
        if (s >= e)
            break;
        toLower(str[s]);
        toLower(str[e]);
        // cout << str[s] << " " << str[e] << endl;
        if (str[s++] != str[e--])
            return 0;
    }
    return 1;
}

int main()
{
    string str = {"abcd@!0 $0d &cbA"};
    // string str = {"my name, emaN: yM"};
    cout << validPalindrome(str);
    return 0;
}
/*
        input
        abcd@!0 $0d &cbA

        output
        true

        ignore speical char and blank spaces__

*/