#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> v(10,1);
    vector<int> a(v);   //copy vector v into a

    for (int i : a)
        cout << i << " ";

    cout<<a.capacity();
    a.push_back(0);
    cout<<a.capacity();

    return 0;
}