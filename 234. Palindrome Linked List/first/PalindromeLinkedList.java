package first;

import common.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Find middle node of list
        ListNode middle = findMiddle(head);

        // Reverse right half part of list
        middle = reverse(middle);

        // Compare left and right part
        while (head != null && middle != null) {
            if (head.val != middle.val) return false;
            head = head.next;
            middle = middle.next;
        }
        return true;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode reverseHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = reverseHead;
            reverseHead = head;
            head = tmp;
        }
        return reverseHead;
    }
}
