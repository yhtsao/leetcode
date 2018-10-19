package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LCAofBinaryTreeTest {
    private LCAofBinaryTree sol = new LCAofBinaryTree();

    @Test
    public void test01() {
        TreeNode root = TreeNode.initTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p = root.left; // 5
        TreeNode q = root.right; // 1
        TreeNode ans = root; // 3
        TreeNode ret = sol.lowestCommonAncestor(root, p, q);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.initTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p = root.left; // 5
        TreeNode q = p.right.right; // 4
        TreeNode ans = p; // 3
        TreeNode ret = sol.lowestCommonAncestor(root, p, q);
        Assertions.assertEquals(ans, ret);
    }
}
