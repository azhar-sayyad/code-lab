#include <iostream>

using namespace std;

int main()
{

    int n;
    cin >> n;
    int sum = 0;

    cout << (n * (n + 1)) / 2 << endl;

    for (int i = 1; i <= n; i++)
    {
        sum += i;
    }
    cout << sum << endl;
}