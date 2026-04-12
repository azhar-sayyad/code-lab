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
void insertNode(Node *&head, int d)
{
    Node *temp = new Node(d);
    if (head == NULL)
        head = temp;
    else
    {
        temp->next = head;
        head = temp;
    }
}
void reverseKGroups(Node *&head, int k)
{
    if (head == NULL || head->next == NULL)
        return;

    Node *curr = head;
    Node *prev = NULL;
    Node *next = NULL;

    int cnt = 0;
    while (cnt < k && curr != NULL)
    {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
        cnt++;
    }
    if (next != NULL)
        head->next = reverseKGroups(next, k);

    // return prev;
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

int main()
{
    Node *node1;
    Node *head = NULL;
    insertNode(head, 1);
    insertNode(head, 2);
    insertNode(head, 3);
    insertNode(head, 4);
    insertNode(head, 5);
    insertNode(head, 6);
    print(head);
    return 0;
}