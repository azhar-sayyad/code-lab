/*
Hey There,
1) Share your entire screen
2) Turn on your camera if not done
3) You can mute your mic
4) You can use any online compiler for writing code
5) I will share the question, meanwhile if you have question, send a message.
Input: A number n, say n = 4 Output: Based on n, print a pattern.

If n = 4, then the pattern will be

1
2 2 2
3 3 3 3 3
4 4 4 4 4 4 4
3 3 3 3 3
2 2 2
1

*/

// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std;

void solution1(int n)
{
    int i = 1;
    while (i <= n * 2)
    {
        int j = 1;
        while (j <= i)
        {
            cout << i / 2 + 1 << " ";
            j++;
        }
        cout << endl;
        i += 2;
    }
    i -= 2;
    i -= 2;
    while (i > 0)
    {
        int j = 1;
        while (j <= i)
        {
            cout << i / 2 + 1 << " ";
            j++;
        }
        cout << endl;
        i -= 2;
    }
}
void solution2(int n)
{
    int i = 1;
    while (i <= n)
    {
        for (int j = 1; j <= i * 2 - 1; j++)
            cout << i << " ";
        cout << endl;
        i++;
    }
    i--;
    i--;
    while (i > 0)
    {
        for (int j = 1; j <= i * 2 - 1; j++)
            cout << i << " ";
        cout << endl;
        i--;
    }
}
void solution3(int n)
{
    for (int i = 1; i < n * 2 - 1; i++)
    {
        int col = i > n ? 2 * n - i : i;
        for (int j = 0; j < i; j++)
            cout << "* ";
        cout << endl;
    }
}

int main()
{
    int n = 5;
    solution1(n);
    cout << endl;
    solution2(n);
    solution3(n);

    // int num =1;
    // for(int i= 1; i<= n*2 ;i+=3){
    //     for(int j =1; j<=i;j++)
    //         cout<<num<<" ";
    //         num++;
    //     cout<<endl;
    // }
    // num--;
    // for(int i= n*2-2; i>0 ;i-=3){
    //     for(int j =1; j<i;j++)
    //         cout<<num<<" ";
    //         num--;
    //     cout<<endl;
    // }
    // num= 4;
    // for(int i =n*2- ; i>0;i--){
    //     if(i%2 != 0){
    //         for(int j = 1; j<=i;j++){
    //             cout<<num<<" ";
    //         }
    //         cout<<endl;
    //         num--;
    //     }
    // }

    return 0;
}