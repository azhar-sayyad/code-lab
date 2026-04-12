#include <bits/stdc++.h>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
    Node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
};

void insertNode(Node *&head, int data)
{
    Node *temp = new Node(data);
    if (temp == NULL)
        head = temp;
    else
    {
        temp->next = head;
        head = temp;
    }
}

void print(Node *head)
{
    Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}
bool compare(vector<int> arr)
{
    int s = 0;
    int e = arr.size() - 1;

    while (s++ <= e--)
    {
        if (arr[s] != arr[e])
            return 0;
    }
    return 1;
}
bool palindrome(Node *&head)
{
    Node *temp = head;
    vector<int> arr;
    while (temp != NULL)
    {
        arr.push_back(temp->data);
        temp = temp->next;
    }
    return compare(arr);
}

int main()
{
    Node *node = new Node(1);
    Node *head = node;
    insertNode(head, 1);
    insertNode(head, 2);
    insertNode(head, 1);
    print(head);

    if (palindrome(head))
        cout << "palindrome" << endl;
    else
        cout << "non palindrome" << endl;
    return 0;
}