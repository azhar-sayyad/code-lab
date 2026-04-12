#include <bits/stdc++.h>
using namespace std;

char maxOccChar(string str)
{
    int arr[26] = {0};
    for (int i = 0; i < str.length(); i++)
    {
        int number = 0;
        if (str[i] >= 'a' && str[i] <= 'z')
            number = str[i] - 'a';
        else
            number = str[i] - 'A';
        arr[number]++;
    }
    int maxOcc, index;
    for (int i = 0; i < 26; i++)
    {
        if (maxOcc < arr[i])
        {
            maxOcc = arr[i];
            index = i;
        }
    }
    return (index + 'a');
}

int main()
{
    string str;
    cin >> str;
    cout << maxOccChar(str) << endl;

    return 0;
}

/*
        input 
        apple
        ball
        cat

        output
        p
        l
        o

*/