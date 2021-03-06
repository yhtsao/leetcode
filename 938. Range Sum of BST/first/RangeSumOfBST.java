package first;

import common.TreeNode;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        int sum = 0;
        if (root.val >= L && root.val <= R)
            sum = root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        else if (root.val < L)
            sum = rangeSumBST(root.right, L, R);
        else if (root.val > R)
            sum = rangeSumBST(root.left, L, R);
        return sum;
    }
}
