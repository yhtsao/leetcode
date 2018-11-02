package first;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreeII {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return genTree(1, n);
    }

    private List<TreeNode> genTree(int lo, int hi) {
        List<TreeNode> ret = new ArrayList<>();
        if (lo > hi) {
            ret.add(null);
            return ret;
        }

        for (int i = lo; i <= hi; i++) {
            List<TreeNode> leftChildren = genTree(lo, i - 1);
            List<TreeNode> rightChildren = genTree(i + 1, hi);

            for (TreeNode left : leftChildren) {
                for (TreeNode right : rightChildren) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    ret.add(root);
                }
            }
        }
        return ret;
    }
}
