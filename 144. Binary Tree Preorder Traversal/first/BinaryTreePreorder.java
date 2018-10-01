package first;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        //List<Integer> res = new ArrayList<>();
        //preorderTraversalRecur(root, res);
        return preorderTraversalStack(root);
    }

    private void preorderTraversalRecur(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        list.add(root.val);
        preorderTraversalRecur(root.left, list);
        preorderTraversalRecur(root.right, list);
    }

    private List<Integer> preorderTraversalStack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            res.add(tmp.val);
            if (tmp.right != null) stack.add(tmp.right);
            if (tmp.left != null) stack.add(tmp.left);
        }
        return res;
    }
}
