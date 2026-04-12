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
Node *buildTree(Node *root)
{
    int data;
    cin >> data;
    if (data == -1)
        return NULL;
    root = new Node(data);

    root->left = buildTree(root->left);
    root->right = buildTree(root->right);

    return root;
}


int main()
{
    Node *root = NULL;
    root = buildTree(root);

    return 0;
}
/*    1
  3        5
7    11  17

*/
