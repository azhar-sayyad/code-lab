#include <bits/stdc++.h>
using namespace std;


class car
{
private:
    string name;
    int price;

public:

    car() // Constructor
    {
        cout << "Constructor Called" << endl;
    }
    car(string name, int price) // Parameterised Constructor
    {
        this->name = name;
        this->price = price;
    }

    // getter
    string getName()
    {
        return name;
    }
    int getPrice()
    {
        return price;
    }
    // setter
    void setName(string name)
    {
        this->name = name;
    }
    void setPrice(int price)
    {
        this->price = price;
    }
};

int main()
{
    // static
    car audi;

    car maruti("BMW", 3500000);

    cout << "car name " << maruti.getName() << endl;
    cout << "car price " << maruti.getPrice() << endl;

    // dynamic
    car *d = new car(maruti);
    cout << "car name " << d->getName() << endl;`
    cout << "car price " << d->getPrice() << endl;

    car *c = new car();
    c->setName("maruti");
    c->setPrice(60000);
    cout << "car name " << c->getName() << endl;
    cout << "car price " << c->getPrice() << endl;
    return 0;
}