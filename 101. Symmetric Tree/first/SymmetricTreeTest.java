package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {
    SymmetricTree sol = new SymmetricTree();

    @Test
    public void test01() {
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        boolean ans = true;
        Assertions.assertEquals(ans, sol.isSymmetric(root));
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 2, null, 3, null, 3});
        boolean ans = false;
        Assertions.assertEquals(ans, sol.isSymmetric(root));
    }

    @Test
    public void test03() {
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 2, 3, null, null, 3});
        boolean ans = true;
        Assertions.assertEquals(ans, sol.isSymmetric(root));
    }
}
