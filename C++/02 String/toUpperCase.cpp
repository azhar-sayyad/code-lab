#include <bits/stdc++.h>

using namespace std;

int main()
{

    // char small = 's';
    // char capital = 'C';
    // char sm = small - 'a' + 'A';
    // char cpt = capital - 'A' + 'a';
    // cout << "small " << sm << endl;
    // cout << "capital " << cpt << endl;

    char arr[20];

    cin >> arr;
    int len = getLength(arr)

    for (int i = 0; i < 5; i++)
    {
        int num = arr[i] - 'a' + 'A';
        cout << num << endl;
    }
    return 0;
}