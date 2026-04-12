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
bool detectLoop(Node *head)
{
    if (head == NULL)
        return false;

    map<Node *, bool> visited;
    Node *temp = head;

    while (temp != NULL)
    {
        if (visited[temp] == true) // cycle detected
        {
            cout << "cycle is detected " << temp->data << endl;
            return true;
        }

        visited[temp] = true;
        temp = temp->next;
    }
    return false;
}
int main()
{

    Node *node1 = new Node(1);
    Node *head = node1;
    Node *tail = node1;

    insertNode(head, 2);
    insertNode(head, 3);
    insertNode(head, 4);
    insertNode(head, 5);

    tail->next = head->next;

    if (detectLoop(head))
        cout << "cycle detected";
    else
        cout << "NULL";

    return 0;
}