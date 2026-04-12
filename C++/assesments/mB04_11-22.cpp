#include <bits/stdc++.h>
using namespace std;

void solution(string msg, int key)
{
    string k = to_string(key);
    string ans = "";

    for (int i = 0; i < msg.length(); i++)
    {
        ans += to_string((msg[i] - 'a' + 1) + (k[(i % k.length())] - '0'));
        if (i != msg.length() - 1)
            ans += ' ';
    }
    cout << ans;
}

int main()
{
    string msg;
    int key;
    cin >> msg >> key;

    solution(msg, key);

    return 0;
}