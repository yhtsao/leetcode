package first;

import common.TreeNode;

public class FlattenBSTtoLinkedList {
    public void flatten(TreeNode root) {
        flattenIterate(root);
    }

    public void flattenSol1(TreeNode root) {
        flat(root);
    }

    private TreeNode flat(TreeNode root) {
        if (root == null) return null;
        TreeNode left = flat(root.left);
        TreeNode right = flat(root.right);
        if (left == null)
            root.right = right;
        else {
            root.right = left;
            while (left.right != null) {
                left = left.right;
            }
            left.right = right;
        }
        root.left = null;
        return root;
    }

    public TreeNode flattenSol2(TreeNode root, TreeNode prev) {
        if (root == null) return prev;
        prev = flattenSol2(root.right, prev);
        prev = flattenSol2(root.left, prev);
        root.right = prev;
        root.left = null;
        return root;
    }

    public void flattenIterate(TreeNode root) {
        if (root == null) return;
        while (root != null) {
            if (root.left == null) {
                root = root.right;
                continue;
            }
            TreeNode left = root.left;
            while (left.right != null)
                left = left.right;

            left.right = root.right;
            root.right = root.left;
            root.left = null;
            root = root.right;
        }
    }
}
