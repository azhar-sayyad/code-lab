#include <bits/stdc++.h>
using namespace std;

int tour(int p[], int d[], int n)
{
    int balance = 0;
    int start = 0;
    int dificit = 0;

    for (int i = 0; i < n; i++)
    {
        balance = balance + p[i] - d[i];
        if (balance < 0)
        {
            dificit += balance;
            start = i + 1;
            balance = 0;
        }
    }
    if (dificit + balance >= 0)
        return start;
    else
        return -1;
}

int main()
{
    int size;
    cin >> size;

    int petrol[size];
    int distance[size];

    for (int i = 0; i < size; i++)
        cin >> petrol[i];
    for (int i = 0; i < size; i++)
        cin >> distance[i];

    int ans = tour(petrol, distance, size);
    cout << ans << endl;
    return 0;
}