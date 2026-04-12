#include <bits/stdc++.h>
using namespace std;

//  TC = O(n)
//  SC = O(n)

bool valid(string str)
{
    stack<char> st;

    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] == '[' || str[i] == '{' || str[i] == '(')
            st.push(str[i]);
        else
        {
            if (!st.empty())
            {
                if ((st.top() == '{' && str[i] == '}') ||
                    (st.top() == '[' && str[i] == ']') ||
                    (st.top() == '(' && str[i] == ')'))
                {
                    st.pop();
                }
                else
                    return false;
            }
            else
                return false;
        }
    }
    if (st.empty())
        return true;
    else
        return false;
}
int main()
{
    string str = "{[({})]}";

    if (valid(str))
        cout << "vailid" << endl;
    else
        cout << "non valid" << endl;

    // string str = {{"{"}, {"["}, {"("}, {")"}, {"]"}, {"}"}};
}