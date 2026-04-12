#include<iostream>
#include<sstream>
using namespace std;


int main(){
    string str ="45";
    int i;


    istringstream(str)>>i;
    cout<<i;
}