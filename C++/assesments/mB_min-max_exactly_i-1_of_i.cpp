#include <bits/stdc++.h>
using namespace std;
void solution(int arr[])
{
    int mini = INT_MAX;
    int maxi = INT_MIN;
    for (int i = 0; i < 5; i++)
    {
        int sum = 0;
        for (int j = 0; j < 5; j++)
        {
            if (i == j)
                continue;
            sum += arr[j];
        }
        mini = min(mini, sum);
        maxi = max(maxi, sum);
    }
    cout << "min " << mini << " "
         << "max " << maxi << endl;
}
void solution2(int arr[])
{
    int allSum = 0;
    for (int i = 0; i < 5; i++)
        allSum += arr[i];
        
    int mini = INT_MAX;
    int maxi = INT_MIN;
    for (int i = 0; i < 5; i++)
    {
        int sum = allSum - arr[i];
        mini = min(mini, sum);
        maxi = max(maxi, sum);
    }
    cout << mini << " " << maxi << endl;
}

int main()
{
    int arr[5] = {12, 10, 11, 7, 9};
    solution(arr);
    solution2(arr);
    return 0;
}