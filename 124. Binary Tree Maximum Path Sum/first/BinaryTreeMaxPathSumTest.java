package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeMaxPathSumTest {
    private BinaryTreeMaxPathSum maxSum = new BinaryTreeMaxPathSum();

    @Test
    public void test01() {
        Integer[] treeNodes = new Integer[]{-10, 9, 20, null, null, 15, 7};
        TreeNode root = TreeNode.initTree(treeNodes);
        int ans = 42;
        int res = maxSum.maxPathSum(root);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        Integer[] treeNodes = new Integer[]{1, 2, 3};
        TreeNode root = TreeNode.initTree(treeNodes);
        int ans = 6;
        int res = maxSum.maxPathSum(root);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        Integer[] treeNodes = new Integer[]{2, -1, null};
        TreeNode root = TreeNode.initTree(treeNodes);
        int ans = 2;
        int res = maxSum.maxPathSum(root);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        Integer[] treeNodes = new Integer[]{2, -1, -2};
        TreeNode root = TreeNode.initTree(treeNodes);
        int ans = 2;
        int res = maxSum.maxPathSum(root);
        Assertions.assertEquals(ans, res);
    }
}
