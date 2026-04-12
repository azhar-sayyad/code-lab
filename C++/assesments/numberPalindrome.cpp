#include <bits/stdc++.h>
using namespace std;

bool isPalindrome(int n){
    int num = n;
    int rev =0;

    while(num){
        int ld = num%10;
        rev = ld + rev*10;
        num = num/10;     
    }
    if(n == rev)
        return 1;
    return 0;
}
int main() {
	// your code goes here
	int t,n;
    cin>>t;
	while(t--){
	    cin>>n;
	    if(isPalindrome(n))
	        cout<<"wins"<<endl;
	    else
	        cout<<"loses"<<endl;
	}
	return 0;
}
