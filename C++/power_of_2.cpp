#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int flag = false;

    int pow = 2;
    while (pow <= n)
    {
        if (pow == n)
        {
            flag = true;
            break;
        }
        pow = pow * 2;
    }
    cout << flag;
    
}