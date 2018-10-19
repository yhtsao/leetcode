package first;

import common.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode reverse = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = reverse;
            reverse = head;
            head = next;
        }
        return reverse;
    }
}
