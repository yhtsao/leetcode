package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BinaryTreePostorderTest {
    private BinaryTreePostorder postorder = new BinaryTreePostorder();

    @Test
    public void test01() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        TreeNode tmp = new TreeNode(1);
        tmp.right = root;
        root = tmp;

        List<Integer> ans = Arrays.asList(3, 2, 1);
        List<Integer> res = postorder.postorderTraversal(root);
        Assertions.assertTrue(ans.equals(res));
    }
}
