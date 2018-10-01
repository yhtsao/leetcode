package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BinaryTreePreorderTest {
    private BinaryTreePreorder preorder = new BinaryTreePreorder();

    @Test
    public void test01() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        TreeNode tmp = new TreeNode(1);
        tmp.right = root;
        root = tmp;

        List<Integer> ans = Arrays.asList(1, 2, 3);
        List<Integer> res = preorder.preorderTraversal(root);
        Assertions.assertTrue(ans.equals(res));
    }
}
