package first;

import common.TreeLinkNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PopulateNextRightPtrTest {
    private PopulateNextRightPtr sol = new PopulateNextRightPtr();

    @Test
    public void test01() {
        TreeLinkNode root = TreeLinkNode.initTree(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        sol.connect(root);
        Assertions.assertEquals(3, root.left.next.val);
        Assertions.assertEquals(5, root.left.left.next.val);
        Assertions.assertEquals(6, root.left.right.next.val);
        Assertions.assertEquals(7, root.right.left.next.val);
    }
}
