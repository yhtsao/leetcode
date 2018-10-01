package first;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        //List<Integer> res = new ArrayList<>();
        //postorderTraversalRecur(root, res);
        return postorderTraversalStack(root);
    }

    private void postorderTraversalRecur(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        postorderTraversalRecur(root.left, list);
        postorderTraversalRecur(root.right, list);
        list.add(root.val);
    }

    private List<Integer> postorderTraversalStack(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            res.add(0, tmp.val);
            if (tmp.left != null) stack.add(tmp.left);
            if (tmp.right != null) stack.add(tmp.right);
        }
        return res;
    }
}
