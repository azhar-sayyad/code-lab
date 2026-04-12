#include <bits/stdc++.h>

using namespace std;
//i=0 99 i=2 96 i=4 95 i=6 92 i=8
//i=0 97 i=3 96 i=6 95 i=9 94
//i=3 97 i=6 94 i=9 92 i=11 89 i=14 88 i=17 87 i=20 86 i=23 83 i=26 80 

int solution(int n, int k,vector<int> c)
{
    int energy = 100;
    for (int i = 0; i < n; i += k)
    {
        if (c[i] == 1)
            energy -= 2;
        energy--;
    }
    return energy;
}
int main()
{
    int size, k;
    cin >> size >> k;
    vector<int> clouds;
    for (int i = 0; i < size; i++)
    {
        int input;
        cin >> input;
        clouds.push_back(input);
    }

    cout << solution(size, k, clouds);

    return 0;
}