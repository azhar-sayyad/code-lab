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
    // cout << "Enter Data" << endl;
    int data;
    cin >> data;
    root = new Node(data);
    if (data == -1)
        return NULL;

    // cout << "Enter left data" << endl;
    root->left = BuildTree(root->left);

    // cout << "Enter right data" << endl;
    root->right = BuildTree(root->right);

    return root;
}

void Inorder(Node *root)
{
    if (root == NULL)
        return;
    Inorder(root->left);
    cout << root->data << " ";
    Inorder(root->right);
}
void Preorder(Node *root)
{
    if (root == NULL)
        return;
    cout << root->data << " ";
    Preorder(root->left);
    Preorder(root->right);
}
void Postorder(Node *root)
{
    if (root == NULL)
        return;
    Postorder(root->left);
    Postorder(root->right);
    cout << root->data << " ";
}

int main()
{
    Node *root = NULL;

    root = BuildTree(root);

    // Inorder LNR - (Left Print Right)
    cout << "Inorder" << endl;
    Inorder(root);
    cout << endl;

    // Preorder NLR - (Print Left Right)
    cout << "Preorder" << endl;
    Preorder(root);
    cout << endl;

    // Postorder LRN - (Left Right Print)
    cout << "Postorder" << endl;
    Postorder(root);
    cout << endl;

    return 0;
}