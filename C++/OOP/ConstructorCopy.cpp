#include <bits/stdc++.h>
using namespace std;
class Bot
{

public:
    char *name;

    // Constructor
    Bot()
    {
        cout << "Constructor is called " << endl;
        name = new char[50];
    }
    Bot(char name[])
    {
        this->name = name;
    }
    // copy Constructor
    Bot(Bot &temp)
    {
        this->name = temp.name;
    }

    void setName(char name[])
    {
        this->name = name;
        // strcpy(this->name,name);
    }
    void print()
    {
        cout << name << endl;
    }
};

int main()
{

    Bot b1;

    char name[10] = "azhar";
    b1.setName(name);
    b1.print();

    Bot b2(b1);
    b2.print();

    b1.name[0] = 'z';
    b1.print();
    b2.print();

    return 0;
}