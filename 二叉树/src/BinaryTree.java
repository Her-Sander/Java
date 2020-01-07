import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    char value;
    Node left;
    Node right;

    public Node(char value) {
        this.value = value;
    }

}

public class BinaryTree {
    //前序遍历
    void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    //前序遍历非递归
    void preOrderTraversal1(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack();
        Node cur = root;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.value + " ");
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
    }

    //中序遍历
    void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    //中序遍历非递归
    void inOrderTraversal1(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack();
        Node cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            //这里注意走到这里即代表cur=null,所以需要先拿到栈顶元素在打印
            //打印不了null引用中的值,会造成空指针异常
            cur = stack.pop();
            System.out.print(cur.value + " ");
            cur = cur.right;
        }
    }

    //后序遍历
    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

    //非递归的后序遍历
    void postOrderTraversal1(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack();
        Node cur = root;
        Node flg = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            //flg表示出栈并且打印后的节点,防止重复打印
            if (cur.right == null || cur.right == flg) {
                System.out.print(cur.value + " ");
                cur = stack.pop();
                flg = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
    }

    //非递归层序遍历二叉树
    void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.print(cur.value + " ");
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

    //求节点的个数
    //递归方法
    int getSize1(Node root) {
        if (root == null) {
            return 0;
        }
        return getSize1(root.left) + getSize1(root.right) + 1;
    }

    //遍历的方法
    static int size = 0;

    int getSize2(Node root) {
        if (root == null) {
            return 0;
        }
        size++;
        getSize2(root.left);
        getSize2(root.right);
        return size;
    }

    //求叶子节点的个数
    int getLeafSize(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize(root.left)
                + getLeafSize(root.right);
    }

    static int leafsize = 0;

    int getLeafSize1(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return leafsize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
        return leafsize;
    }

    //求树的深度
    int Depth(Node root) {
        if (root == null) {
            return 0;
        }
        int left = Depth(root.left);
        int right = Depth(root.right);
        return left > right ? left + 1 : right + 1;
    }

    Node find(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.value == val) {
            return root;
        }
        Node ret = find(root.left, val);
        if (ret != null) {
            return ret;
        }
        Node ret1 = find(root.right, val);
        if (ret1 != null) {
            return ret1;
        }
        return null;
    }

    //认为创建一个二叉树
    Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

}
