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

int Height(Node *root)
{
    if (root == NULL)
        return 0;

    int left = Height(root->left);
    int right = Height(root->right);

    int ans = max(left, right) + 1;
    return ans;
}

int main()
{
    Node *root = NULL;
    root = buildTree(root);

    cout << "Height: " << Height(root) << endl;
    return 0;
}
   /*    1
     3        5
  7    11  17  

*/
