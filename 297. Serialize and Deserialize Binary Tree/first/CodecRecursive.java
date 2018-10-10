package first;

import common.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CodecRecursive {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        return serialize(root, new StringBuilder()).toString();
    }

    private StringBuilder serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("X");
            return sb;
        }
        sb.append(root.val).append(",");
        serialize(root.left, sb).append(",");
        serialize(root.right, sb);
        return sb;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) return null;

        String[] splitData = data.split(",");
        Queue<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(splitData));
        return deserialize(nodes);
    }

    private TreeNode deserialize(Queue<String> nodes) {
        if (nodes.isEmpty()) return null;

        String val = nodes.poll();
        if (val.equals("X")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = deserialize(nodes);
        root.right = deserialize(nodes);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));