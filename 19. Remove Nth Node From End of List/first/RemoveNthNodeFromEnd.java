package first;

import common.ListNode;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode nth = start, curr = start;
        nth.next = head;

        for (int i = 0; i <= n; i++)
            curr = curr.next;

        while (curr != null) {
            nth = nth.next;
            curr = curr.next;
        }
        nth.next = nth.next.next;

        return start.next;
    }
}
