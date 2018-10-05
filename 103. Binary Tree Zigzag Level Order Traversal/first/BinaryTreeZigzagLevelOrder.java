package first;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isOddLevel = true;
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                if (isOddLevel) list.add(node.val);
                else list.add(0, node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            isOddLevel = !isOddLevel;
            res.add(list);
        }
        return res;
    }
}
