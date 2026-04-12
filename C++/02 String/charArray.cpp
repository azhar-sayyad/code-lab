
#include <bits/stdc++.h>
using namespace std;

void update(int **p2)
{
    // No change
    // p2 = p2 + 1;

    // change in
    *p2 = *p2 + 1;

    // change....
    // **p2 = **p2 + 1;
}

int main()
{
    int in[10] = {0};
    char ch[10] = {0};
    float fl[10] = {0};
    double dou[10] = {0};

    cout << sizeof(dou) << endl;
    cout << sizeof(fl) << endl;
    cout << sizeof(ch) << endl;
    cout << sizeof(in) << endl;
    cout << endl;
    cout << "size of doubble  " << sizeof(dou) / sizeof(dou[0]) << endl;
    cout << "size of float  " << sizeof(fl) / sizeof(fl[0]) << endl;
    cout << "size of char  " << sizeof(ch) / sizeof(ch[0]) << endl;
    cout << "size of int  " << sizeof(in) / sizeof(in[0]) << endl;
    cout << endl;

    // for (int i = 0; i < sizeof(in); i++)
    // {
    //     cout << "add int " << &in[i] << endl;
    //     cout << "add int " << i[in] << endl;
    // }

    int p = 5;
    int *p1 = &p;
    int **p2 = &p1;
    cout << endl;
    // total ways to access p
    cout << p << " " << *p1 << " " << **p2 << endl;
    cout << endl;
    // total ways to access p address
    cout << &p << " " << p1 << " " << *p2 << endl;
    cout << endl;
    // total ways to access p1 address
    cout << &p1 << " " << p2 << endl;

    cout << "before update " << endl;
    cout << p << " " << p1 << " " << p2 << endl;
    update(p2);
    cout << "after update " << endl;
    cout << p << " " << p1 << " " << p2 << endl;
}
