package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiddleOfLinkedListTest {
    private MiddleOfLinkedList sol = new MiddleOfLinkedList();

    @Test
    public void test01() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3, 4, 5});
        ListNode ans = head.next.next;
        ListNode ret = sol.middleNode(head);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode ans = head.next.next.next;
        ListNode ret = sol.middleNode(head);
        Assertions.assertEquals(ans, ret);
    }
}
