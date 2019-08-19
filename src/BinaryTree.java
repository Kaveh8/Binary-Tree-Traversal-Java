import java.util.ArrayList;

class BinaryTree {
    Node root;
    int nodeCount;


    BinaryTree(Node root){
         this.addNode(root);
    }

    void addNode(Node node) {
        nodeCount++;
        insertNode(root, node);
    }

     protected void insertNode(Node root, Node node){
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

    void deleteNode(Node root, int value){
        //TODO
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
        ArrayList<Node> tmp = new ArrayList<>();
        tmp.add(root);
        levelOrder(tmp);
    }

    private void levelOrder(ArrayList<Node> nodeList) {
        ArrayList<Node> nodeChildList=new ArrayList<>();
        nodeChildList.clear();
        for(int i=0;i<nodeList.size();i++){
            Node n = nodeList.get(i);
            System.out.print(n.value+" ");
            if(n.left!=null) nodeChildList.add(n.left);
            if(n.right!=null) nodeChildList.add(n.right);
        }
        if (nodeChildList.size() != 0)
            levelOrder(nodeChildList);
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

    boolean isBST() { //Binary Search Tree

        return this.root != null &&
                checkBST(this.root, BinarySearchTree.getMaxValue(this),
                        BinarySearchTree.getMinValue(this));
    }
    private boolean checkBST(Node root,int max, int min){
        if(root.value<min || root.value>max)
            return false;
        else{
            if(root.right!=null) checkBST(root.right,BinarySearchTree.getMaxValue(new BinaryTree(root.right)),
                    BinarySearchTree.getMinValue(new BinaryTree(root.right)));
            if(root.left!=null) checkBST(root.left,BinarySearchTree.getMaxValue(new BinaryTree(root.left)),
                    BinarySearchTree.getMaxValue(new BinaryTree(root.left)));
        }
        return true;
    }

}

