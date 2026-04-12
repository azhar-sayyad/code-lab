#include <bits/stdc++.h>
using namespace std;

int findDigits(int n) {
    int count = 0;
    int num = n;
    while(num != 0){
        int digit = num%10;
        // cout<<digit<<" ";
        if(digit != 0 && n % digit == 0)
            count++;
        num /=10;
    }
    cout<<endl;
    return count;
}

int main()
{
    int n;
    cin>>n;
    int ans = findDigits(n);
    cout<<ans;

    return 0;
}