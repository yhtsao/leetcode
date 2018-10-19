package first;

import common.TreeNode;

public class InorderSuccessorInBST {
    /*
     * @param root: The root of the BST.
     * @param p: You need find the successor node of p.
     * @return: Successor of p.
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) return null;
        TreeNode curr = root;
        TreeNode prev = null;
        while (curr != null) {
            if (p.val < curr.val) {
                prev = curr;
                curr = curr.left;
            } else curr = curr.right;
        }
        return prev;
    }
}
