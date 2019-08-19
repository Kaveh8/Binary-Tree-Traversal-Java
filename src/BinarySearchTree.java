

class BinarySearchTree extends BinaryTree{


    BinarySearchTree(Node root) {
        super(root);
    }


    int lowestCommonAncestor(int v1, int v2){
        return findLCA(this.root, v1, v2);
    }

    private int findLCA(Node root, int value1, int value2){ //Lowest common ancestor
        if (root==null) return Integer.parseInt(null);
        else if(value1 == root.value || value2 == root.value)
            return root.value;
        else if((value1 <= root.value && value2 > root.value)
                || (value2 <= root.value && value1 > root.value)){
            return root.value;
        }
        else if(root.value > value1 &&  root.value > value2){
            if(root.left.value==value1 || root.left.value==value2)
                return root.value;
            else
                return findLCA(root.left, value1, value2);
        }
        else {
            if(root.right.value==value1 || root.right.value==value2)
                return root.value;
            else
                return findLCA(root.right, value1, value2);
        }
    }

    @Override
    void deleteNode(Node root, int value){
        if(root==null){}
        else if(root.value==value){
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

    static int getMaxValue(BinaryTree bt){
        if(bt.root==null) return Integer.parseInt(null);
        return MaxValue(bt.root);
    }

    private static int MaxValue(Node root){
        if(root.right!=null){
            return (MaxValue(root.right));
        }
        return root.value;
    }

    static int getMinValue(BinaryTree bt){
        if(bt.root==null) return Integer.parseInt(null);
         return MinValue(bt.root);
    }

    private static int MinValue(Node root){
        if(root.left!=null){
            return (MinValue(root.left));
        }
        return root.value;
    }



}
