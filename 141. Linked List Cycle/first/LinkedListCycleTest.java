package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {
    private LinkedListCycle sol = new LinkedListCycle();

    @Test
    public void test01() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3});
        head.next.next.next = head;
        boolean ans = true;
        boolean ret = sol.hasCycle(head);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        ListNode head = ListNode.initList(new int[]{1});
        head.next = head;
        boolean ans = true;
        boolean ret = sol.hasCycle(head);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3, 4});
        head.next.next.next = head.next;
        boolean ans = true;
        boolean ret = sol.hasCycle(head);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test05() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3, 4});
        head.next.next = head.next;
        boolean ans = true;
        boolean ret = sol.hasCycle(head);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test06() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3});
        //head.next.next = head.next;
        boolean ans = false;
        boolean ret = sol.hasCycle(head);
        Assertions.assertEquals(ans, ret);
    }
}
