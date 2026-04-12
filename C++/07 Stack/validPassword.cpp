#include <bits/stdc++.h>

using namespace std;
// a - 33 z - 58
// A - 1 B - 26

int validPass(int len,string str){

    string dig = "! @ # $ % ^ & * ( ) _ +";

    bool found = str.find(dig);
    cout<<found<<endl;


    // int ch1 = str[0] -'A' + 1;
    // cout<<ch1<<" ";
    // int ch2 = str[1] -'A' + 1;
    // cout<<ch2<<" ";
    // for(int i = 0;i<len;i++){
    //     int ch = str[i] -'A' + 1;
    //     cout<<ch<<" ";
    // }
    return 0;

}
int main(){
    string str;
    cin>>str;
    int len = str.size();
    // cout<<str<<" "<<len<<endl;

    cout<< validPass(len,str);

    return 0;
}