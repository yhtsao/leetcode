package first;

import common.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        recursive(root);
        return root;
    }

    private void recursive(TreeNode curr) {
        if (curr == null)
            return;
        recursive(curr.left);
        recursive(curr.right);
        TreeNode tmp = curr.left;
        curr.left = curr.right;
        curr.right = tmp;
    }
}
