#include <bits/stdc++.h>
using namespace std;

void swap(int &a, int &b)
{
    a = a * b; // a = 5 * 10      a = 50
    b = a / b; // b = 50 / 10     b = 5
    a = a / b; // a = 50 / 5      a = 10
}

int main()
{
    int a, b;
    cin >> a;
    cin >> b;
    cout << "before " << a << " " << b << endl;
    // swap(a, b);
    a = a * b; // a = 5 * 10      a = 50
    b = a / b; // b = 50 / 10     b = 5
    a = a / b; // a = 50 / 5      a = 10
    cout << "after " << a << " " << b << endl;
}