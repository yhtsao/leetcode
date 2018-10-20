package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleIITest {
    private LinkedListCycleII sol = new LinkedListCycleII();

    @Test
    public void test01() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3});
        head.next.next.next = head;
        ListNode ans = head;
        ListNode ret = sol.detectCycle(head);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3});
        ListNode ret = sol.detectCycle(head);
        Assertions.assertNull(ret);
    }

    @Test
    public void test03() {
        ListNode head = ListNode.initList(new int[]{1});
        //head.next = head;
        //ListNode ans = head;
        ListNode ret = sol.detectCycle(head);
        Assertions.assertNull(ret);
    }

}
