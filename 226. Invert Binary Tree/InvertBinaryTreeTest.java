import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {
    private InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

    @Test
    public void test01() {
        Integer[] nodes = new Integer[]{4, 2, 7, 1, 3, 6, 9};
        TreeNode root = TreeNode.initTree(nodes);
        invertBinaryTree.invertTree(root);
        System.out.println(root.left + ", " + root.right);
    }
}
