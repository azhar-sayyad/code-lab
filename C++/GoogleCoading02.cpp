#include <bits/stdc++.h>
using namespace std;
void solution(char arr[], int size)
{
    char arr2[size];
    for (int i = 1; i <= size; i++)
        arr2[arr[i] - 'a'] = arr[i];

    for (int i = 0; arr2[i] != '\0'; i++)
        cout << arr2[i];

}
int main()
{
    int size;
    cin >> size;

    char arr[size];
    cin >> arr;
    solution(arr, size);
}