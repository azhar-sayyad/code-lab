#include <bits/stdc++.h>
using namespace std;

class Solution
{
private:
    vector<int> nextSmall(vector<int> arr, int size)
    {
        vector<int> ans(size);
        stack<int> s;
        s.push(-1);

        for (int i = size - 1; i > 0; i--)
        {
            int element = arr[i];
            while (s.top() != -1 && arr[s.top()] >= element)
                s.pop();

            ans[i] = s.top();
            s.push(i);
        }
        return ans;
    }
    vector<int> prevSmall(vector<int> arr, int size)
    {
        vector<int> ans(size);
        stack<int> s;
        s.push(-1);

        for (int i = 0; i < size; i++)
        {
            int element = arr[i];
            while (s.top() != -1 && arr[s.top()] >= element)
                s.pop();

            ans[i] = s.top();
            s.push(i);
        }
        return ans;
    }

public:
    // TC O(n)    SC O(n)
    void solution2(vector<int> v, int size)
    {
        vector<int> next(size);
        next = nextSmall(v, size);

        vector<int> prev(size);
        prev = prevSmall(v, size);

        int area = INT_MIN;
        for (int i = 0; i < size; i++)
        {
            int l = v[i];
            next[i] = next[i] == -1 ? size : next[i];
            int b = next[i] - prev[i] - 1;
            area = max(area, l*b);
        }
        cout << area << endl;
    }
    // TC O(n^2)    SC O(1)
    void solution1(int arr[], int size)
    {
        int ans = INT_MIN;
        for (int i = 0; i < size; i++)
        {
            int element = arr[i];
            int length = 1;
            // for right element
            for (int j = i + 1; j < size; j++)
            {
                if (element <= arr[j])
                    length++;
                else
                    break;
            }
            // for left element
            for (int j = i - 1; j > 0; j--)
            {
                if (element <= arr[j])
                    length++;
                else
                    break;
            }
            int largeRect = element * length;
            ans = max(ans, largeRect);
        }
        cout << ans << endl;
    }
};

int main()
{
    int size;
    cin >> size;
    vector<int> v(size);
    for (int i = 0; i < size; i++)
    {
        int val;
        cin >> val;
        v[i] = val;
    }

    Solution sol;
    sol.solution2(v, size);

    int arr[6] = {2, 1, 5, 6, 2, 3};
    sol.solution1(arr, 6);
}