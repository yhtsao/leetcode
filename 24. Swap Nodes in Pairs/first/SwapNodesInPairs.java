package first;

import common.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode curr = newHead;
        while (curr.next != null && curr.next.next != null) {
            ListNode p1 = curr.next;
            ListNode p2 = p1.next;
            p1.next = p2.next;
            p2.next = p1;
            curr.next = p2;
            curr = p1;
        }
        return newHead.next;
    }
}
