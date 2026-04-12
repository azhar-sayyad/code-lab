#include <iostream>
#include <map>
using namespace std;

int main()
{
    map<int, string> m;
    m[1] = "Azhar";
    m[5] = "cpp";
    m[3] = "azzu";
    m.insert({7, "cplusplus"});

    for (auto i : m)
        cout << i.first << " " << i.second << endl;
    cout << endl;
    m.erase(7);

    map<int, string>::iterator it;
    it = m.find(1);

    for (auto i = it; i != m.end(); i++)
        cout << (*i).first << " " << (*i).second << endl;
    return 0;
}