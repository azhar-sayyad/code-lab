#include <bits/stdc++.h>
using namespace std;

void print(int n)
{
    if (n == 0)
        return;
    print(n - 1);
    cout << "hello world " << n << endl;
}

void whileLoop(int n)
{
    while (n--)
        cout << "hello World" << endl;
}
void doWhile(int n)
{
    do
    {
        cout << "hello" << endl;
    } while (--n);
}

int main()
{
    int n = 10;

    print(n);
    whileLoop(n);
    doWhile(n);

    return 0;
}