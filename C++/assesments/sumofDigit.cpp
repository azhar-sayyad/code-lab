#include <bits/stdc++.h>
using namespace std;

int sumDigit(int num)
{
    int sum = 0;
    while (num != 0)
    {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}

int main()
{
    int num;
    cin >> num;
    int sum = 0;
    cout << sumDigit(num);
    
    // while (num > 0)
    // {
    //     int lastDigit = num % 10;
    //     sum += lastDigit;
    //     num = num / 10;
    // }
    // cout << sum;
}