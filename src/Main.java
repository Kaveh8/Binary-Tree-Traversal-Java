
public class Main {

    public static void main(String[] args) {
        Tree T1 = new Tree();
        Node r = new Node(49);
        T1.addNode(r);
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
        T1.getMaxValue();
        T1.getMinValue();

        Tree T2 = new Tree();
        T2.addNode(new Node(10));
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
        T2.getMaxValue();
        T2.getMinValue();
        System.out.println("\n"+Tree.isEqual(T1.root,T2.root));

    }
}
