
public class Test {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 2, 11, 15, 9};
        BinarySearchTree btree = new BinarySearchTree();
        for (int i = 0; i < array.length; i++) {
            btree.insert(array[i]);
        }
        btree.prevQrder(btree.root);
        System.out.println();
        btree.inQrder(btree.root);
        System.out.println();
        try {
            BinarySearchTree.Node ret = btree.search(10);
            System.out.println(ret.val);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("ret为空");
        }
        btree.remove(2);
        btree.remove(10);
        btree.inQrder(btree.root);
        System.out.println();
    }
}
