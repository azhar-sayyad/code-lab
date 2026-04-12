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
    if (head == NULL)
        head = temp;
    else
    {
        temp->next = head;
        head = temp;
    }
}
void reverse(Node *&head)
{
    Node *prev = NULL;
    Node *curr = head;
    Node *next ;
    while (curr != NULL)
    {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
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
    insertNode(head, 5);
    insertNode(head, 4);
    insertNode(head, 3);
    insertNode(head, 2);
    insertNode(head, 1);
    print(head);
    reverse(head);
    print(head);
    return 0;
}