#include <bits/stdc++.h>
using namespace std;

vector<int> nextSmall(vector<int> arr, int n)
{
    vector<int> ans(n);
    stack<int> s;
    s.push(-1);
    for (int i = n - 1; i > 0; i--)
    {
        int element = arr[i];
        while (s.top() != -1 && arr[s.top()] >= element)
            s.pop();
        ans[i] = s.top();
        s.push(i);
    }
    return ans;
}
vector<int> prevSmall(vector<int> arr, int n)
{
    vector<int> ans(n);
    stack<int> s;
    s.push(-1);
    for (int i = 0; i < n; i++)
    {
        int element = arr[i];
        while (s.top() != -1 && arr[s.top()] >= element)
            s.pop();
        ans[i] = s.top();
        s.push(i);
    }
    return ans;
}
int longHistogram(vector<int> arr, int n)
{
    vector<int> next(n);
    next = nextSmall(arr, n);
    vector<int> prev(n);
    prev = prevSmall(arr, n);

    int maxArea = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        next[i] = next[i] == -1 ? n : next[i];
        int length = next[i] - prev[i] - 1;
        int height = arr[i];

        int area = height * length;
        maxArea = max(area, maxArea);
    }
    // cout<<maxArea<<" ";
    return maxArea;
}
int maxRectangle(vector<vector<int>> arr, int n)
{
    int maxArea = longHistogram(arr[0], n);
    for (int i = 1; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (arr[i][j] != 0)
                arr[i][j] = arr[i][j] + arr[i - 1][j];
            else
                arr[i][j] = 0;
        }
        maxArea = max(maxArea, longHistogram(arr[i], n));
    }
    return maxArea;
}

int main()
{
    int size;
    cin >> size;

    vector<vector<int>> arr(size);
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            int input;
            cin >> input;
            arr[i].push_back(input);
        }
    }
    cout << maxRectangle(arr, size);
    return 0;
}