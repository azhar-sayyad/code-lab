// my First C++ Program

#include <iostream>
using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif
    // cout << "Hello World!";
    int a, b, c;
    cin >> a >> b >> c ;
    cout << a + b << "\n";
    if (a>b){
        if(a>c){
            cout<<"a is bigger";
        }
        else{
            cout<<"c is bigger";
        }
    }
    else{
        if(b>c){
            cout<<"b is bigger";
        }
        else{
            cout<<" c is bigger";
        }
    }
    return 0;
}