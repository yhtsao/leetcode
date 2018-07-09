public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        int val = 0;
        ListNode current = head;

        while (l1 != null && l2 != null) {
            current.val = (l1.val + l2.val + val) % 10;
            val = (l1.val + l2.val + val) / 10;

            l1 = l1.next;
            l2 = l2.next;
            if (l1 != null || l2 != null || val != 0)
                current.next = new ListNode(val);
            current = current.next;
        }

        if (l2 != null) l1 = l2;
        while (l1 != null) {
            current.val = (l1.val + val) % 10;
            val = (l1.val + val) / 10;
            l1 = l1.next;
            if (l1 != null || val != 0)
                current.next = new ListNode(val);
            current = current.next;
        }

        return head;
    }
}
