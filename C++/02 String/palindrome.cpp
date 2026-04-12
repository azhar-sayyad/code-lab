#include <bits/stdc++.h>
using namespace std;
void palindrome(string str)
{
    int st = 0;
    int end = str.length()-1;
    while (st < end)
    {
        if (str[st++] != str[end--])
        {
            cout << "No" << endl;
            return;
        }
    }
    cout<<"yes"<<endl;
}

int main()
{
    string str;
    cin >> str;
    palindrome(str);

    return 0;
}