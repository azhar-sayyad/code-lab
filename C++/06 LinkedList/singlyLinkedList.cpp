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
void insertAtHead(Node *&head, int d)
{
    Node *temp = new Node(d);
    temp->next = head;
    head = temp;
}
void insertAtTail(Node *&tail, int d)
{
    Node *temp = new Node(d);
    tail->next = temp;
    tail = temp;
}
void insertAtPosition(Node *&head, Node *&tail, int position, int d)
{
    if (position == 1)
        return insertAtHead(head, d);

    Node *temp = head;
    int cnt = 1;
    while (cnt < position - 1)
    {
        temp = temp->next;
        cnt++;
    }
    if (temp->next == NULL)
        return insertAtTail(tail, d);

    Node *newNode = new Node(d);
    newNode->next = temp->next;
    temp->next = newNode;
}
void remove(Node *&head, int position)
{
    Node *next = head;
    Node *prew = NULL;
    int cnt = 1;
    while (cnt < position)
    {
        prew = next;
        next = next->next;
        cnt++;
    }
    prew->next = next->next;
    next->next = NULL;
    delete next;
}
void print(Node *&head)
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
    Node *node1 = new Node(3);
    Node *head = node1;
    Node *tail = node1;
    insertAtHead(head, 44);
    print(head);

    insertAtTail(tail, 12);
    insertAtTail(tail, 21);
    insertAtTail(tail, 14);
    insertAtTail(tail, 19);
    // print(tail);
    print(head);
    insertAtPosition(head, tail, 7, 88);
    print(head);
    
    remove(head, 3);
    print(head);
    remove(head, 3);
    print(head);
    // cout << head->data << " " << tail->data;
}