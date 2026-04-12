#include <bits/stdc++.h>
using namespace std;

bool redundant(string str)
{
    stack<char> s;
    for (int i = 0; i < str.length(); i++)
    {
        char ch = str[i];
        if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/')
            s.push(ch);
        else
        {
            // if (!s.empty())
                if (ch == ')')
                {
                    bool isRedundant = true;
                    while (s.top() != '(')
                    {
                        char top = s.top();
                        if (top == '+' || top == '-' || top == '*' || top == '/')
                            isRedundant = false;
                        s.pop();
                    }
                    if (isRedundant)
                        return true;
                    s.pop();
                }
        }
    }
    return false;
}

int main()
{
    string str = "((a+b)+3)";

    //((a+b)+3)
    if (redundant(str))
        cout << "redundant";
    else
        cout << "non redundant";
}