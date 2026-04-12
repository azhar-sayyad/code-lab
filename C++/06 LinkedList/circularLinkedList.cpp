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
void removeNode(Node *&tail, int element)
{
    Node *prew = tail;
    Node *next = tail->next;
    while (next->data != element)
    {
        prew = next;
        next = next->next;
    }
    if (next == tail)
        tail = prew;

    if (next == prew)
        tail = NULL;
    prew->next = next->next;
    next->next = NULL;
    delete next;
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

int main()
{
    Node *tail = NULL;
    insertNode(tail, 5);
    // insertNode(tail, 4);
    // insertNode(tail, 3);
    // insertNode(tail, 2);
    // insertNode(tail, 1);
    print(tail);

    removeNode(tail, 5);
    print(tail);
    // removeNode(tail, 4);
    // print(tail);

    return 0;
}