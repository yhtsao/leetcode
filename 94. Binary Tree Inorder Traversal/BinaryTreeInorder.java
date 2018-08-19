import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursion(root, result);
        return result;
    }

    private void recursion(TreeNode curr, List<Integer> result) {
        if (curr == null)
            return;
        recursion(curr.left, result);
        result.add(curr.val);
        recursion(curr.right, result);
    }
}
