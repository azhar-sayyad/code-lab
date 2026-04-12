/*
        input
        moirarose

        output
        rarptf13oi

        part1 : moi to 13oi
        part2 : rar to rar
        part3 : ose to ptf
*/

#include <bits/stdc++.h>

using namespace std;

string solution(string &str)
{
    string part1 = str.substr(0, 3);
    string part2 = str.substr(3, 3);
    string part3 = str.substr(6, 3);

    string ans;

    // part 1 :- first
    int num = part1[0] - 'a' + 1;
    part1 = to_string(num) + part1[1] + part1[2];

    // part 2 :- reverse
    char temp = part2[0];
    part2[0] = part2[2];
    part2[2] = temp;

    // part 3 :- next alphabet a->b ,b->c,
    for (int i = 0; i < 3; i++)
    {
        int next = part3[i] - 'a' + 1;
        if (next == 26) // if input is 'z' then next alphabet is 'a'
            next = 0;
        part3[i] = next + 'a';
    }
    ans = part2;
    ans += part3;
    ans += part1;

    return ans;
}

int main()
{
    string str = "moirarose";

    cout << str << endl;
    string ans;

    ans = solution(str);
    cout << ans << endl;

    return 0;
}