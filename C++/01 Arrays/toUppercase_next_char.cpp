#include <bits/stdc++.h>
using namespace std;

char NextChar(char ch)
{
    char a = ++ch;
    cout << a << endl;
    // return toupper(a);
    return a;
}

int main()
{
    char ch = 'a';
    ch = toupper(NextChar(ch));
    cout << "uppercase " << ch << endl;

    char ch2 = 123456;
    cout << ch2;
    cout << endl;
    int a = 0;
    int b = 9;
    cout << !a || b;
    cout << 0 && 1;
    float f = 12.44;
    double d = 12.44444444;
    bool bol = 0;

    // size of int = 4 byte = 4*8 = 32 bit

    cout << endl
         << "int " << sizeof(a) << " char " << sizeof(ch2) << " float " << sizeof(f) << " double " << sizeof(d) << " boolean " << sizeof(bol) << endl;
}