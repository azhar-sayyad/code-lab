#include <bits/stdc++.h>
using namespace std;

// TC O(n^2)    SC O(1)
int solution1(vector<vector<int>> arr, int size)
{
    for (int i = 0; i < size - 1; i++)
    {
        bool isCelebrity = 1; // flag
        // check row
        for (int j = 0; j < size; j++)
            if (arr[i][j] == 1 && i != j)
                isCelebrity = 0;

        // check column
        for (int j = 0; j < size && isCelebrity != 0; j++)
            if (arr[j][i] == 0 && i != j)
                isCelebrity = 0;

        if (isCelebrity == 1)
            return i;
    }
    return 0;
}
// TC O(n)    SC O(n)
int solution2(vector<vector<int>> arr, int size)
{
    stack<int> s;
    for (int i = 0; i < size; i++)
        s.push(i);

    while (s.top() > 1)
    {
        int a = s.top();
        s.pop();
        int b = s.top();
        s.pop();

        if (arr[a][b] == 1)
            s.push(b);
        else
            s.push(a);
    }
    int ans = s.top();

    for (int i = 0; i < size; i++)
        if (arr[ans][i] == 1 && ans != i)
            return -1;

    for (int i = 0; i < size; i++)
        if (arr[i][ans] == 0 && i != ans)
            return -1;
    return ans;
}

int main()
{
    int n;
    cin >> n;
    vector<vector<int>> arr(n);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            int input;
            cin >> input;
            arr[i].push_back(input);
        }
    }

    cout << solution1(arr, n) << endl;
    cout << solution2(arr, n) << endl;

    return 0;
}
