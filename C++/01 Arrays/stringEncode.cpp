#include <bits/stdc++.h>
#include <cstring>
#include <cctype>

using namespace std;

string stringEncode(string str)
{
    if (isupper(str) || str.length() != 9)
    {
        return "invalid";
    }
    return "valid";
}

int main()
{
    string str = "mairarose";

    cout << str << endl;
    cout << str.length() << endl;
    cout << str.size() << endl;
    // cout << stringEncode(str);
    cout << str;
}