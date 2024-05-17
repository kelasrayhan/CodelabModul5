package Tugas5.Codelab.Latihan2;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public Node newNode(int data) {
        return new Node(data);
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = tree.newNode(20);
        tree.root.left = tree.newNode(10);
        tree.root.right = tree.newNode(30);
        tree.root.left.left = tree.newNode(5);
        tree.root.right.right = tree.newNode(40);

        System.out.println("\nPre Order: ");
        tree.preorder(tree.root);

        System.out.println("\nIn Order: ");
        tree.inorder(tree.root);

        System.out.println("\nPost Order: ");
        tree.postorder(tree.root);
    }
}
