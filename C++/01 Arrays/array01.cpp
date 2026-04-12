#include <bits/stdc++.h>
using namespace std;

void arrPrint(int arr[], int size)
{

    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << endl;
    }
}

int main()
{
    int arr[10] = {0};
    int arr2[15] = {1, 2};
    int n = sizeof(arr2) / sizeof(int);
    cout << n << endl;
    arrPrint(arr, 10);
    cout<<INT_MIN<<"  "<<INT_MAX<<endl;
    return 0;
}