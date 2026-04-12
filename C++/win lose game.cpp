#include <bits/stdc++.h>
using namespace std;

int main()
{

  int n;
  cin >> n;
  int arr[n][2];

  for (int i = 0; i < n; i++)
    for (int j = 0; j < 2; j++)
      cin >> arr[i][j];

  int win[100] = {0};
  int lose[100] = {0};

  for (int i = 0; i < n; i++)
    win[arr[i][0]]++;

  for (int i = 0; i < n; i++)
    lose[arr[i][1]]++;

  cout << "[[";
  for (int i = 0; i < 100; i++)
    if (win[i] > 0 && lose[i] == 0)
      cout << i << ", ";
  cout << "], ";

  cout << "[";
  for (int i = 0; i < 100; i++)
    if (lose[i] == 1)
      cout << i << ", ";
  cout << "]]";
}

/*
10
1 3
2 3
4 5
5 2
6 7
6 7
8 6
9 5
7 5
10 3

winner 1 4 8 9 10

lose at once 2 6

*/