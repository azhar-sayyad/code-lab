#include <bits/stdc++.h>

using namespace std;
class Node
{
public:
    int data;
    Node *next;
    Node *prew;

    Node(int data)
    {
        this->data = data;
        this->next = NULL;
        this->prew = NULL;
    }
};
void insertAtHead(Node *&head, int data)
{
    Node *temp = new Node(data);
    temp->next = head;
    head->prew = temp;
    head = temp;
}
void insertAtTail(Node *&tail, int data)
{
    Node *temp = new Node(data);
    tail->next = temp;
    temp->prew = tail;
    tail = temp;
}
void insertAtPostion(Node *&head, Node *&tail, int pos, int data)
{
    if (pos == 1)
    {
        insertAtHead(head, data);
        return;
    }

    Node *temp = new Node(data);
    Node *position = head;
    int cnt = 1;
    while (cnt != pos)
    {
        position = position->next;
        cnt++;
    }
    if (position->next == NULL)
    {

        insertAtTail(tail, data);
        return;
    }

    position->prew->next = temp;
    temp->prew = position->prew;
    temp->next = position;
    position->prew = temp;
}
void remove(Node *&head, Node *&tail, int pos)
{
    if (pos == 1)
    {
        Node *temp = head;
        temp->next->prew = NULL;
        head = temp->next;
        temp->next = NULL;
        delete temp;
    }
    else
    {
        Node *temp = head;

        int cnt = 1;
        while (cnt < pos)
        {
            temp = temp->next;
            cnt++;
        }

        temp->prew->next = temp->next;
        temp->next->prew = temp->prew;
        temp->next = NULL;
        temp->prew = NULL;
        delete temp;
    }
}
int getLength(Node *head)
{
    Node *temp = head;
    int count = 0;
    while (temp != NULL)
    {
        temp = temp->next;
        count++;
    }
    return count;
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
    Node *tail = node1;

    insertAtHead(head, 3);
    insertAtHead(head, 5);
    insertAtHead(head, 6);
    print(head);
    insertAtTail(tail, 0);
    print(head);
    insertAtPostion(head, tail, 3, 4);
    print(head);
    insertAtPostion(head, tail, 6, -1);
    print(head);
    insertAtPostion(head, tail, 1, 7);
    print(head);
    remove(head, tail, 8);
    print(head);

    cout << head->data << " " << tail->data << endl;
    cout << getLength(head) << endl;
}