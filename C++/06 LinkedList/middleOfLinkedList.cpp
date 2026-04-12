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
    temp->next = head;
    head = temp;
}
int length(Node *head)
{
    Node *temp = head;
    int len = 0;
    while (temp != NULL)
    {
        len++;
        temp = temp->next;
    }
    //Mid element
    int mid = (len / 2) + 1;
    return mid;
}
void middle(Node *head)
{
    Node *temp = head;
    int len = length(head);
    int cnt = 1;
    while (cnt <len)
    {
        temp = temp->next;
        cnt++;
    }
    cout<< temp->data;
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
    insertNode(head, 6);
    insertNode(head, 5);
    insertNode(head, 4);
    insertNode(head, 3);
    insertNode(head, 2);
    insertNode(head, 1);
    print(head);

    int Midlen = length(head);
    cout << Midlen;
    cout << endl;
    middle(head);

    // Node *mid = middle(head);
    // cout << mid;
    return 0;
}