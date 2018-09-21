package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndTest {
    @Test
    public void test01() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode head = ListNode.initList(arr);
        ListNode ans;

        RemoveNthNodeFromEnd remove = new RemoveNthNodeFromEnd();
        ans = ListNode.initList(new int[]{1, 2, 3, 4});
        Assertions.assertTrue(ans.equals(remove.removeNthFromEnd(head, 1)));

        head = ListNode.initList(arr);
        ans = ListNode.initList(new int[]{1, 2, 3, 5});
        Assertions.assertTrue(ans.equals(remove.removeNthFromEnd(head, 2)));

        head = ListNode.initList(arr);
        ans = ListNode.initList(new int[]{1, 2, 4, 5});
        Assertions.assertTrue(ans.equals(remove.removeNthFromEnd(head, 3)));

        head = ListNode.initList(arr);
        ans = ListNode.initList(new int[]{1, 3, 4, 5});
        Assertions.assertTrue(ans.equals(remove.removeNthFromEnd(head, 4)));

        head = ListNode.initList(arr);
        ans = ListNode.initList(new int[]{2, 3, 4, 5});
        Assertions.assertTrue(ans.equals(remove.removeNthFromEnd(head, 5)));
    }

    @Test
    public void test02() {
        int[] arr = new int[]{1};
        ListNode head = ListNode.initList(arr);

        RemoveNthNodeFromEnd remove = new RemoveNthNodeFromEnd();
        Assertions.assertNull(remove.removeNthFromEnd(head, 1));
    }
}
