import com.sun.istack.internal.Nullable;

class Node {
    int value;
    @Nullable
    Node left;
    @Nullable
    Node right;

    Node(int value) {
        this.value = value;
        this.left=null;
        this.right=null;
    }
}
