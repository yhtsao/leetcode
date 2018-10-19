package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InorderSuccessorInBSTTest {
    private InorderSuccessorInBST sol = new InorderSuccessorInBST();

    @Test
    public void test01() {
        TreeNode root = TreeNode.initTree(new Integer[]{2, 1, null});
        TreeNode p = root.left;
        TreeNode ans = root;
        TreeNode ret = sol.inorderSuccessor(root, p);
        Assertions.assertTrue(ans == ret);

        p = root;
        ret = sol.inorderSuccessor(root, p);
        Assertions.assertTrue(null == ret);
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.initTree(new Integer[]{2, 1, 3});
        TreeNode p = root.left;
        TreeNode ans = root;
        TreeNode ret = sol.inorderSuccessor(root, p);
        Assertions.assertTrue(ans == ret);

        p = root;
        ans = root.right;
        ret = sol.inorderSuccessor(root, p);
        Assertions.assertTrue(ans == ret);
    }

    @Test
    public void test03() {
        TreeNode root = TreeNode.initTree(new Integer[]{5, 3, 8, null, null, 6, 10, null, null, 9});
        TreeNode p = root; // 5
        TreeNode ans = root.right.left; // 6
        TreeNode ret = sol.inorderSuccessor(root, p);
        Assertions.assertTrue(ans == ret);

        p = root.right; // 8
        ans = root.right.right.left; // 9
        ret = sol.inorderSuccessor(root, p);
        Assertions.assertTrue(ans == ret);
    }

    @Test
    public void test04() {
        TreeNode root = TreeNode.initTree(new Integer[]{3, 1, 4, null, 2});
        TreeNode p = root.left.right; // 2
        TreeNode ans = root; // 3
        TreeNode ret = sol.inorderSuccessor(root, p);
        Assertions.assertTrue(ans == ret);
    }
}
