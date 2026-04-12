
#include <bits/stdc++.h>
#include <cstring>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int list[n];
    for (int i = 0; i < n; i++)
    {
        cin >> list[i];
    }
    string str[n];
    for (int i = 0; i < n; i++)
    {
        cin >> str[i];
    }
    for (int i = 0; i < n; i++)
    {
        if (list[i] == str[i].length())
        { // uppercase
            char ch[str->length() + 1];
            strcpy(ch, str[i].c_str());

            for (int j = 0; j < sizeof(ch); j++)
            {
                ch[j] = toupper(ch[j]);
            }
            str[i] = ch;
        }
        else
        { // lower case
            char ch[str->length() + 1];
            strcpy(ch, str[i].c_str());

            for (int j = 0; j < sizeof(ch) - 1; j++)
            {
                ch[j] = tolower(ch[j]);
            }
            str[i] = ch;
        }
    }

    string ans[n];
    for (int i = 0; i < n; i++)
    {
        ans[list[i] - 1] = str[i];
    }
    for (int i = 0; i < n; i++)
    {
        cout << ans[i] << endl;
    }
}

/*
Write a program to print a list of strings in the predefined order,
with the following modifications: 

If the string’s length is equal to its printed position,
convert string to UPPERCASE

Else convert the string to lowercase

Except if the string’s position is unchanged from its original position

Input will be a number N, then a list of N non-repeating numbers defining the required position of the string,
and finally the list of N non-repeating strings.
Output will be a list of N strings at the required location, with the required changes.

input:

5
5
4
3
1
2
Dog
Goat
Cat
Horse
Elephant

output:

horse
elephant
CAT
GOAT
dog

*/