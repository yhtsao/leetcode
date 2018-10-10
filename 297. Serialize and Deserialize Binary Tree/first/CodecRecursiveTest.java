package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodecRecursiveTest {
    @Test
    public void test01() {
        CodecRecursive codec = new CodecRecursive();
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 3, null, null, 4, 5});
        String res = codec.serialize(root);
        System.out.println(res);

        TreeNode des = codec.deserialize(res);
        res = des.toString();
        Assertions.assertTrue(root.toString().equals(res));
    }

    @Test
    public void test02() {
        CodecRecursive codec = new CodecRecursive();
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, null, null, 3, null, 4, 5});
        String res = codec.serialize(root);
        System.out.println(res);

        TreeNode des = codec.deserialize(res);
        res = des.toString();
        Assertions.assertTrue(root.toString().equals(res));
    }

    @Test
    public void test04() {
        CodecRecursive codec = new CodecRecursive();
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 3, 4, null, 5, null});
        String res = codec.serialize(root);
        System.out.println(res);

        TreeNode des = codec.deserialize(res);
        res = des.toString();
        Assertions.assertTrue(root.toString().equals(res));
    }
}
