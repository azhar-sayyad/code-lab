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
Node *buildtree(Node *root)
{
    cout << "Enter Data" << endl;
    int data;
    cin >> data;

    root = new Node(data);
    if (data == -1)
        return NULL;

    cout << "For Left " << data << endl;
    root->left = buildtree(root->left);
    cout << "For Right " << data << endl;
    root->right = buildtree(root->right);

    return root;
}

void levelOrderTraversal(Node *root)
{
    queue<Node *> q;
    q.push(root);
    q.push(NULL);

    while (!q.empty())
    {
        Node *temp = q.front();
        q.pop();

        if (temp == NULL)
        {
            cout << endl;
            if (!q.empty())
                q.push(NULL);
        }
        else
        {
            cout << temp->data << " ";

            if (temp->left)
                q.push(temp->left);
            if (temp->right)
                q.push(temp->right);
        }
    }
}

int main()
{
    Node *root = NULL;
    root = buildtree(root);

    cout << "level Order Traversal" << endl;
    levelOrderTraversal(root);

    return 0;
}