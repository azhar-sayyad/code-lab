#include <bits/stdc++.h>

using namespace std;
bool isEqual(int arr1[], int arr2[])
{
    for (int i = 0; i < 26; i++)
        if (arr1[i] != arr2[i])
            return 0;
    return 1;
}
bool isPermutation(string s1, string s2)
{
    int count1[26] = {0};
    for (int i = 0; i < s1.length(); i++)
        count1[s1[i] - 'a']++;    // int index = s1[i] - 'a';
    
    int count2[26] = {0};
    int windowSize = s1.length();
    int i = 0;

    for (; i < windowSize; i++)
        count2[s2[i] - 'a']++;    // int index = s2[i] - 'a';

    for (; i <= s2.length(); i++)
    {
        if (isEqual(count1, count2))
            return true;

        count2[s2[i] - 'a']++;    // int newCount = s2[i] - 'a';

        count2[s2[i - windowSize] - 'a']--;    // int oldCount = s2[i - windowSize] - 'a';
    }
    return false;
}

int main()
{
    string str1, str2;
    cin >> str1 >> str2;

    cout << isPermutation(str1, str2);

    return 0;
}

/*
        input 
        s1 = abc
        s2 = axvfejfhcba

        output
        1       // s2 contain cba 

*/