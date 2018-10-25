package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberIIITest {
    HouseRobberIII sol = new HouseRobberIII();

    @Test
    public void test01() {
        TreeNode root = TreeNode.initTree(new Integer[]{3, 2, 3, null, 3, null, 1});
        int ans = 7;
        Assertions.assertEquals(ans, sol.rob(root));
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.initTree(new Integer[]{3, 4, 5, 1, 3, null, 1});
        int ans = 9;
        Assertions.assertEquals(ans, sol.rob(root));
    }

    @Test
    public void test03() {
        TreeNode root = TreeNode.initTree(new Integer[]{6, 2, 3, null, 3, null, 1, 100});
        int ans = 107;
        Assertions.assertEquals(ans, sol.rob(root));
    }
}
