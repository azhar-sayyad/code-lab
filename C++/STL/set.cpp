#include <iostream>
#include <set>

using namespace std;

int main()
{
    set<int> s;

    s.insert(4);
    s.insert(4);
    s.insert(2);
    s.insert(1);
    s.insert(3);

    for (int i : s)
        cout << i << " ";
    cout << endl;

    set<int>::iterator it;
    it = s.begin();
    cout << "begin " << *it << endl;
    it = s.end();
    cout << "end " << *it << endl;

    it = s.find(3);
    for (auto i = it; i != s.end(); i++)
        cout << *i << " ";

    return 0;
}