package first;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;


public class HouseRobberIII {
    public int rob(TreeNode root) {
        return robArray(root);
    }

    // Solution 1: recursive visited all nodes and get maximum value
    private int robNaive(TreeNode root) {
        if (root == null) return 0;

        int includeRoot = root.val;
        int excludeRoot = 0;
        if (root.left != null) {
            includeRoot += rob(root.left.left) + rob(root.left.right);
            excludeRoot += rob(root.left);
        }
        if (root.right != null) {
            includeRoot += rob(root.right.left) + rob(root.right.right);
            excludeRoot += rob(root.right);
        }
        return Math.max(includeRoot, excludeRoot);
    }

    private int robHash(TreeNode root) {
        return robWithHash(root, new HashMap<>());
    }

    private int robWithHash(TreeNode root, Map<TreeNode, Integer> map) {
        if (root == null) return 0;
        if (map.containsKey(root)) return map.get(root);

        int includeRoot = root.val;
        int excludeRoot = 0;
        if (root.left != null) {
            includeRoot += robWithHash(root.left.left, map) + robWithHash(root.left.right, map);
            excludeRoot += robWithHash(root.left, map);
        }
        if (root.right != null) {
            includeRoot += robWithHash(root.right.left, map) + robWithHash(root.right.right, map);
            excludeRoot += robWithHash(root.right, map);
        }

        int val = Math.max(includeRoot, excludeRoot);
        map.put(root, val);
        return val;
    }

    private int robArray(TreeNode root) {
        int[] ret = robWithArray(root);
        return Math.max(ret[0], ret[1]);
    }

    /*
        ret[0]: max value without root
        ret[1]: max value contains root
     */
    private int[] robWithArray(TreeNode root) {
        if (root == null) return new int[2];

        int[] left = robWithArray(root.left);
        int[] right = robWithArray(root.right);

        int[] ret = new int[2];
        ret[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        ret[1] = root.val + left[0] + right[0];

        return ret;
    }
}
