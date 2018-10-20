package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectOfTwoLinkedListTest {
    private IntersectOfTwoLinkedList sol = new IntersectOfTwoLinkedList();

    @Test
    public void test01() {
        ListNode headA = ListNode.initList(new int[]{1, 2, 3, 4});
        ListNode headB = ListNode.initList(new int[]{9});
        ListNode intersec = ListNode.initList(new int[]{5, 6, 7});
        addTail(headA, intersec);
        addTail(headB, intersec);
        ListNode ans = sol.getIntersectionNode(headA, headB);
        Assertions.assertEquals(ans, intersec);
    }

    @Test
    public void test02() {
        ListNode headA = ListNode.initList(new int[]{1});
        ListNode headB = ListNode.initList(new int[]{9});
        ListNode intersec = ListNode.initList(new int[]{5, 6, 7});
        addTail(headA, intersec);
        addTail(headB, intersec);
        ListNode ans = sol.getIntersectionNode(headA, headB);
        Assertions.assertEquals(ans, intersec);
    }

    @Test
    public void test03() {
        ListNode headA = null;
        ListNode headB = ListNode.initList(new int[]{9});
        ListNode intersec = ListNode.initList(new int[]{5, 6, 7});
        //addTail(headA, intersec);
        addTail(headB, intersec);
        ListNode ans = sol.getIntersectionNode(headA, headB);
        Assertions.assertNull(ans);
    }

    @Test
    public void test04() {
        ListNode headA = ListNode.initList(new int[]{1, 2, 3, 4});
        ListNode headB = ListNode.initList(new int[]{8, 9});
        //ListNode intersec = ListNode.initList(new int[]{5, 6, 7});
        //addTail(headA, intersec);
        //addTail(headB, intersec);
        ListNode ans = sol.getIntersectionNode(headA, headB);
        Assertions.assertNull(ans);
    }

    private void addTail(ListNode head, ListNode tail) {
        ListNode curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = tail;
    }
}
