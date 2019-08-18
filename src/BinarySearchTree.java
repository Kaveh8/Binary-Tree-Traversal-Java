

class BinarySearchTree extends BinaryTree{


    @Override
    protected void insertNode(Node root, Node node) {
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

    @Override
    int findLCA(Node root, Node node1, Node node2){ //Lowest common ancestor
        if (root==null) return -1;
        else if(node1.value == root.value || node2.value == root.value)
            return root.value;
        else if((node1.value <= root.value && node2.value > root.value)
                || (node2.value <= root.value && node1.value > root.value)){
            return root.value;
        }
        else if(root.value > node1.value &&  root.value > node2.value){
            return findLCA(root.left, node1, node2);
        }
        else {
            return findLCA(root.right, node1, node2);
        }
    }

    @Override
    void deleteNode(Node root, int value){
        if(root==null)                   {}
        else if(root.value==value)       {
            if(root.left==null && root.right==null)
                this.root=null;
            else if(root.right==null)
                this.root=root.left;
            else {
                int i = MinValue(root.right);
                root.value = i;
                if (i == root.right.value)
                    root.right = null;
                else
                    deleteNode(root.right, i);
            }
        }
        else if(root.left.value==value)  removeNode(root,root.left);
        else if(root.right.value==value) removeNode(root,root.right);
        else if(value<root.value)        deleteNode(root.left,value);
        else if(value>root.value)        deleteNode(root.right,value);
    }

    private void removeNode(Node parent, Node child) {
        if (parent.left == child) {
            if (child.right==null && child.left==null){
                parent.left=null;
            }else if(child.right==null ){
                parent.left = child.left;
            }else{
                int i = MinValue(child.right);
                child.value=i;
                if(i==child.right.value)
                    child.right=null;
                else
                    deleteNode(child,i);
            }
        } else if (parent.right == child) {
            if (child.right==null && child.left==null){
                parent.right=null;
            }else if(child.right==null ){
                parent.right = child.left;
            }else{
                int i = MinValue(child.right);
                child.value=i;
                if(i==child.right.value)
                    child.right=null;
                else
                    deleteNode(child,i);
            }
        }
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

    boolean isBST() { //Binary Search Tree
        return this.root != null &&
                checkBST(this.root, MaxValue(this.root), MinValue(this.root));
    }
    private boolean checkBST(Node root,int max, int min){
        if(root.value<min || root.value>max)
            return false;
        else{
            if(root.right!=null) checkBST(root.right,MaxValue(root.right), MinValue(root.right));
            if(root.left!=null) checkBST(root.left,MaxValue(root.left), MinValue(root.left));
        }
        return true;
    }

}
