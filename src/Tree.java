
class Tree {
    Node root;
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

    void getMaxValue(){
        if(root==null) System.out.print("\nNo Node Available");
        System.out.print("\nMax Value: "+MaxValue(root));
    }
    private int MaxValue(Node root){
        if(root.right!=null){
            return (MaxValue(root.right));
        }
        return root.value;
    }
    void getMinValue(){
        if(root==null) System.out.print("\nNo Node Available");
        System.out.print("\nMin Value: "+MinValue(root));
    }
    private int MinValue(Node root){
        if(root.left!=null){
            return (MinValue(root.left));
        }
        return root.value;
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
    
    boolean isBST(){ //Binary Search Tree
        //TODO
        return true;
    }
    int findLCA(){ //Lowest common ancestor
        //TODO
        return 0;
    }
    void deleteNode(Node root, int value){
        //TODO
    }

}
