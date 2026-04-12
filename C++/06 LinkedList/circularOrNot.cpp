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
void insertNode(Node *&tail, int d)
{
    if (tail == NULL)
    {
        Node *temp = new Node(d);
        tail = temp;
        temp->next = temp;
    }
    else
    {
        Node *temp = new Node(d);
        temp->next = tail->next;
        tail->next = temp;
        tail = temp;
    }
}
void print(Node *tail)
{
    Node *temp = tail;
    // if tail is empty or NULL
    if (tail == NULL)
    {
        cout << " list is empty" << endl;
        return;
    }

    do
    {
        cout << temp->data << " ";
        temp = temp->next;

    } while (temp != tail);
    cout << endl;
}

bool isCircular(Node *head)
{
    if (head == NULL)
        return true;

    Node *temp = head->next;
    while (head != NULL && head != temp)
        temp = temp->next;

    if (temp == head)
        return true;

    return false;
}

int main()
{
    Node *tail = NULL;
    insertNode(tail, 5);
    insertNode(tail, 4);
    insertNode(tail, 3);
    insertNode(tail, 2);
    insertNode(tail, 1);
    print(tail);

    if (isCircular(tail))
        cout << "circular Linked List";
    else
        cout << "non Circular List";

    return 0;
}