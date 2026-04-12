#include <bits/stdc++.h>
using namespace std;

class NextSmaller
{
public:
    // TC O(n)    SC O(n)
    void solution2(int arr[], int size)
    {
        stack<int> smElement;
        smElement.push(-1);

        for (int i = size - 1; i >= 0; i--)
        {
            int element = arr[i];
            while (smElement.top() >= element)
                smElement.pop();

            cout << smElement.top() << " ";
            smElement.push(element);
        }
    }
    // TC O(n^2)    SC O(1)
    void solution1(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            int small = 0;
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] > arr[j])
                    small = arr[j];
            }
            if (small)
                cout << small << " ";
            else
                cout << "-1 ";
        }
    }
};
class PrevSmaller
{
public:
    // TC O(n)    SC O(n)
    void solution2(int arr[], int size)
    {
        stack<int> smElement;
        smElement.push(-1);

        for (int i = 0; i < size; i++)
        {
            int element = arr[i];
            while (smElement.top() >= element)
                smElement.pop();

            cout << smElement.top() << " ";
            smElement.push(element);
        }
    }
    // TC O(n^2)    SC O(1)
    void solution1(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            int small = 0;
            for (int j = i + 1; j < size; j++)
            {
                if (arr[i] > arr[j])
                    small = arr[j];
            }
            if (small)
                cout << small << " ";
            else
                cout << "-1 ";
        }
    }
};

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    NextSmaller next;
    PrevSmaller prev;
    
    next.solution1(arr, n);
    cout << endl;
    next.solution2(arr, n);
    cout << endl;
    prev.solution2(arr, n);
}