#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main()
{
    vector<int> v;
    v.push_back(2);
    v.push_back(4);
    v.push_back(3);
    v.push_back(6);

    // Rotate Array
    cout << "Before Rotate" << endl;
    for (int i : v)
        cout << i << " ";
    cout << endl;

    cout << "After Rotate" << endl;
    rotate(v.begin(), v.begin() + 1, v.end());
    for (int i : v)
        cout << i << " ";
    cout << endl
         << endl;

    // Sort Array
    cout << "before sort" << endl;
    for (int i : v)
        cout << i << " ";
    cout << endl;

    cout << "before sort" << endl;
    sort(v.begin(), v.end());
    for (int i : v)
        cout << i << " ";
    cout << endl
         << endl;

    //  Binary Search
    cout << "is 6 present " << binary_search(v.begin(), v.end(), 6) << endl;
    cout << "is 1 present " << binary_search(v.begin(), v.end(), 1) << endl;

    //  MIN MAX
    cout << endl;
    int a = 10;
    int b = 29;
    cout << "min (10,29) " << min(a, b) << endl;
    cout << "max (10,29) " << max(a, b) << endl;

    // Swap
    cout << endl;
    cout << "before swap a b " << a << " " << b << endl;
    swap(a, b);
    cout << "after swap a b " << a << " " << b << endl;
    cout << endl;

    // Reverse

    string str = "abcdefg";
    cout << "before reverse " << str << endl;
    reverse(str.begin(), str.end());
    cout << "after reverse " << str << endl;
    cout << endl;


    return 0;
}