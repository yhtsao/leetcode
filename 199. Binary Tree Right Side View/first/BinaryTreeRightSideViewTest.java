package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BinaryTreeRightSideViewTest {
    private BinaryTreeRightSideView sol = new BinaryTreeRightSideView();

    @Test
    public void test01() {
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 3, null, 5, null, 4});
        List<Integer> ans = Arrays.asList(1, 3, 4);
        List<Integer> ret = sol.rightSideView(root);
        Assertions.assertTrue(ans.equals(ret));
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.initTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        List<Integer> ans = Arrays.asList(3, 1, 8, 4);
        List<Integer> ret = sol.rightSideView(root);
        Assertions.assertTrue(ans.equals(ret));
    }
}
