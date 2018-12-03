package first;

import common.ListNode;

import java.util.Stack;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        ListNode head = null;
        ListNode curr = null;
        int val = 0;
        while (!s1.isEmpty() || !s2.isEmpty() || val != 0) {
            if (!s1.isEmpty()) val += s1.pop();
            if (!s2.isEmpty()) val += s2.pop();

            head = new ListNode(val % 10);
            if (curr != null)
                head.next = curr;
            curr = head;
            val /= 10;
        }

        return head;
    }
}
