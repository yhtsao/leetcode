package first;

import common.TreeNode;
import first.FlattenBSTtoLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlattenBSTtoLinkedListTest {
    FlattenBSTtoLinkedList sol = new FlattenBSTtoLinkedList();

    @Test
    public void test01() {
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 5, 3, 4, null, 6});
        sol.flatten(root);
        String ans = "[1,null,2,null,3,null,4,null,5,null,6]";
        Assertions.assertTrue(ans.equals(root.toString()));
    }
}
