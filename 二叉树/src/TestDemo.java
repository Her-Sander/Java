import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        System.out.println("前序遍历");
        binaryTree.inOrderTraversal1(root);
        System.out.println();
        binaryTree.levelOrderTraversal(root);
        System.out.println();
        System.out.println(binaryTree.Depth(root));

    }
}
