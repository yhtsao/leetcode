package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortListTest {
    private SortList sol = new SortList();

    @Test
    public void test01() {
        ListNode head = ListNode.initList(new int[]{4, 2, 1, 3});
        ListNode sortedList = sol.sortList(head);
        while (sortedList.next != null) {
            Assertions.assertTrue(sortedList.val <= sortedList.next.val);
            sortedList = sortedList.next;
        }
    }

    @Test
    public void test02() {
        ListNode head = ListNode.initList(new int[]{-1, 5, 3, 4, 0});
        ListNode sortedList = sol.sortList(head);
        while (sortedList.next != null) {
            Assertions.assertTrue(sortedList.val <= sortedList.next.val);
            sortedList = sortedList.next;
        }
    }

    @Test
    public void test03() {
        ListNode head = ListNode.initList(new int[]{2, 1});
        ListNode sortedList = sol.sortList(head);
        while (sortedList.next != null) {
            Assertions.assertTrue(sortedList.val <= sortedList.next.val);
            sortedList = sortedList.next;
        }
    }

    @Test
    public void test05() {
        ListNode head = ListNode.initList(new int[]{1});
        ListNode sortedList = sol.sortList(head);
        while (sortedList.next != null) {
            Assertions.assertTrue(sortedList.val <= sortedList.next.val);
            sortedList = sortedList.next;
        }
    }

    @Test
    public void test06() {
        ListNode head = ListNode.initList(new int[]{-10, 2});
        ListNode sortedList = sol.sortList(head);
        while (sortedList.next != null) {
            Assertions.assertTrue(sortedList.val <= sortedList.next.val);
            sortedList = sortedList.next;
        }
    }

    @Test
    public void test07() {
        ListNode head = ListNode.initList(new int[]{2, 5, -9, 2, 7, 2, 7});
        ListNode sortedList = sol.sortList(head);
        while (sortedList.next != null) {
            Assertions.assertTrue(sortedList.val <= sortedList.next.val);
            sortedList = sortedList.next;
        }
    }
}
