#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t, n, k, q;
    cin >> t;
    while (t--)
    {
        cin >> n >> k >> q;
        while (q--)
        {
            int a, b;
            cin >> a >> b;
            if (b - a >= k)
                cout << "1" << endl;
            else
                cout << "0" << endl;
        }
    }
    return 0;
}
/*
        1
        3 2 2
        1 2
        1 3

        0
        1

*/