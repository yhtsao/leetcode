package first;

import common.TreeNode;

import java.util.HashMap;

public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return sum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int sum(TreeNode root, int sum) {
        if (root == null) return 0;
        int cnt = 0;
        if (sum - root.val == 0) cnt++;
        return cnt + sum(root.left, sum - root.val) + sum(root.right, sum - root.val);
    }

    public int pathSumV2(TreeNode root, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return getPrefixSum(root, 0, sum, map);
    }

    private int getPrefixSum(TreeNode root, int sum, int target, HashMap<Integer, Integer> map) {
        if (root == null) return 0;

        sum += root.val;
        int currentCnt = map.getOrDefault(sum - target, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        currentCnt += getPrefixSum(root.left, sum, target, map) + getPrefixSum(root.right, sum, target, map);
        map.put(sum, map.getOrDefault(sum, 1) - 1);
        return currentCnt;
    }
}
