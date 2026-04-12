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
void TraverseLeft(Node *root, vector<int> &ans)
{
    if (root == NULL || (root->left == NULL && root->right == NULL))
        return;
    ans.push_back(root->data);
    if (root->left)
        TraverseLeft(root->left, ans);
    else
        TraverseLeft(root->right, ans);
}

void TraverseLeaf(Node *root, vector<int> &ans)
{
    if (root == NULL)
        return;

    if (root->left == NULL && root->right == NULL)
    {
        ans.push_back(root->data);
        return;
    }

    TraverseLeaf(root->left, ans);
    TraverseLeaf(root->right, ans);
}

void TraverseRight(Node *root, vector<int> &ans)
{
    if (root == NULL || (root->left == NULL && root->right == NULL))
        return;

    if (root->right)
        TraverseRight(root->right, ans);
    else
        TraverseRight(root->left, ans);

    ans.push_back(root->data);
}
vector<int> Boundry(Node *root)
{
    vector<int> ans;
    if (root == NULL)
        return ans;
    ans.push_back(root->data);

    // left Node
    TraverseLeft(root->left, ans);

    // Leaf Node
    TraverseLeaf(root->left, ans);
    TraverseLeaf(root->right, ans);

    // Right Node
    TraverseRight(root->right, ans);

    return ans;
}

int main()
{
    Node *root = NULL;
    root = buildTree(root);

    vector<int> ans = Boundry(root);

    for (auto i : ans)
        cout << i << " ";

    return 0;
}
/*
      1
  3        5
7    11  17

*/
