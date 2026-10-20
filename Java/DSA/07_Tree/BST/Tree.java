// Represents a single node in a Binary Search Tree (BST)
class Node {
    int data;       // The value stored in this node
    Node left;      // Pointer to the left child (holds values smaller than data)
    Node right;     // Pointer to the right child (holds values greater than data)

    // Constructor to initialize a new node with data
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree {

    /**
     * Inserts a new value into the Binary Search Tree.
     * BST Property:
     * - Values smaller than current node go to the left subtree.
     * - Values greater than current node go to the right subtree.
     */
    public static Node insert(Node root, int value) {
        // Base Case: If the spot is empty (null), create and return a new Node
        if (root == null) {
            return new Node(value);
        }

        // Duplicate handling: If value already exists, do nothing and return root
        if (root.data == value) {
            return root;
        }

        // Recursive Step: Decide whether to go left or right
        if (root.data > value) {
            // Value is smaller -> insert into left subtree and update root.left link
            root.left = insert(root.left, value);
        } else {
            // Value is greater -> insert into right subtree and update root.right link
            root.right = insert(root.right, value);            
        }

        // Return unchanged node pointer back up the call stack
        return root;
    }

    /**
     * Searches for a value in the BST.
     * Returns true if value exists in tree, false otherwise.
     */
    public static boolean search(Node root, int value) {
        // Base Case 1: Reached a null leaf -> value does not exist
        if (root == null) {
            return false;
        }

        // Base Case 2: Found the value!
        if (root.data == value) {
            return true;
        }

        // Recursive Step:
        // IMPORTANT: Must use 'return' so the result from the child call 
        // is passed all the way back up to the original caller.
        if (root.data > value) {
            // Value is smaller -> look only in the left subtree
            return search(root.left, value);
        } else {
            // Value is larger -> look only in the right subtree
            return search(root.right, value);
        }
    }

    /**
     * In-Order Traversal (Left -> Root -> Right).
     * In a BST, this always prints elements in ascending (sorted) order!
     */
    public static void inOrder(Node n) {
        if (n == null) {
            return;
        }
        
        inOrder(n.left);               // 1. Visit left subtree
        System.out.print(n.data + " "); // 2. Visit current node
        inOrder(n.right);              // 3. Visit right subtree
    }


    /**
     * Deletes a node with the given value from the BST.
     * 
     * There are 3 cases to handle when the node is found:
     * - Case 1: Node is a leaf (no children) -> simply remove it (return null).
     * - Case 2: Node has only 1 child -> replace node with its child (return left or right).
     * - Case 3: Node has 2 children -> replace node's data with its In-Order Successor
     *           (smallest value in right subtree), then delete the successor.
     */
    public static Node delete(Node root, int value) {
        // Base Case: Value not found in tree
        if (root == null) {
            return null;
        }

        // Search for the node to delete
        if (root.data > value) {
            root.left = delete(root.left, value);
        } else if (root.data < value) {
            root.right = delete(root.right, value);
        } else {
            // Node found! Handle the 3 deletion cases:

            // Case 1 & 2: Node has 0 children (leaf) or 1 child
            if (root.left == null) {
                // If left is null: returns right child (null if leaf, or the single child)
                return root.right;
            } else if (root.right == null) {
                // If right is null: returns left child
                return root.left;
            } else {
                // Case 3: Node has 2 children
                // 1. Find In-Order Successor (smallest value in right subtree)
                Node successor = get_succesor(root);

                // 2. Copy the successor's data into this node
                root.data = successor.data;

                // 3. Recursively delete the successor node from the right subtree
                root.right = delete(root.right, successor.data);
            }
        }
        return root;
    }

    /**
     * Helper method to find the In-Order Successor.
     * The successor is the leftmost (smallest) node in the right subtree.
     */
    private static Node get_succesor(Node root) {
        // Step 1: Move to right child
        Node curr = root.right;

        // Step 2: Keep moving left until we find the smallest node
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public static void main(String args[]) {
        /*
         * Constructing the following BST:
         *                20
         *              /    \
         *            15      30
         *           /  \    /  \
         *         12   18  25   40
         *                         \
         *                         50
         */
        Node root = insert(null, 20);
        root = insert(root, 30);
        root = insert(root, 15);
        root = insert(root, 40);
        root = insert(root, 12);
        root = insert(root, 18);
        root = insert(root, 25);
        root = insert(root, 50);

        // Printing in-order: will output sorted sequence
        System.out.print("Initial Tree In-Order: ");
        inOrder(root);
        System.out.println(); // New line for clean formatting

        // Testing Search Function
        System.out.println("\n--- Search Tests ---");
        System.out.println("Search 20 (root): " + search(root, 20));          // true
        System.out.println("Search 15 (child): " + search(root, 15));        // true
        System.out.println("Search 100 (not present): " + search(root, 100)); // false

        // Testing Delete Function
        System.out.println("\n--- Delete Tests ---");
        
        // Deleting 15 (node with two children: 12 and 18)
        System.out.println("Deleting 15 (node with 2 children)...");
        root = delete(root, 15);
        System.out.print("In-Order after deleting 15: ");
        inOrder(root);
        System.out.println();

        // Deleting 20 (root node with two children)
        System.out.println("Deleting 20 (root node with 2 children)...");
        root = delete(root, 20);
        System.out.print("In-Order after deleting 20: ");
        inOrder(root);
        System.out.println();
    }
}