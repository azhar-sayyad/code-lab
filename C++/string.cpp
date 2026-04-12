#include <bits/stdc++.h>

using namespace std;

int main()
{

    char arr[20];

    cin >> arr;

    // for (int i = 0; i < 5; i++)
    // {
    // }
    int i = 1, j = 0;
    while (j < arr.length())
    {
        if (arr[i] == arr[j])
        {
            arr.erase(arr[j], arr[i])
        }
        i++;
        j++;
    }
    return 0;
}