#include <bits/stdc++.h>
using namespace std;

void reverseStr(string& str, int s, int e)
{
    if (s > e)
        return;

    swap(str[s], str[e]);

    reverseStr(str, ++s, --e);
}

int main()
{
    string str = "azhar";
    reverseStr(str, 0, str.length() - 1);
    cout << str;
}