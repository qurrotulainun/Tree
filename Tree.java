package tree;
public class Tree {

    private static class Queueu {

        public Queueu() {
        }

        private void enqueue(Node Node) {
            throw new UnsupportedOperationException("Not yet implemented");
        }

        private boolean isEmpty() {
            throw new UnsupportedOperationException("Not yet implemented");
        }

        private Node dequeue() {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }
    Node root;
    private Node Node;

    boolean isEmpty() {
        if (root == null) {
            return false;
        } else {
            return true;
        }
    }

    Node addNode(Node root, int databaru) {
        return root;
    }

    void insert(int databaru) {
        root = addNode(root, databaru);
    }

    Node insertNode(Node n, int databaru) {
        if (n == null) {
            n = new Node(databaru);
        } else {
            if (databaru <= n.data) {
                n.insertLeft(insertNode(n.left, databaru));
            } else {
                n.insertRight(insertNode(n.right, databaru));
            }
        }
        return n;
    }

    void preOrder(Node n) {
        if (n != null) {
            System.out.println(n.data);
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    void inOrder(Node n) {
        if (n != null) {
            inOrder(n.left);
            System.out.println(n.data);
            inOrder(n.right);
        }
    }

    void postOrder(Node n) {
        if (n != null) {
            postOrder(n.left);
            postOrder(n.left);
            System.out.println(n.data);
        }
    }

    Node find(Node n, int x) {
        if (n == null) {
            return null;
        } else if (n.data == x) {
            return root;
        } else if (n.data < x) {
            return find(n.left);
        } else if (n.data > x) {
            return find(n.right);
        } else {
            return null;
        }
    }

    Node find(Node n) {
        if (n == null) {
            return null;
        } else {
            return n;
        }
    }

    int count(Node n) {
        if (n == null) {
            return 0;
        }
        return count(n.left) + count(n.right) + 1;
    }

    int height(Node n) {
        if (root == null) {
            return 0;
        }
        int u = height(n.left);
        int v = height(n.right);
        if (u > v) {
            return u + 1;
        } else {
            return v + 1;
        }
    }

    Node findMin(Node n) {
        if (root == null) {
            return null; // pengggunaan data
        } else if (n.left == null) {
            return n; //pencarian data
        } else {
            return findMin(n.left);
        }
    }

    void leaf(Node n) {
        if (n == null) {
            System.out.println("kosong!");
        }
        if (n.left != null) {
            leaf(n.left);
        }
        if (n.right != null) {
            leaf(n.right);
        }
        if (n.right == null && n.left == null) {
            System.out.println(n.data);
        }
    }

    void levelOrder() {
        Queueu Q = null;
        Q.enqueue(root);

        while (!Q.isEmpty()) {
            Node n = Q.dequeue();
            System.out.println(n.data);

            if (n.hasLeft()) {
                Q.enqueue(n.left);
            }

            if (n.hasRight()) {
                Q.enqueue(n.right);
            }

        }
    }
}
