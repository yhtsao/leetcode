import org.junit.jupiter.api.Test;

import java.util.List;

public class BinaryTreeInorderTest {
    BinaryTreeInorder binaryTreeInorder = new BinaryTreeInorder();

    @Test
    public void test01() {
        Integer[] nodes = new Integer[]{1, null, 2, 3};
        TreeNode root = TreeNode.initTree(nodes);
        System.out.println(root.val);
        List<Integer> result = binaryTreeInorder.inorderTraversal(root);
        System.out.println(result.toString());
    }

    @Test
    public void test02() {
        Integer[] nodes = new Integer[]{0, 1, 2, 3, null, 4, 5, null, 6};
        TreeNode root = TreeNode.initTree(nodes);
        System.out.println(root.val);
        List<Integer> result = binaryTreeInorder.inorderTraversal(null);
        System.out.println(result.toString());
    }
}
