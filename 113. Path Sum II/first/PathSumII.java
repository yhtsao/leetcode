package first;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<>();
        pathSum(root, sum, new ArrayList<>(), ret);
        return ret;
    }

    private void pathSum(TreeNode root, int sum, List<Integer> list, List<List<Integer>> ret) {
        if (root == null) return;
        list.add(root.val);
        if (sum - root.val == 0 && root.left == null && root.right == null) {
            ret.add(new ArrayList<>(list));
        } else {
            pathSum(root.left, sum - root.val, list, ret);
            pathSum(root.right, sum - root.val, list, ret);
        }
        list.remove(list.size() - 1);
        return;
    }
}
