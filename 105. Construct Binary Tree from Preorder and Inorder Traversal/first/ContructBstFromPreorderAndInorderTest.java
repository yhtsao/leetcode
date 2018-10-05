package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContructBstFromPreorderAndInorderTest {
    private ContructBstFromPreorderAndInorder sol = new ContructBstFromPreorderAndInorder();
    private BinaryTreeInorder inorderTraversal = new BinaryTreeInorder();
    private BinaryTreePreorder preorderTraversal = new BinaryTreePreorder();

    @Test
    public void test01() {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};

        String ans = "[3,9,20,null,null,15,7]";
        TreeNode res = sol.buildTree(preorder, inorder);
        Assertions.assertTrue(ans.equals(res.toString()));
    }

    @Test
    public void test02() {
        TreeNode ans = TreeNode.initTree(new Integer[]{3, 9, 20, 15, null, 7});
        int[] preorder = preorderTraversal.preorderTraversal(ans).stream().mapToInt(i -> i).toArray();
        ;
        int[] inorder = inorderTraversal.inorderTraversal(ans).stream().mapToInt(i -> i).toArray();
        ;

        TreeNode res = sol.buildTree(preorder, inorder);
        Assertions.assertTrue(ans.toString().equals(res.toString()));
    }

    @Test
    public void test03() {
        TreeNode ans = TreeNode.initTree(new Integer[]{3, 9, 20, null, 15, 7});
        int[] preorder = preorderTraversal.preorderTraversal(ans).stream().mapToInt(i -> i).toArray();
        ;
        int[] inorder = inorderTraversal.inorderTraversal(ans).stream().mapToInt(i -> i).toArray();
        ;

        TreeNode res = sol.buildTree(preorder, inorder);
        Assertions.assertTrue(ans.toString().equals(res.toString()));
    }

    @Test
    public void test04() {
        TreeNode ans = TreeNode.initTree(new Integer[]{3, 9, 20, 15, 7});
        int[] preorder = preorderTraversal.preorderTraversal(ans).stream().mapToInt(i -> i).toArray();
        ;
        int[] inorder = inorderTraversal.inorderTraversal(ans).stream().mapToInt(i -> i).toArray();
        ;

        TreeNode res = sol.buildTree(preorder, inorder);
        Assertions.assertTrue(ans.toString().equals(res.toString()));
    }

    @Test
    public void test05() {
        TreeNode ans = TreeNode.initTree(new Integer[]{3, 9, 20, null, 15, null, 7});
        int[] preorder = preorderTraversal.preorderTraversal(ans).stream().mapToInt(i -> i).toArray();
        ;
        int[] inorder = inorderTraversal.inorderTraversal(ans).stream().mapToInt(i -> i).toArray();
        ;

        TreeNode res = sol.buildTree(preorder, inorder);
        Assertions.assertTrue(ans.toString().equals(res.toString()));
    }
}
