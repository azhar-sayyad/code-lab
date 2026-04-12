#include <bits/stdc++.h>

using namespace std;
int main()
{
    string str[10] = {{"YES"}, {"yES"}, {"yes"}, {"Yes"}, {"YeS"}, {"Noo"}, {"orZ"}, {"yEz"}, {"Yas"}, {"XES"}};
    int n = sizeof(str) / sizeof(str[0]);

    for (int i = 0; i < n; i++)
    {
        if (str[i] == "yes" || str[i] == "yeS" || str[i] == "yEs" || str[i] == "yES" || str[i] == "Yes" || str[i] == "YeS" || str[i] == "YEs" || str[i] == "YES")
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }

}