#include <bits/stdc++.h>

using namespace std;

void sol1(int arr[], int size)
{
    cout << "O(n2) solution" << endl;
    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (arr[j] < arr[i])
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
void sol2(int arr[], int size)
{
    int s = 0;
    int e = size - 1;
    int mid = 0;
    cout << "O(n) solution" << endl;

    while (mid <= e)
    {
        switch (arr[mid])
        {
        case 0:
            swap(arr[mid++], arr[s++]);
            break;
        case 1:
            mid++;
            break;
        case 2:
            swap(arr[mid], arr[e--]);
            break;
        }
    }
}

int main()
{
    int arr[6] = {1, 2, 0, 2, 0, 1};

    // sol1(arr, 6);
    sol2(arr, 6);

    for (int i = 0; i < 6; i++)
    {
        cout << arr[i] << " ";
    }
}