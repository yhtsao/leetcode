package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeLevelOrderTest {
    private BinaryTreeLevelOrder sol = new BinaryTreeLevelOrder();

    @Test
    public void test01() {
        Integer[] nums = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode tree = TreeNode.initTree(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(3));
        ans.add(Arrays.asList(9, 20));
        ans.add(Arrays.asList(15, 7));

        List<List<Integer>> res = sol.levelOrder(tree);

        for (int i = 0; i < ans.size(); i++) {
            Assertions.assertTrue(ans.get(i).equals(res.get(i)));
        }
    }

    @Test
    public void test02() {
        Integer[] nums = new Integer[]{5, null, 7};
        TreeNode tree = TreeNode.initTree(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(5));
        ans.add(Arrays.asList(7));

        List<List<Integer>> res = sol.levelOrder(tree);

        for (int i = 0; i < ans.size(); i++) {
            Assertions.assertTrue(ans.get(i).equals(res.get(i)));
        }
    }

    @Test
    public void test03() {
        Integer[] nums = new Integer[]{5, 7, null};
        TreeNode tree = TreeNode.initTree(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(5));
        ans.add(Arrays.asList(7));

        List<List<Integer>> res = sol.levelOrder(tree);

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

        List<List<Integer>> res = sol.levelOrder(tree);

        for (int i = 0; i < ans.size(); i++) {
            Assertions.assertTrue(ans.get(i).equals(res.get(i)));
        }
    }

    @Test
    public void test05() {
        Integer[] nums = new Integer[]{-150, null, -149, null, -148, null, -147, null, -146, null, -145, null, -144, null, -143, null, -142, null, -141, null, -140, null, -139, null, -138, null, -137, null, -136, null, -135, null, -134, null, -133, null, -132, null, -131, null, -130, null, -129, null, -128, null, -127, null, -126, null, -125, null, -124, null, -123, null, -122, null, -121, null, -120, null, -119, null, -118, null, -117, null, -116, null, -115};
        TreeNode tree = TreeNode.initTree(nums);

        List<List<Integer>> res = sol.levelOrder(tree);

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i).toString());
        }
    }
}
