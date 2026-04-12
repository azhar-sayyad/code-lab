#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a = 5;
    int b = 7;
    cout << "a&b " << (a & b) << endl;
    cout << "a|b " << (a | b) << endl;
    cout << "~b " << ~a << endl;
    cout << "a^b " << (a ^ b) << endl;

    // left shift operator <<
    cout << "a<<2 " << (a << 1)<< endl;
    // right shift operator >>
    cout << "a>>2 " << (a >> 1)<< endl;

    // post increment
    cout<<"a++ "<<a++<<endl;
    cout<<"a "<<a<<endl;
    // pre increment
    cout<<"++a "<<++a<<endl;
 
}