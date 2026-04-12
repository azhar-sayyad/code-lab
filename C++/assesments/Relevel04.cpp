#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> arr,int n,int m,int k){
    int hacker = arr[k-1];
    int median = (n+1)/2;
    sort(arr.begin(),arr.end());
    median = arr[median-1];
    cout<<"median"<<median<<endl;;

    while(hacker < median && hacker < m)
        hacker++;
    return hacker;   
}

int main()
{
    int n, m, k;    //n is size of array // m is max score // hacker student index;
    cin >> n;
    // int arr[n];
    vector<int> arr(n);
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    cin>>m>>k;
    cout<<solution(arr,n,m,k);

    return 0;
}

/* 
    in-put
    3
    5 1 3
    6 2
    out-put
    3