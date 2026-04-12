#include <bits/stdc++.h>
using namespace std;

int main()
{
    // int data = 2399;
    // int k = 2;
    int data, k;
    cin >> data >> k;
    vector<int> arr;

    while (data > 0)
    {
        arr.push_back(data % 10);
        data = data / 10;
    }
    int s = 0;
    int e = arr.size() - 1;
    while (s <= e)
        swap(arr[s++], arr[e--]);

    int count = 0;
    while (k > 0)
    {
        if (k == 1)
            arr[count++] = 0;
        else
            arr[count++] = 1;
        k--;
    }
    /**************  output  **************/
    for (int i = 0; i < arr.size(); i++)
        cout << arr[i];

    return 0;
}