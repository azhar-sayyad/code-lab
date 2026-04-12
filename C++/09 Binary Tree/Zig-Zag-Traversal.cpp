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

vector<int> ZigZag(Node *root)
{
    vector<int> result;

    if (root == NULL)
        return result;

    queue<Node *> q;
    q.push(root);

    while (!q.empty())
    {
        int size = q.size();
        vector<int> ans(size);

        bool leftToright = true;

        for (int i = 0; i < size; i++)
        {
            Node *temp = q.front();
            q.pop();

            int index = leftToright ? i : size - i - 1;
            ans[index] = temp->data;

            if (temp->left)
                q.push(temp->left);
            if (temp->right)
                q.push(temp->right);
        }
        // Diraction Change
        leftToright = !leftToright;

        for (auto i : ans)
            result.push_back(i);
    }
    return result;
}

int main()
{
    Node *root = NULL;
    root = buildTree(root);

    vector<int> ans = ZigZag(root);

    for (auto i : ans)
        cout << i << " ";

    return 0;
}
/*    1
  3        5
7    11  17

*/
