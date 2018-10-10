package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindKthInBSTTest {
    private FindKthInBST sol = new FindKthInBST();

    @Test
    public void test01() {
        TreeNode root = TreeNode.initTree(new Integer[]{3, 1, 4, null, 2});
        for (int k = 1; k <= 4; k++)
            Assertions.assertEquals(k, sol.kthSmallest(root, k));
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.initTree(new Integer[]{5, 3, 6, 2, 4, null, null, 1});
        for (int k = 1; k <= 6; k++)
            Assertions.assertEquals(k, sol.kthSmallest(root, k));
    }
}
