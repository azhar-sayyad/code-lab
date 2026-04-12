#include <iostream>
#include <stack>

using namespace std;

int main()
{

    string str = "hello";
    stack<char> st;

    for (int i = 0; i < str.size(); i++)
    {
        st.push(str[i]);
    }
    string ans = "";

    while (!st.empty())
    {
        // ans += st.top();
        ans.push_back(st.top());
        st.pop();
    }

    cout << str << endl;
    cout << ans;
}