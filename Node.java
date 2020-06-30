package tree;
public class Node {

    Node left, right;
    int data;

    Node() {
        data = -1; // tanda kalau kosong
        left = null;
        right = null;
    }

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
    int idata;

    boolean isEmpty() {
        if (idata == -1) {
            return false;
        } else {
            return true;
        }
    }

    void insertLeft(Node n) {
        left = n;
    }

    void insertRight(Node n) {
        right = n;
    }

    boolean hasLeftChild() {
        return left != null;
    }

    boolean hasRightChild() {
        return right != null;
    }

    boolean isLeaf() {
        return (left == null && right == null);
    }

    boolean hasLeft() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    boolean hasRight() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
