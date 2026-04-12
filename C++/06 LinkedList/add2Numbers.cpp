#include <bits/stdc++.h>
using namespace std;
class Node
{
public:
    int data;
    Node *next;
    Node(int d)
    {
        this->data = d;
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
    while (head != NULL)
    {
        cout << head->data << " ";
        head = head->next;
    }
    cout << endl;
}
Node *reverse(Node *&head)
{
    Node *curr = head;
    Node *prev = NULL;
    Node *nxt = NULL;
    while (curr != NULL)
    {
        nxt = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nxt;
    }
    return prev;
}
// T C - O(M+N)
// S C - O(max(M,N))
Node *addToNumber(Node *&head1, Node *&head2)
{
    Node *first = reverse(head1);
    Node *second = reverse(head2);
    Node *ans = NULL;
    int carry = 0;
    int sum = 0;

    while (first != NULL || second != NULL || carry != 0)
    {
        int val1 = 0;
        if (first != NULL)
            val1 = first->data;
        int val2 = 0;
        if (second != NULL)
            val2 = second->data;

        sum = carry + val1 + val2;
        carry = sum / 10;
        sum = sum % 10;

        insertNode(ans, sum);

        if (first != NULL)
            first = first->next;
        if (second != NULL)
            second = second->next;
    }
    return ans;
}

int main()
{
    // Node *node;
    Node *head1 = NULL;
    Node *head2 = NULL;
    insertNode(head1, 0);
    insertNode(head1, 2);
    insertNode(head1, 3);

    insertNode(head2, 5);
    insertNode(head2, 5);
    print(head1);
    print(head2);

    Node *ans = addToNumber(head1, head2);
    print(ans);

    return 0;
}