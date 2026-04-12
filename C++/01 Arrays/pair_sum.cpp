#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int s = 3;
    // vector<int> ans;
    // cout<<10+20+"sum"<<endl;
    // cout<<"sum"+10+20<<endl;
    // cout<<10+"sum"+20<<endl;

    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if(arr[i]+arr[j]==s){
                // ans.push_back(arr[i]);
                // ans.push_back(arr[j]);
                cout<<arr[i]+arr[j]<<endl;
                

            }
        }
    }
}