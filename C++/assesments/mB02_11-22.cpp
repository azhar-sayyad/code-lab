#include <bits/stdc++.h>
using namespace std;

void solution(string msg, int key)
{
    string k = to_string(key);
    string ans = "";

    for (int i = 0; i < msg.length(); i++)
    {
        int key = k[i % k.length()] - '0';
        int massage = msg[i] - 'a' + 1;
        ans += to_string(massage + key);
        if (i != msg.length() - 1)
            ans += ',';
    }
    cout << ans;
}

int main()
{
    string msg = "start";
    int key = 1357;

    solution(msg, key);

    // string ans = "";
    // string k = to_string(key);

    // for (int i = 0; i < msg.length(); i++)
    // {
    //     ans += to_string((msg[i] - 'a' + 1) + (k[(i % k.length())] - '0'));
    //     if (i != msg.length() - 1)
    //         ans += ',';
    // }
    
    return 0;
}