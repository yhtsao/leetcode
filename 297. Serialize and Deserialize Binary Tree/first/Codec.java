package first;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur == null)
                sb.append("X,");
            else {
                sb.append(cur.val).append(",");
                queue.offer(cur.left);
                queue.offer(cur.right);
            }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) return null;

        String[] splitData = data.split(",");
        TreeNode root = new TreeNode(new Integer(splitData[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (i < splitData.length) {
            TreeNode cur = queue.poll();
            if (!splitData[i].equals("X")) {
                cur.left = new TreeNode(new Integer(splitData[i]));
                queue.offer(cur.left);
            }
            i++;
            if (!splitData[i].equals("X")) {
                cur.right = new TreeNode(new Integer(splitData[i]));
                queue.offer(cur.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));