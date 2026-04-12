#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n = 788;
    int notes;

    if (n >= 500)
    {
        notes = n / 500;
        n = n - (notes * 500);
        cout << "500 :" << notes << endl;
    }
    if (n >= 100)
    {
        notes = n / 100;
        n = n - (notes * 100);
        cout << "100 :" << notes << endl;
    }
    if (n >= 50)
    {
        notes = n / 50;
        n = n - (notes * 50);
        cout << "50 :" << notes << endl;
    }
    if (n >= 20)
    {
        notes = n / 20;
        n = n - (notes * 20);
        cout << "20 :" << notes << endl;
    }
    if (n >= 10)
    {
        notes = n / 10;
        n = n - (notes * 10);
        cout << "10 :" << notes << endl;
    }
    if (n >= 5)
    {
        notes = n / 5;
        n = n - (notes * 5);
        cout << "5 :" << notes << endl;
    }
    if (n >= 2)
    {
        notes = n / 2;
        n = n - (notes * 2);
        cout << "2 :" << notes << endl;
    }
    if (n >= 1)
    {
        notes = n / 1;
        n = n - (notes * 1);
        cout << "1 :" << notes << endl;
    }
}