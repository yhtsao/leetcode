package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedArrayToBSTTest {
    private SortedArrayToBST sol = new SortedArrayToBST();

    @Test
    public void test01() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode tree = sol.sortedArrayToBST(nums);
        System.out.println(tree.toString());

        String ans = "[0,-10,5,null,-3,null,9]";
        Assertions.assertTrue(ans.equals(tree.toString()));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{-10, -3, 0, 2, 5, 9};
        TreeNode tree = sol.sortedArrayToBST(nums);
        System.out.println(tree.toString());

        String ans = "[0,-10,5,null,-3,2,9]";
        Assertions.assertTrue(ans.equals(tree.toString()));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{0};
        TreeNode tree = sol.sortedArrayToBST(nums);
        System.out.println(tree.toString());

        String ans = "[0]";
        Assertions.assertTrue(ans.equals(tree.toString()));
    }

    @Test
    public void test04() {
        int[] nums = new int[]{0, 1};
        TreeNode tree = sol.sortedArrayToBST(nums);
        System.out.println(tree.toString());

        String ans = "[0,null,1]";
        Assertions.assertTrue(ans.equals(tree.toString()));
    }
}
