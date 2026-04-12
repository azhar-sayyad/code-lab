#include <bits/stdc++.h>
using namespace std;

class Student
{
private:
    string name;
    int age;

public:
    string getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
    void setName(string name)
    {
        this->name = name;
    }
    void setAge(int age)
    {
        this->age = age;
    }
};

int main()
{
    Student s1;
    s1.setName("abhi");
    s1.setAge(23);

    cout<<"name : "<<s1.getName()<<endl;
    cout<<"Age : "<<s1.getAge()<<endl;
}