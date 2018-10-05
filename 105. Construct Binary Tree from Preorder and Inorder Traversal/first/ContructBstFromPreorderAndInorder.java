package first;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ContructBstFromPreorderAndInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) inMap.put(inorder[i], i);
        return recur(preorder, 0, 0, inorder.length - 1, inMap);
    }

    private TreeNode recur(int[] preorder, int preStart,
                           int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (inStart > inEnd || preStart >= preorder.length) return null;
        if (inStart == inEnd) return new TreeNode(preorder[preStart]);

        TreeNode root = new TreeNode(preorder[preStart]);
        int indexOfRoot = inMap.get(preorder[preStart]);
        int numNodeOnLeftSubtree = indexOfRoot - inStart;
        root.left = recur(preorder, preStart + 1, inStart, indexOfRoot - 1, inMap);
        root.right = recur(preorder, preStart + numNodeOnLeftSubtree + 1,
                indexOfRoot + 1, inEnd, inMap);

        return root;
    }
}
