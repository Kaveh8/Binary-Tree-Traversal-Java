
abstract class BinaryTree {
    Node root;
    int nodeCount;

    abstract protected void insertNode(Node root, Node node);
    abstract int findLCA(Node root, Node node1, Node node2);
    abstract void deleteNode(Node root, int value);

    void addNode(Node node) {
        nodeCount++;
        insertNode(root, node);
    }

    void inOrderPrint() {
        System.out.print("\ninOrder Traversal: \n");
        if(root==null) return;
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
        if(root==null) return;
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
        if(root==null) return;
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
    void levelOrderPrint() {
        System.out.print("\nlevelOrder Traversal: \n");
        if(root==null) return;
        levelOrder(root);
    }

    private void levelOrder(Node root) {
        //TODO
        if (root.left != null) {
            postOrder(root.left);
        }
        if (root.right != null) {
            postOrder(root.right);
        }
        System.out.print(root.value+" ");
    }


    static boolean isEqual(Node root1, Node root2){
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null)
            return false;

        return (root1.value==root2.value
                && isEqual(root1.left,root2.left)
                && isEqual(root1.right, root2.right));
    }

}

