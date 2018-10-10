package common;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(this);

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.val).append(",");
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            //sb.append(tmp.val).append(",");

            if (tmp.left == null && tmp.right == null) continue;

            if (tmp.left == null) sb.append("null,");
            else {
                sb.append(tmp.left.val).append(",");
                queue.offer(tmp.left);
            }

            if (tmp.right == null) sb.append("null,");
            else {
                sb.append(tmp.right.val).append(",");
                queue.offer(tmp.right);
            }
        }
        sb.delete(sb.length() - 1, sb.length());
        if (sb.substring(sb.length() - 4, sb.length()).equals("null"))
            sb.delete(sb.length() - 5, sb.length());
        sb.append("]");
        return sb.toString();
    }
}
