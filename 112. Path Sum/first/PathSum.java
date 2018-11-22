package first;

import common.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (sum - root.val == 0 && root.left == null && root.right == null) return true;
        boolean ret = hasPathSum(root.left, sum - root.val) | hasPathSum(root.right, sum - root.val);
        return ret;
    }
}
