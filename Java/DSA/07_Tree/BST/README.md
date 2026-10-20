# Binary Search Tree (BST) in Java

A **Binary Search Tree (BST)** is a node-based binary tree data structure with the following properties:
1. The **left subtree** of a node contains only nodes with values **less than** the node's value.
2. The **right subtree** of a node contains only nodes with values **greater than** the node's value.
3. Both left and right subtrees must also be binary search trees (no duplicates by default).
1. The **left subtree** of a node contains only values **less than** the node's value.
2. The **right subtree** of a node contains only values **greater than** the node's value.
3. Both left and right subtrees must also be binary search trees (no duplicate values).

---

## 🌳 Visual Representation
## 🌳 Initial Tree Structure

The tree constructed in [`Tree.java`](file:///home/azhar/Desktop/Projects/code-lab/code-lab/Java/DSA/07_Tree/BST/Tree.java):

```text
                  20
                /    \
              15      30
             /  \    /  \
           12   18  25   40
                           \
                           50
```

---

## 🔍 How Each Method Works
## ⚙️ Core Operations

### 1. `insert(Node root, int value)`
Adds a new node in its correct BST position.

* **Base Case (`root == null`)**: If we reach an empty spot, we create and return a `new Node(value)`.
* **Duplicate Check (`root.data == value`)**: If the element already exists, we do nothing.
* **Recursive Cases**:
  * If `value < root.data`: Go left $\rightarrow$ `root.left = insert(root.left, value)`
  * If `value > root.data`: Go right $\rightarrow$ `root.right = insert(root.right, value)`
* **Return**: Return `root` so the parent retains its child link.
* **Base Case (`root == null`)**: If we reach an empty spot, create and return `new Node(value)`.
* **Duplicate Check (`root.data == value`)**: If value exists, return `root` as-is.
* **Recursive Step**:
  * If `value < root.data`: `root.left = insert(root.left, value)`
  * If `value > root.data`: `root.right = insert(root.right, value)`
* **Return**: Return `root` to preserve the parent's child link.

---

### 2. `search(Node root, int value)`
Finds if a value exists in $O(\log n)$ average time by eliminating half of the remaining nodes at each step.
Finds if a value exists in $O(\log n)$ average time.

* **Base Case 1 (`root == null`)**: Reached a dead end / empty branch $\rightarrow$ return `false`.
* **Base Case 1 (`root == null`)**: Value not found $\rightarrow$ return `false`.
* **Base Case 2 (`root.data == value`)**: Value found $\rightarrow$ return `true`.
* **Recursive Cases**:
  * If `value < root.data`: search left $\rightarrow$ `return search(root.left, value);`
  * If `value > root.data`: search right $\rightarrow$ `return search(root.right, value);`
* **Recursive Step**:
  * If `value < root.data`: `return search(root.left, value);`
  * If `value > root.data`: `return search(root.right, value);`

> 💡 **Reminder**: Always include `return` before recursive calls in `search`, otherwise the boolean result from child calls gets discarded and the method returns `false`!

---

## ⚠️ The Common Pitfall: Missing `return` in Recursion
### 3. `delete(Node root, int value)`
Deleting a node from a BST requires preserving the BST property. When the target node is found, there are **3 distinct cases**:

### ❌ The Buggy Code:
```text
                                 [Node to Delete]
                                        │
           ┌────────────────────────────┼────────────────────────────┐
           ▼                            ▼                            ▼
        Case 1                       Case 2                       Case 3
       No Child                     1 Child                     2 Children
      (Leaf Node)             (Left OR Right only)            (Left AND Right)
           │                            │                            │
     Return null            Return the existing child       1. Find In-Order Successor
                                                            2. Copy Successor value
                                                            3. Delete Successor
```

#### Detailed Breakdown of the 3 Cases:

#### 🟢 Case 1: Node has NO children (Leaf Node)
* **Example**: Deleting `12` or `50`.
* **Action**: Simply return `null`. The parent's pointer will now point to `null`.
```java
if (root.data > value) {
    search(root.left, value);  // ⚠️ Return value is thrown away!
} else {
    search(root.right, value); // ⚠️ Return value is thrown away!
if (root.left == null && root.right == null) {
    return null;
}
return false;                  // ❌ Method always returns false here!
```

### What Happened During `search(root, 15)`:
```text
Call 1: search(20, 15)
  │
  ├── 15 < 20 -> calls search(15, 15)
  │     │
  │     ├── Call 2: search(15, 15)
  │     │     └── 15 == 15 -> returns true! ✅
  │     │
  │     └── Call 1 receives 'true', but DOES NOT return it!
  │
  └── Call 1 falls through to: return false; ❌ (Wrong!)
#### 🟡 Case 2: Node has ONLY ONE child
* **Example**: Deleting `40` (which only has right child `50`).
* **Action**: Return the non-null child. It replaces the deleted node directly.
```java
if (root.left == null) return root.right; // Has only right child (or none)
if (root.right == null) return root.left; // Has only left child
```

### ✅ The Fix:
#### 🔴 Case 3: Node has TWO children
* **Example**: Deleting `15` (children: `12` and `18`) or deleting `20` (children: `15` and `30`).
* **Why it's tricky**: We cannot simply delete the node because doing so would leave two disconnected subtrees.
* **Solution**: Replace the node's value with its **In-Order Successor**:
  1. **In-Order Successor**: The smallest value in the **right subtree** (go right once, then all the way left).
  2. Copy the successor's data into the current node.
  3. Delete the successor node from the right subtree (the successor is guaranteed to have at most 1 child!).

```java
if (root.data > value) {
    return search(root.left, value);  // ✅ Passes the result back up!
} else {
    return search(root.right, value); // ✅ Passes the result back up!
}
Node successor = get_succesor(root);
root.data = successor.data;
root.right = delete(root.right, successor.data);
```

---

### 3. `inOrder(Node root)` (Left $\rightarrow$ Root $\rightarrow$ Right)
In-Order traversal visits nodes in the following order:
1. Traverse the **left** subtree.
2. Visit the **current** node.
3. Traverse the **right** subtree.
## 🔍 Step-by-Step Tracing of Deletions

> **Key Takeaway**: In-Order traversal of a BST **always yields sorted ascending output**:
> `12 15 18 20 25 30 40 50`
### 1. Deleting `15` (Node with 2 Children: `12` and `18`)

```text
Before:
        15
       /  \
     12    18  <-- Smallest in right subtree is 18 (Successor)

Step 1: Copy 18 into node 15:
        18
       /  \
     12    18

Step 2: Delete 18 from right subtree (18 is a leaf -> Case 1):
        18
       /  
     12   
```

### 2. Deleting Root Node `20` (Node with 2 Children: subtree `18` and subtree `30`)

```text
Before:
                  20
                /    \
              18      30
             /       /  \
           12       25   40
                           \
                           50

Step 1: Find In-Order Successor of 20:
        Go right to 30 -> go left to 25.
        Successor is 25!

Step 2: Copy 25 into root node:
                  25
                /    \
              18      30
             /       /  \
           12       25   40
                           \
                           50

Step 3: Recursively delete 25 from the right subtree (25 is a leaf -> Case 1):
                  25
                /    \
              18      30
             /          \
           12            40
                           \
                           50
```

---

## ⏱️ Complexity Analysis
### 4. `inOrder(Node root)` (Left $\rightarrow$ Root $\rightarrow$ Right)
Visits nodes in ascending order:
* **Initial Tree**: `12 15 18 20 25 30 40 50`
* **After deleting 15**: `12 18 20 25 30 40 50`
* **After deleting 20**: `12 18 25 30 40 50`

| Operation | Average Case | Worst Case (Skewed Tree) |
|---|---|---|
| **Search** | $O(\log n)$ | $O(n)$ |
| **Insert** | $O(\log n)$ | $O(n)$ |
| **In-Order Traversal** | $O(n)$ | $O(n)$ |
| **Space Complexity** | $O(h)$ (recursion stack) | $O(n)$ |
---

*(where $n$ is number of nodes, and $h$ is height of tree)*
## ⏱️ Complexity Summary

| Operation | Average Case | Worst Case (Skewed Tree) | Space Complexity (Call Stack) |
|---|---|---|---|
| **Search** | $O(\log n)$ | $O(n)$ | $O(h)$ |
| **Insert** | $O(\log n)$ | $O(n)$ | $O(h)$ |
| **Delete** | $O(\log n)$ | $O(n)$ | $O(h)$ |
| **In-Order Traversal** | $O(n)$ | $O(n)$ | $O(h)$ |

*(where $n$ is the total number of nodes, and $h$ is the height of the tree: $h = \log n$ for balanced, $h = n$ for skewed)*
