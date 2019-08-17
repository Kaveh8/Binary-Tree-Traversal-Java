
public class Main {

    public static void main(String[] args) {
        Tree T = new Tree();
        Node r = new Node(49);
        T.addNode(r);
        T.addNode(new Node(50));
        T.addNode(new Node(25));
        T.addNode(new Node(18));
        T.addNode(new Node(14));
        T.addNode(new Node(36));
        System.out.println(T.nodeCount);
        T.inOrderPrint();
        T.preOrderPrint();
        T.postOrderPrint();

    }
}
