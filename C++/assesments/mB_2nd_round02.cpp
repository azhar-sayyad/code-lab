/*
    The "key" array is an array containing the correct answers to an exam, 
    like {"a", "a", "b", "b"}.
    the "answers" array contains a student's answers, 
    with "?" representing a question left blank.
    The two arrays are not empty and are the same length.
    Return the score for this array of answers, giving +4 for each correct answer, 
    -1 for each incorrect answer, and +0 for each blank answer.

    scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
    scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 1
*/
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        char arr[2][4];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 4; j++)
                cin >> arr[i][j];

        int score = 0;
        int key = 0;
        int ans = 1;

        for (int i = 0; i < 4; i++)
        {
            if (arr[ans][i] == '?' || arr[key][i] == '?')
                score = score + 0;
            else
            {
                if (arr[ans][i] == arr[key][i])
                    score = score + 4;
                else if (arr[key][i] != arr[ans][i])
                    score = score - 1;
            }
        }
        cout << score << endl;
    }
    return 0;
}