package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CBTInserterTest {
    @Test
    public void test01() {
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 3, 4, 5, 6});
        CBTInserter inserter = new CBTInserter(root);
        Assertions.assertEquals(3, inserter.insert(7));
        Assertions.assertEquals(4, inserter.insert(8));
        Assertions.assertEquals(4, inserter.insert(9));
        Assertions.assertEquals(5, inserter.insert(10));
        root = inserter.get_root();
        String ans = "[1,2,3,4,5,6,7,8,9,10]";
        Assertions.assertTrue(ans.equals(root.toString()));
    }

    @Test
    public void test02() {
        TreeNode root = TreeNode.initTree(new Integer[]{1});
        CBTInserter inserter = new CBTInserter(root);
        Assertions.assertEquals(1, inserter.insert(2));
        root = inserter.get_root();
        String ans = "[1,2]";
        Assertions.assertTrue(ans.equals(root.toString()));

        Assertions.assertEquals(1, inserter.insert(3));
        root = inserter.get_root();
        ans = "[1,2,3]";
        Assertions.assertTrue(ans.equals(root.toString()));

        Assertions.assertEquals(2, inserter.insert(4));
        root = inserter.get_root();
        ans = "[1,2,3,4]";
        Assertions.assertTrue(ans.equals(root.toString()));
    }
}
