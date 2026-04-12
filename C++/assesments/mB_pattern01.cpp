/*
        input = 4
        output
        4 4 4 4 4 4 4
        3 3 3 3 3
        2 2 2
        1
        2 2 2 2
        3 3 3 3 3 3
        4 4 4 4 4 4 4 4

*/
#include <bits/stdc++.h>

using namespace std;
void solution(int n)
{
    int i = n * 2 - 1;
    int count = n;
    while (i >= 1)
    {
        int j = i;
        while (j--)
            cout << count << " ";
        cout << endl;
        count--;
        i -= 2;
    }
    i = 4;
    count += 2;
    // cout << i << count << endl;
    while (i <= n * 2)
    {
        int j = i;
        while (j--)
            cout << count << " ";
        cout << endl;
        count++;
        i += 3;
    }
}

int main()
{
    int n = 4;
    // cin >> n;
    solution(n);
    cout << endl;
    int num = n * 2;
    for (int i = n; i > 0; i--)
    {
        if (num % 2 == 0)
            num--;
        for (int j = 0; j < num; j++)
            cout << i << " ";
        cout << endl;
        num--;
    }
    num = 4;
    // num = n;
    for (int i = 2; i <= n && num <= n * 2; i++)
    {
        if (num % 2 != 0)
            num++;
        for (int j = 0; j < num; j++)
            cout << i << " ";
        cout << endl;
        num++;
    }

    return 0;
}