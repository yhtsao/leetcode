package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthofBinaryTreeTest {
    private MaximumDepthofBinaryTree sol = new MaximumDepthofBinaryTree();

    @Test
    public void test01() {
        TreeNode root = TreeNode.initTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        int ans = 3;
        int res = sol.maxDepth(root);
        Assertions.assertEquals(ans, res);
    }
}
