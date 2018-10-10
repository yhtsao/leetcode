package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateBSTTest {
    private ValidateBST sol = new ValidateBST();

    @Test
    public void test01() {
        TreeNode root = TreeNode.initTree(new Integer[]{2, 1, 3});
        boolean res = sol.isValidBST(root);
        Assertions.assertTrue(res);
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.initTree(new Integer[]{5, 1, 4, null, null, 3, 6});
        boolean res = sol.isValidBST(root);
        Assertions.assertFalse(res);
    }

    @Test
    public void test03() {
        TreeNode root = TreeNode.initTree(new Integer[]{3, null, 30, 10, null, null, 15, null, 45});
        boolean res = sol.isValidBST(root);
        Assertions.assertFalse(res);
    }

    @Test
    public void test04() {
        TreeNode root = TreeNode.initTree(new Integer[]{1, 1});
        boolean res = sol.isValidBST(root);
        Assertions.assertFalse(res);
    }

    @Test
    public void test05() {
        TreeNode root = TreeNode.initTree(new Integer[]{Integer.MAX_VALUE});
        boolean res = sol.isValidBST(root);
        Assertions.assertTrue(res);
    }

    @Test
    public void test06() {
        TreeNode root = TreeNode.initTree(new Integer[]{Integer.MAX_VALUE, Integer.MAX_VALUE});
        boolean res = sol.isValidBST(root);
        Assertions.assertFalse(res);
    }
}
