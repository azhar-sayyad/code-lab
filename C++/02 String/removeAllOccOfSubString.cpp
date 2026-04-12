#include <bits/stdc++.h>

using namespace std;

int main()
{
    string str, part;
    cin >> str >> part;
    while (str.length() != 0 && str.find(part) < str.length())
    {
        str.erase(str.find(part), part.length());
    }
    cout << str << endl;
    // string str = {"my name is khan"};
    // string part = {"is"};
    // str.erase(str.find("is"), part.length());
    // cout << str << endl;

    // cout << str.find("is");

    return 0;
}

/*
        input 
        str = abbabcababcc
        part = abc

        output 
        abb
*/