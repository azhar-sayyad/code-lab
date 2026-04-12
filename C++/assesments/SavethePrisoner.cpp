#include <bits/stdc++.h>
using namespace std;

int saveThePrisoner(int n, int m, int s)
{
    while (m--)
    {
        if(s == n)
            s = 1;
        cout << s << " " << m << endl;
        // m--;
        s++;
    }
    cout << endl
         << endl;
    return s;
}

int main()
{
    int t, n, m, s;
    cin >> t;
    while (t--)
    {
        cin >> n >> m >> s;
        cout << saveThePrisoner(n, m, s) << endl;
    }

    return 0;
}