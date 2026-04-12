#include <bits/stdc++.h>
using namespace std;

class Node
{
public:
    int data;
    Node *left;
    Node *right;
    Node(int data)
    {
        this->data = data;
        this->left = NULL;
        this->right = NULL;
    }
};
Node *BuildTree(Node *root)
{
    int data;
    cin >> data;
    root = new Node(data);

    if (data == -1)
        return NULL;

    root->left = BuildTree(root->left);
    root->right = BuildTree(root->right);

    return root;
}
void levelOrderTraversal(Node *root)
{
    queue<Node *> q;
    q.push(root);

    while (!q.empty())
    {
        Node *temp = q.front();
        q.pop();
        cout << temp->data << " ";
        if (temp->left)
            q.push(temp->left);
        if (temp->right)
            q.push(temp->right);
    }
}

void reverseLevelOrder(Node *root)
{
    queue<Node *> q;
    stack<int> s;

    q.push(root);

    while (!q.empty())
    {
        Node *temp = q.front();
        q.pop();
        s.push(temp->data);

        if (temp->left)
            q.push(temp->left);
        if (temp->right)
            q.push(temp->right);
    }

    while (!s.empty())
    {
        cout << s.top() << " ";
        s.pop();
    }
}
int main()
{
    Node *root = NULL;
    root = BuildTree(root);

    levelOrderTraversal(root);

    cout << endl;
    reverseLevelOrder(root);

    return 0;
}