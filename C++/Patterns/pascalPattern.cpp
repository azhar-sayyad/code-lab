#include <iostream>

using namespace std;

int fact(int num)
{
    int fact = 1;
    for (int i = 2; i <= num; i++)
        fact *= i;
    return fact;
}

int main()
{

    int n;
    n = 5;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= i; j++)
            cout << fact(i) / (fact(j) * fact(i - j)) << " ";
        cout << endl;
    }
}