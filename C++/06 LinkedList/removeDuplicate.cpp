// Remove Duplicate element from sorted Linked list

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
void removeDuplicates(Node *&head)
{
    if (head == NULL)
        return;
    Node *curr = head;
    while (curr != NULL && curr->next != NULL)
    {
        if (curr->data == curr->next->data)
        {
            Node *next_next = curr->next->next;
            Node *delElement = curr->next;
            curr->next = next_next;
            delete (delElement);
        }
        else
            curr = curr->next;
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
int main()
{
    Node *node1 = new Node(1);
    Node *head = node1;
    insertNode(head, 2);
    insertNode(head, 2);
    insertNode(head, 3);
    insertNode(head, 4);
    insertNode(head, 4);
    print(head);

    removeDuplicates(head);
    print(head);
    return 0;
}