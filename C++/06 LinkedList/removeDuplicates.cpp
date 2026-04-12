// Remove Duplicate element from unSorted Linked list
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
void removeMap(Node *&head)
{ // O(n) TC || O(n)  SC
    map<int, bool> visited;
    Node *temp = head;
    Node *prev = NULL;
    while (temp != NULL)
    {
        if (visited[temp->data] == true)
        {
            prev->next = temp->next;
            delete (temp);
        }

        visited[temp->data] = true;
        prev = temp;
        temp = temp->next;

        cout << prev->data << " - " << temp->data << endl;
    }
}
void removeDuplicates(Node *&head)
{
    if (head == NULL)
        return;

    Node *i = head;
    Node *j = i;
    // Node *prev = curr;
    while (i != NULL && i->next != NULL)
    {
        while (j->next != NULL)
        {
            if (j->next->data == i->data)
            {
                Node *del = j->next;
                j->next = j->next->next;
                delete (del);
                j = j->next;
            }
            else
                j = j->next;
        }
        i = i->next;
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
    insertNode(head, 3);
    insertNode(head, 2);
    print(head);

    // removeDuplicates(head);
    removeMap(head);
    print(head);
    return 0;
}