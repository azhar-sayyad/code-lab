#include <bits/stdc++.h>

using namespace std;

void sol(int number)
{
    if (number % 11 == 0)
        cout << "Foo ";
    if (number % 17 == 0)
        cout << "Bar" << endl;
}

int main()
{
    int n;
    cin >> n;
    sol(n);
}