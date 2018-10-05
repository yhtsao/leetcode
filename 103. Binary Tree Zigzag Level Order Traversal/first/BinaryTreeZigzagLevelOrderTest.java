package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTest {
    private BinaryTreeZigzagLevelOrder sol = new BinaryTreeZigzagLevelOrder();

    @Test
    public void test01() {
        Integer[] nums = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode tree = TreeNode.initTree(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(3));
        ans.add(Arrays.asList(20, 9));
        ans.add(Arrays.asList(15, 7));

        List<List<Integer>> res = sol.zigzagLevelOrder(tree);

        for (int i = 0; i < ans.size(); i++) {
            Assertions.assertTrue(ans.get(i).equals(res.get(i)));
        }
    }

    @Test
    public void test02() {
        Integer[] nums = new Integer[]{5, 6, 7};
        TreeNode tree = TreeNode.initTree(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(5));
        ans.add(Arrays.asList(7, 6));

        List<List<Integer>> res = sol.zigzagLevelOrder(tree);

        for (int i = 0; i < ans.size(); i++) {
            Assertions.assertTrue(ans.get(i).equals(res.get(i)));
        }
    }

    @Test
    public void test04() {
        Integer[] nums = new Integer[]{3, null, 20, 15, null, null, 7};
        TreeNode tree = TreeNode.initTree(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(3));
        ans.add(Arrays.asList(20));
        ans.add(Arrays.asList(15));
        ans.add(Arrays.asList(7));

        List<List<Integer>> res = sol.zigzagLevelOrder(tree);

        for (int i = 0; i < ans.size(); i++) {
            Assertions.assertTrue(ans.get(i).equals(res.get(i)));
        }
    }
}
