
class Tree {
    private Node root;
    int nodeCount;

    void addNode(Node node) {
        nodeCount++;
        insertNode(root, node);
    }

    private void insertNode(Node root, Node node) {
        if (root == null) {
            this.root = node;
        } else {
            if (node.value <= root.value) {
                if (root.left == null)
                    root.left = node;
                else
                    insertNode(root.left, node);
            } else if (node.value > root.value) {
                if (root.right == null)
                    root.right = node;
                else
                    insertNode(root.right, node);
            }
        }
    }

    void inOrderPrint() {
        System.out.print("\ninOrder Traversal: \n");
        inOrder(root);
    }

    private void inOrder(Node root) {
        if(root.left!= null)
            inOrder(root.left);
        System.out.print(root.value+" ");
        if(root.right!=null)
            inOrder(root.right);

    }
    void preOrderPrint() {
        System.out.print("\npreOrder Traversal: \n");
        preOrder(root);
    }

    private void preOrder(Node root) {
        System.out.print(root.value + " ");
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }
    void postOrderPrint() {
        System.out.print("\npostOrder Traversal: \n");
        postOrder(root);
    }

    private void postOrder(Node root) {
        if (root.left != null) {
            postOrder(root.left);
        }
        if (root.right != null) {
            postOrder(root.right);
        }
        System.out.print(root.value+" ");
    }
}
