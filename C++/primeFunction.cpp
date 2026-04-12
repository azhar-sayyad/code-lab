#include <iostream>
#include <cmath>

using namespace std;

bool ifPrime(int num)
{
    for (int i = 2; i <= sqrt(num); i++)
    {
        if (num % i == 0)
        {
            return false;
        }
    }
    return true;
}

int main()
{
    int a, b;
    a = 10;
    b = 30;

    for (int i = a; i <= b; i++)
    {
        if (ifPrime(i))
        {
            cout << i << endl;
        }
    }
}