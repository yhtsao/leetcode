package common;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode initTree(Integer[] vals) {
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i < vals.length) {
            TreeNode curr = queue.peek();
            queue.remove();
            if (curr == null) {
                continue;
            }
            curr.left = (vals[i] != null) ? new TreeNode(vals[i]) : null;
            curr.right = (i + 1 < vals.length && vals[i + 1] != null) ?
                    new TreeNode(vals[i + 1]) : null;
            queue.add(curr.left);
            queue.add(curr.right);
            i += 2;
        }
        return root;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("val = ").append(val)
                .append(", left = ");
        if (left == null)
            sb.append("null");
        else
            sb.append(left.val);
        sb.append(", right = ");
        if (right == null)
            sb.append("null");
        else
            sb.append(right.val);

        return sb.toString();
    }
}