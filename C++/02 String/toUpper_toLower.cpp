#include <bits/stdc++.h>
using namespace std;

void toUpper(char ch[])
{
    for (int i = 0; ch[i] != '\0'; i++)
        if (ch[i] >= 'a' && ch[i] <= 'z')
            ch[i] = ch[i] - 'a' + 'A';
    // char temp = ch[i] -'a';
    // ch[i] = ch[i] + 'A';
}
void toLower(char ch[])
{
    for (int i = 0; ch[i] != '\0'; i++)
        if (ch[i] >= 'A' && ch[i] <= 'Z')
            ch[i] = ch[i] - 'A' + 'a';
}

int main()
{
    char ch[100];
    cin >> ch;
    cout << ch << endl;
    toUpper(ch);
    cout << ch << endl;
    toLower(ch);
    cout << ch << endl;

    return 0;
}