package first;

import common.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> oddLevel = new LinkedList<>();
        Queue<TreeNode> evenLevel = new LinkedList<>();
        oddLevel.offer(root);
        while (!oddLevel.isEmpty()) {
            if (!oddLevel.isEmpty())
                res.add(levelTraversal(oddLevel, evenLevel));
            if (!evenLevel.isEmpty())
                res.add(levelTraversal(evenLevel, oddLevel));
        }
        return res;
    }

    private List<Integer> levelTraversal(Queue<TreeNode> parentLevel, Queue<TreeNode> childLevel) {
        List<Integer> list = new ArrayList<>();
        while (!parentLevel.isEmpty()) {
            TreeNode node = parentLevel.poll();
            list.add(node.val);
            if (node.left != null) childLevel.offer(node.left);
            if (node.right != null) childLevel.offer(node.right);
        }
        return list;
    }
}
