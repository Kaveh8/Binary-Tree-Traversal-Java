
public class Main {

    public static void main(String[] args) {
        BinarySearchTree T1 = new BinarySearchTree(new Node(49));
        T1.addNode(new Node(50));
        T1.addNode(new Node(25));
        T1.addNode(new Node(18));
        T1.addNode(new Node(14));
        T1.addNode(new Node(36));
        System.out.println("\n"+T1.nodeCount);
        T1.inOrderPrint();
        T1.preOrderPrint();
        T1.postOrderPrint();
        T1.levelOrderPrint();
        BinarySearchTree.getMaxValue(T1);
        BinarySearchTree.getMinValue(T1);

        BinarySearchTree T2 = new BinarySearchTree(new Node(10));
        T2.addNode(new Node(8));
        T2.addNode(new Node(25));
        T2.addNode(new Node(16));
        T2.addNode(new Node(5));
        T2.addNode(new Node(4));
        T2.addNode(new Node(6));
        System.out.println("\n"+T2.nodeCount);
        T2.inOrderPrint();
        T2.preOrderPrint();
        T2.postOrderPrint();
        T2.levelOrderPrint();
        System.out.println("\nLowest Common Ancestor: "+T2.lowestCommonAncestor(4,5));
        BinarySearchTree.getMaxValue(T2);
        BinarySearchTree.getMinValue(T2);
        System.out.println("\n"+ BinarySearchTree.isEqual(T1.root,T2.root));
        T2.inOrderPrint();
        T2.deleteNode(T2.root,8);
        T2.inOrderPrint();
        T2.addNode(new Node(8));
        T2.inOrderPrint();
        T2.deleteNode(T2.root,10);
        T2.inOrderPrint();
        BinaryTree BT = new BinaryTree(new Node(2));
        BT.addNode(new Node(56));
        BT.inOrderPrint();
        System.out.println("\nIs BST: "+BT.isBST());

    }
}
