package first;

import common.RandomListNode;
import org.junit.jupiter.api.Test;

public class CopyRandomPtrListTest {
    private CopyRandomPtrList sol = new CopyRandomPtrList();

    @Test
    public void test01() {
        RandomListNode root = RandomListNode.initList(new int[]{1, 2, 3, 4});
        RandomListNode cur = root;
        RandomListNode[] arrs = new RandomListNode[4];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = cur;
            cur = cur.next;
        }
        arrs[0].random = arrs[2];
        arrs[1].random = arrs[3];
        arrs[3].random = arrs[0];
        System.out.println(root.toString());
        RandomListNode newNode = sol.copyRandomList(root);
        System.out.println(newNode.toString());
    }
}
