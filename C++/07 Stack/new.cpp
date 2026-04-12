#include <bits/stdc++.h>
using namespace std;
vector<int> prevSmallElement(vector<int> arr, int n)
{
    vector<int> ans(n);
    stack<int> s;
    s.push(-1);
    for (int i = 0; i < n; i++)
    {
        while (s.top() != -1 && arr[s.top()] >= arr[i])
            s.pop();
        ans[i] = s.top();
        s.push(i);
    }
    return ans;
}
vector<int> nextSmallElement(vector<int> arr, int n)
{
    vector<int> ans(n);
    stack<int> s;
    s.push(-1);
    for (int i = n - 1; i >= 0; i--)
    {
        while (s.top() != -1 && arr[s.top()] >= arr[i])
            s.pop();
        ans[i] = s.top();
        s.push(i);
    }
    return ans;
}

int histogram(vector<int> arr, int n)
{
    vector<int> prevSmall(n);
    vector<int> nextSmall(n);
    prevSmall = prevSmallElement(arr, n);
    nextSmall = nextSmallElement(arr, n);

    int area = INT_MIN;

    for (int i = 0; i < n; i++)
    {
        // cout << nextSmall[i] << prevSmall[i] << arr[i] << endl;
        int height = arr[i];
        nextSmall[i] = nextSmall[i] == -1 ? n : nextSmall[i];
        int width = nextSmall[i] - prevSmall[i] - 1;
        int tempArea = height * width;
        // cout << tempArea << endl;
        area = max(area, tempArea);
    }
    return area;
}

int main()
{
    int size;
    cin >> size;

    vector<int> arr(size);
    for (int i = 0; i < size; i++)
    {
        int input;
        cin >> input;
        arr[i] = input;
    }
    int ans = histogram(arr, size);
    cout << ans << endl;

    return 0;
}