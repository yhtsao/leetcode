package common;


import java.util.LinkedList;
import java.util.Queue;

public class TreeLinkNode {
    public int val;
    public TreeLinkNode left, right, next;

    public TreeLinkNode(int x) {
        val = x;
    }

    public static TreeLinkNode initTree(Integer[] vals) {
        TreeLinkNode root = new TreeLinkNode(vals[0]);
        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i < vals.length) {
            TreeLinkNode curr = queue.peek();
            queue.remove();
            if (curr == null) {
                continue;
            }
            curr.left = (vals[i] != null) ? new TreeLinkNode(vals[i]) : null;
            curr.right = (i + 1 < vals.length && vals[i + 1] != null) ?
                    new TreeLinkNode(vals[i + 1]) : null;
            queue.add(curr.left);
            queue.add(curr.right);
            i += 2;
        }
        return root;
    }

    @Override
    public String toString() {
        LinkedList<TreeLinkNode> queue = new LinkedList<>();
        queue.offer(this);

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.val).append(",");
        while (!queue.isEmpty()) {
            TreeLinkNode tmp = queue.poll();

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
