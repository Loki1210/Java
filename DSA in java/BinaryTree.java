class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Method to insert a new node
    Node insert(Node node, int data) {
        // If the tree is empty, return a new node
        if (node == null) {
            node = new Node(data);
            return node;
        }

        // Otherwise, recur down the tree
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        // Return the (unchanged) node pointer
        return node;
    }

    // Inorder traversal (Left, Root, Right)
    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

     // Preorder traversal (Root, Left, Right)
    void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Postorder traversal (Left, Right, Root)
    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Method to search a node
    Node search(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.data == key)
            return root;

        // Key is greater than root's data
        if (root.data < key)
            return search(root.right, key);

        // Key is smaller than root's data
        return search(root.left, key);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Inorder traversal of the tree:");
        tree.inorderTraversal(tree.root);

        System.out.println("\nPreorder traversal of the tree:");
        tree.preorderTraversal(tree.root);

        System.out.println("\nPostorder traversal of the tree:");
        tree.postorderTraversal(tree.root);

        System.out.println("\nSearch for node with value 40:");
        Node result = tree.search(tree.root, 40);
        if (result != null)
            System.out.println("Node found: " + result.data);
        else
            System.out.println("Node not found");
    }
}
