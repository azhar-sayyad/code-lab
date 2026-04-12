#include <bits/stdc++.h>

using namespace std;

int main()
{
    string str;
    cin >> str;
    int j = str.length();
    while (j--)
    {
        for (int i = 0; i < str.length()-1; i++)
        {
            if (str[i] == str[i + 1])
                str.erase(i, 2);
        }
    }
    cout<<str;
    return 0;
}
/*
        input
        abbaca

        output
        ca

        abbaca
        aaca
        ca
*/