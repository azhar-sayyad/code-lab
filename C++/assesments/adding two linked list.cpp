#include <bits/stdc++.h>
using namespace std;

void print(list<int> ans)
{
    for (auto i : ans)
        cout << i << " ";
}

void solution(int n1, int n2, list<int> list1, list<int> list2)
{
    list<int> ans;
    int n = (n1 > n2) ? n = n1 : n = n2;
    int sum, carry = 0;
    for (int i = 0; i < n; i++)
    {
        if (i >= n1)
        {
            sum = list2.front() + carry;
            list2.pop_front();
        }
        else if (i >= n2)
        {
            sum = list1.front() + carry;
            list1.pop_front();
        }
        else
        {
            sum = list1.front() + list2.front() + carry;
            list1.pop_front();
            list2.pop_front();
        }

        if (sum > 9 && i != n - 1)
        {
            carry = sum / 10;
            sum %= 10;
        }
        ans.push_back(sum);
    }
    // print element
    print(ans);
}

int main()
{
    int n1, n2, input;
    cin >> n1 >> n2;
    list<int> list1, list2;

    for (int i = 0; i < n1; i++)
    {
        cin >> input;
        list1.push_back(input);
    }
    for (int i = 0; i < n2; i++)
    {
        cin >> input;
        list2.push_back(input);
    }

    solution(n1, n2, list1, list2);

    return 0;
}