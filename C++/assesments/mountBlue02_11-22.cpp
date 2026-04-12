#include <bits/stdc++.h>

using namespace std;

int solution3(char *string)
{
    stack<int> st;
    int score = 1;
    int ans = 0;
    for (int i = 0; i < strlen(string) - 1; i++)
    {
        if (string[i] == '(' && string[i + 1] == '(')
            st.push(2);
        else if (string[i] == '(' && string[i + 1] == ')')
            ans++;
        else if ((string[i] == ')' && string[i + 1] == ')') && ans != 0)
        {
            st.push(ans);
            ans = 0;
        }
    }

    while (st.size())
    {
        score *= st.top();
        st.pop();
    }
    return (score + ans);
}

int solution2(char *string)
{
    int score = 0, ans = 0;
    for (int i = 0; i < strlen(string); i++)
    {
        // cout << string[i] << " ";
        if (string[i] == '(')
            score++;
        else if (string[i - 1] == '(')
        {
            ans += 1;
            score--;
        }
        else
            score--;
    }
    return score;
}

int solution1(char *str)
{
    stack<int> st;
    int score = 0;

    for (int i = 0; i < strlen(str); i++)
    {
        if (str[i] == '(')
        {
            st.push(score);
            score = 0;
        }
        else
        {
            score = st.top() + max(score * 2, 1);
            st.pop();
        }
    }
    return score;
}

int main()
{
    char str[50];
    cin >> str;

    cout << solution1(str) << endl;
    cout << solution2(str) << endl;
    cout << solution3(str) << endl;
    return 0;
}