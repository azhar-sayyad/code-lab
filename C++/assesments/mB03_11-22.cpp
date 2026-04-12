#include <bits/stdc++.h>
using namespace std;

int nonStopHotspot(string str)
{
    int count = 0;
    bool phonefound = 0;
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] == '*')
            count++;
        else if (str[i] == 'p')
            phonefound = 1;
        else if (str[i] == '#' && phonefound)
            return count;
        else
            count = 0;
    }
    return 0;
}

int main()
{
    string str;
    cin >> str;
    cout << nonStopHotspot(str);
    return 0;
}