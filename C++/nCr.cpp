#include <iostream>

using namespace std;

int fact(int num)
{
    int fact = 1;

    for (int i = 2; i <= num; i++)
    {
        fact *= i;
    }
    return fact;
}

int main()
{
    int n, r;
    n = 5;
    r = 2;

    int ans = fact(n) / (fact(r) * fact(n - r));
    cout << ans << endl;
}