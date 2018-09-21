package first;

import common.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        int val = 0;
        ListNode current = head;

        while (l1 != null || l2 != null) {
            int sum = 0;

            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }

            current.val = (sum + val) % 10;
            val = (sum + val) / 10;

            if (l1 != null || l2 != null || val != 0)
                current.next = new ListNode(val);
            current = current.next;
        }

        return head;
    }
}
