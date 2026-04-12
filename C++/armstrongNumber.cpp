#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int n = 153;
    int nvalue = n;

    int sum = 0;
    while (n > 0)
    {
        int lastdigit = n % 10;
        sum += pow(lastdigit, 3);
        n = n / 10;
    }
    if (sum == nvalue)
    {
        cout << "armstrong Number";
    }
    else
        cout << "not";
}