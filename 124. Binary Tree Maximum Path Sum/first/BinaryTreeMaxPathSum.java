package first;

import common.TreeNode;

public class BinaryTreeMaxPathSum {
    private int maxVal;

    public int maxPathSum(TreeNode root) {
        maxVal = Integer.MIN_VALUE;
        int res = maxPathSumRecur(root);
        return Math.max(maxVal, res);
    }

    private int maxPathSumRecur(TreeNode root) {
        if (root == null) return 0;

        int sumFromLeftNode = Math.max(0, maxPathSumRecur(root.left));
        int sumFromRightNode = Math.max(0, maxPathSumRecur(root.right));
        maxVal = Math.max(maxVal, root.val + sumFromLeftNode + sumFromRightNode);
        return root.val + Math.max(sumFromLeftNode, sumFromRightNode);
    }
}
