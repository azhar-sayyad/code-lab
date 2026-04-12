// Floyd's Cycle Detection Algorithm
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
Node *floydAlgo(Node *head)
{
    if (head == NULL)
        return NULL;

    Node *fast = head;
    Node *slow = head;

    while (fast != NULL || slow != NULL)
    {
        fast = fast->next;
        if (fast == NULL || fast->next == NULL)
            return NULL;
        fast = fast->next;

        slow = slow->next;

        if (fast == slow)
            return slow;
    }
    return NULL;
}
Node *startingCycleNode(Node *&head)
{
    if (head == NULL)
        return NULL;
    Node *intersection = floydAlgo(head);
    Node *start = head;

    while (start != intersection)
    {
        start = start->next;
        intersection = intersection->next;
    }
    return start;
}
void removeLoop(Node *&head)
{
    if (head == NULL)
        return;
    Node *startLoop = startingCycleNode(head);
    Node *temp = head;

    while (temp->next != startLoop)
        temp = temp->next;

    temp->next = NULL;
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

    if (floydAlgo(head) != NULL)
        cout << "cycle detected" << endl;
    else
        cout << "NULL" << endl;

    Node *ans = startingCycleNode(head);
    cout << ans->data;

    removeLoop(head);

    if (floydAlgo(head) != NULL)
        cout << "cycle detected" << endl;
    else
        cout << "NULL" << endl;

    return 0;
}