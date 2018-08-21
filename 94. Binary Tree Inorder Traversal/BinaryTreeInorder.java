import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        //recursion(root, result);

        result = stack(root);
        return result;
    }

    private void recursion(TreeNode curr, List<Integer> result) {
        if (curr == null)
            return;
        recursion(curr.left, result);
        result.add(curr.val);
        recursion(curr.right, result);
    }

    private List<Integer> stack(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.peek();
            stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
    }
}
