class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class BTree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // visit left, root, right
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // visit root, left, right
    public void preorder() {
        preorderRec(root);
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // visit left, right, root 
    public void postorder() {
        postorderRec(root);
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void printTree() {
        printTreeRec(root, 0);
    }


    private void printTreeRec(Node root, int level) {
        if (root != null) {
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }

            System.out.println(root.data);
            printTreeRec(root.left, level + 1);
            printTreeRec(root.right, level + 1);
        }
    }

    public int getDepth() {
        return getDepthRec(root);
    }

    private int getDepthRec(Node node) {
        if (node == null) {
            return 0;
        }
        // Calculate the depth of each subtree
        int leftDepth = getDepthRec(node.left);
        int rightDepth = getDepthRec(node.right);

        // Return the larger one plus the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}