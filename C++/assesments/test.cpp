#include <bits/stdc++.h>
using namespace std;
void swap(int a, int b)
{
    cout << a << "\t" << b << endl;
    a = a * b;
    b = a / b;
    a = a / b;
    cout << a << "\t" << b << endl;
}

int main()
{
    float f = 0.001;
    int a = 1;
    int b = 2;
    swap(a, b);

    if (++a == 2 && a++ == 2 && a++ == 3 && a++ == 4)
        cout << a++ << endl;
    cout << a << endl;
    
    if (a)
        cout << "true" << endl;

    if (f)
        cout << "t" << endl;
    else
        cout << "f" << endl;

    switch (a)
    {
    case 1:
        cout << "1";
    case 0:
        cout << "0";
    default:
        cout << "de";
    }
}