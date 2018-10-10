package first;

import common.TreeNode;

import java.util.Stack;

public class ValidateBST {
    final int MIN = 0, MAX = 1;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return isValidBSTIterative(root);
    }

    // return in {minVal, maxVal} pair
    private int[] recur(TreeNode root) {
        if (root.left == null && root.right == null)
            return new int[]{root.val, root.val};

        int[] minMaxVal = new int[]{root.val, root.val};
        if (root.left != null) {
            int[] minMaxValLeft = recur(root.left);
            if (minMaxValLeft == null || root.val <= minMaxValLeft[MAX]) return null;
            minMaxVal[MIN] = minMaxValLeft[MIN];
        }
        if (root.right != null) {
            int[] minMaxValRight = recur(root.right);
            if (minMaxValRight == null || root.val >= minMaxValRight[MIN]) return null;
            minMaxVal[MAX] = minMaxValRight[MAX];
        }

        return minMaxVal;
    }

    public boolean isValidBSTIterative(TreeNode root) {
        if (root == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (pre != null && root.val <= pre.val) return false;
                pre = root;
                root = root.right;
            }
        }

        return true;
    }

}
