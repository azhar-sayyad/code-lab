#include <bits/stdc++.h>

using namespace std;
int hexadecimaltoDecimal(string num)
{
    int ans = 0;
    int temp = 1;

    int s = num.size();

    for (int i = s - 1; i >= 0; i--)
    {
        if (num[i] >= '0' && num[i] <= '9')
        {
            ans += temp * (num[i] - '0');
        }
        else if (num[i] >= 'A' && num[i] <= 'F')
        {
            ans += temp * (num[i] - 'A' + 10);
        }
        temp *= 16;
    }
    return ans;
}

int main()
{
    string n;
    cin >> n;

    cout << hexadecimaltoDecimal(n);
}