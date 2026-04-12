#include <bits/stdc++.h>
using namespace std;
void nintyDeg(int arr[][3])
{
    for (int col = 0; col < 3; col++)
    {
        for (int row = 2; row >= 0; row--)
            cout << arr[row][col] << " ";
        cout << endl;
    }
}
void oneEightyDeg(int arr[][3])
{
    for (int row = 2; row >= 0; row--)
    {
        for (int col = 2; col >= 0; col--)
            cout << arr[row][col] << " ";
        cout << endl;
    }
}
void twoSeventyDeg(int arr[][3])
{
    for (int col = 2; col >= 0; col--)
    {
        for (int row = 0; row < 3; row++)
            cout << arr[row][col] << " ";
        cout << endl;
    }
}

int main()
{

    int arr[3][3];
    // int arr[3][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // int arr[3][3] = {{1, 11, 111}, {2, 22, 222}, {3, 33, 333}};

    for (int row = 0; row < 3; row++)
        for (int col = 0; col < 3; col++)
            cin >> arr[row][col];

    cout << "90" << endl;
    nintyDeg(arr);
    cout << "180" << endl;
    oneEightyDeg(arr);
    cout << "270" << endl;
    twoSeventyDeg(arr);

    return 0;
}