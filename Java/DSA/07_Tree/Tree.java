class Node{
    int data;
    Node left;
    Node right;


    Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;

    }
}

class Tree{

    public static void preOrder(Node n){
        if(n == null)
            return;
        
        System.out.print(n.data + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public static void inOrder(Node n){
        if(n == null)
            return;
        
        inOrder(n.left);
        System.out.print(n.data + " ");
        inOrder(n.right);
    }

    public static void postOrder(Node n){
        if(n == null)
            return;
        
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.data + " ");
    }

    public static void display(Node n){
        
    }

    public static void main(String [] args){
        
        Node root = new Node(1);
        
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right = new Node(5);
        root.right.right = new Node(8);


        preOrder(root);
        System.out.println();

        inOrder(root);
        System.out.println();

        postOrder(root);
        System.out.println();

        
    }

}