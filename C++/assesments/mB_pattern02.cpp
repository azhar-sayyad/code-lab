/*
        input
        {"Apple", "Mohan", "hp", "LG", "IBM", "Amit"}

        output
        e n
        l a t
        p h M i
        p o p G B m
        A M h L I A
*/

#include <bits/stdc++.h>

using namespace std;

int main()
{
    string str[] = {"Apple", "Mohan", "hp", "LG", "IBM", "Amit"};

    int mxLen = 0;
    for (int i = 0; i <= str->length(); i++)
        if (mxLen < str[i].length())
            mxLen = str[i].length() - 1;

    while (mxLen >= 0)
    {
        for (int i = 0; i <= str->length(); i++)
            if (str[i].length() - 1 >= mxLen)
                cout << str[i][mxLen] << " ";
        cout << endl;
        mxLen--;
    }
    return 0;
}