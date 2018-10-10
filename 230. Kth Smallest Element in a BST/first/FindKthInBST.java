package first;

import common.TreeNode;

import java.util.Stack;

public class FindKthInBST {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if (--k == 0) return cur.val;
                cur = cur.right;
            }
        }
        return 0;
    }
}
