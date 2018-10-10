package first;

import common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodecTest {

    @Test
    public void test01() {
        Codec codec = new Codec();
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 3, null, null, 4, 5});
        String ans = "1,2,3,X,X,4,5,X,X,X,X,";
        String res = codec.serialize(root);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));

        TreeNode des = codec.deserialize(res);
        res = des.toString();
        Assertions.assertTrue(root.toString().equals(res));
    }

    @Test
    public void test02() {
        Codec codec = new Codec();
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, null, null, 3, null, 4, 5});
        String ans = "1,2,X,X,3,X,4,5,X,X,X,";
        String res = codec.serialize(root);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));

        TreeNode des = codec.deserialize(res);
        res = des.toString();
        Assertions.assertTrue(root.toString().equals(res));
    }

    @Test
    public void test03() {
        Codec codec = new Codec();
        TreeNode root = TreeNode.initTree(new Integer[]{1, null, 2});
        String ans = "1,X,2,X,X,";
        String res = codec.serialize(root);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));

        TreeNode des = codec.deserialize(res);
        res = des.toString();
        Assertions.assertTrue(root.toString().equals(res));
    }

    @Test
    public void test04() {
        Codec codec = new Codec();
        TreeNode root = TreeNode.initTree(new Integer[]{1, 2, 3, 4, null, 5, null});
        String ans = "1,2,3,4,X,5,X,X,X,X,X,";
        String res = codec.serialize(root);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));

        TreeNode des = codec.deserialize(res);
        res = des.toString();
        Assertions.assertTrue(root.toString().equals(res));
    }
}
