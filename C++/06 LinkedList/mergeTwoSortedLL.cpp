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
void merge(Node *&first, Node *&second)
{
    if (first == NULL)
        return;
    if (second == NULL)
        return;
    Node *curr1 = first;
    Node *next1 = curr1->next;
    Node *curr2 = second;
    Node *next2 = curr2->next;
    while (next1 != NULL && curr2 != NULL)
    {
        if ((curr1->data <= curr2->data) && (curr2->data <= next1->data))
        {
            curr1->next = curr2;
            next2 = curr2->next;
            curr2->next = next1;

            curr1 = curr2;
            curr2 = next2;
        }
        else
        {
            curr1 = curr1->next;
            next1 = next1->next;
            if (next1 == NULL)
            {
                curr1->next = curr2;
                return;
            }
        }
    }
}
int main()
{
    // Node *node ;
    Node *head1 = NULL;
    Node *head2 = NULL;
    insertNode(head1, 5);
    insertNode(head1, 3);
    insertNode(head1, 1);

    insertNode(head2, 4);
    insertNode(head2, 2);
    insertNode(head2, 1);

    print(head1);
    print(head2);

    // cout<<head1->data<<" - "<<head2->data;

    if (head1->data <= head2->data)
        merge(head1, head2);
    else
        merge(head2, head1);
    print(head1);

    return 0;
}