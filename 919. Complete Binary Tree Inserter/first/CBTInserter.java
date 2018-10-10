package first;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CBTInserter {
    TreeNode root;
    Queue<TreeNode> queue;

    public CBTInserter(TreeNode root) {
        this.root = root;
        this.queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.peek();
            if (tmp.left != null && tmp.right != null) {
                queue.offer(tmp.left);
                queue.offer(tmp.right);
                queue.poll();
            } else break;
        }
    }

    public int insert(int v) {
        TreeNode parent = queue.peek();
        if (parent.left == null) {
            parent.left = new TreeNode(v);
        } else {
            parent.right = new TreeNode(v);
            queue.offer(parent.left);
            queue.offer(parent.right);
            queue.poll();
        }
        return parent.val;
    }

    public TreeNode get_root() {
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */
