#include <iostream>

using namespace std;

int binarytoDecimal(int num)
{
    int ans = 0;
    int temp = 1;

    while (num > 0)
    {
        int lastDigit = num % 10;
        ans += temp * lastDigit;
        temp *= 2;
        num /= 10;
    }
    return ans;
}

int main()
{
    int n;
    cin >> n;

    cout << binarytoDecimal(n) << endl;
}