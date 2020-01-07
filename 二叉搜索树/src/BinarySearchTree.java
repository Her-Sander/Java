

public class BinarySearchTree {

    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node root = null;

    public void insert(int key) {
        Node node = new Node(key);
        if (root == null) {
            root = node;
            return;
        }
        Node cur = root;
        Node parent = cur;
        while (cur != null) {
            if (cur.val == key) {
                return;
            }
            if (cur.val < key) {
                parent = cur;
                cur = cur.right;
            } else {
                parent = cur;
                cur = cur.left;
            }
        }
        if (parent.val < key) {
            parent.right = node;
        } else {
            parent.left = node;
        }
    }

    public void prevQrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        prevQrder(root.left);
        prevQrder(root.right);
    }

    public void inQrder(Node root) {
        if (root == null) {
            return;
        }
        inQrder(root.left);
        System.out.print(root.val + " ");
        inQrder(root.right);
    }

    public Node search(int key) {
        while (root != null) {
            if (root.val == key) {
                return root;
            } else if (root.val < key) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return null;
    }

    public void remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (cur.val == key) {
                removeNode(parent, cur);
                return;
            } else if (cur.val < key) {
                parent = cur;
                cur = cur.right;
            } else {
                parent = cur;
                cur = cur.left;
            }
        }
    }

    public void removeNode(Node parent, Node cur) {
        if (cur.left == null) {
            if (cur == root) {
                root = cur.right;
            } else if (cur == parent.left) {
                parent.left = cur.right;
            } else {
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } else if (cur == parent.left) {
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }
        } else {
            Node targetparent = cur;
            Node target = cur.right;
            while (target.left != null) {
                targetparent = cur;
                target = cur.left;
            }
            cur.val = target.val;
            if (target == targetparent.left) {
                targetparent.left = target.right;
            } else {
                targetparent.right = target.right;
            }
        }
    }
}
