#include <bits/stdc++.h>

using namespace std;

int solution3(int size, int arr[], int k)
{
    int maxi = INT_MIN;
    int ans = 0;    //store Index
    for (int i = 0; i < k; i++)
    {
        int sum = 0;
        for (int j = i ; j < size; j += k)
            sum = sum + arr[j];
            
        if(maxi<sum){
            maxi = sum;
            ans = i+1;
        }
    }
    return ans;
}
int solution2(int size, int arr[], int k)
{
    map<int, int> map;
    for (int i = 0; i < k; i++)
    {
        int sum = arr[i];
        for (int j = i + k; j < size; j += k)
            sum = sum + arr[j];
        map[i+1] = sum;
    }
    int ans = INT_MIN;
    // auto it = map.begin();
    // while(it != map.end()){        
    //     cout<<it->second<<" ";
    //     it++;
    // }
    // cout<<endl;
    for(auto it :map){
        cout<<it.second <<" ";
    }
    // for (int i = 0; i < map.size(); i++)
    // {
    //     ans = max(ans, map[i]);
    //     cout << ans;
    // }
    return map[ans];
}
int solution1(int size, int arr[], int k)
{
    vector<int> ans;
    int i = 0;
    while (i < k)
    {
        int sum = arr[i];
        for (int j = i + k; j < size; j += k)
            sum += arr[j];
        // cout<<"s : "<<sum<<" ";
        ans.push_back(sum);
        i++;
    }
    int index = 0;
    int mxItem = 0;
    for (int i = 0; i < ans.size(); i++)
    {
        if (mxItem < ans[i])
        {
            index = i + 1;
            mxItem = ans[i];
        }
    }
    return index;
}

int main()
{
    int n, k;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    cin >> k;

    cout << solution1(n, arr, k) << endl;
    cout << solution3(n, arr, k) << endl;
    return 0;
}