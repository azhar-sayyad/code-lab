/*
input : 5
output :
    A
    ABA
    ABCBA
    ABCDCBA
    ABCDEDCBA
*/
#include <bits/stdc++.h>

using namespace std;
int main(){
    int n;
    cin>>n;

    char ch = 'A';

    for(int i = 0; i < n ;i++){
        char num;
        for(int j = 0 ; j <= i ; j++ ){
            num = ch + j;
            cout<<num;            
        }
        for(int j = 0 ; j < i ; j++){
            num -= 1;
            cout<<num;
        }
        cout<<endl;
    }
    return 0;
}