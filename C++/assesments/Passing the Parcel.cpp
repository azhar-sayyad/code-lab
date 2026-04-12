#include <bits/stdc++.h>
using namespace std;

int solution(string str, int N)
{
    vector<int> v;
    for (int i = 1; i <= N; i++)
        v.push_back(i);

    int i = 0; // family members index
    int j = 0; // song lyrics index

    while (1)
    {
        if (i == v.size())
            i = 0;
        if (j == str.size())
            j = 0;
        if (v.size() == 1)
            return v[0];
        if (str[j] == 'y')
            v.erase(v.begin() + i);
        else
            i++;
        j++;
    }
}

int main()
{
    int n;
    cin >> n;

    string str;
    cin >> str;

    int ans = solution(str, n);
    cout << ans << endl;

    return 0;
}