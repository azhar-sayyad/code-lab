#include <iostream>
using namespace std;

int fact(int num)
{
    int fact = 1;
    for (int i = 1; i <= num; i++)
    {
        fact *= i;
    }
    return fact;
}

int main()
{
    int n;
    n = 3;
    int ans = fact(n);
    cout << ans << endl;
}