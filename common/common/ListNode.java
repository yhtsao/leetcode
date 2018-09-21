package common;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode curr = this;
        while (curr != null) {
            sb.append(curr.val).append("->");
            curr = curr.next;
        }

        return sb.substring(0, sb.length() - 2);
    }

    public boolean equals(ListNode listNode) {
        ListNode current = this;

        while (current != null && listNode != null && current.val == listNode.val) {
            current = current.next;
            listNode = listNode.next;
        }

        return current == null && listNode == null;
    }

    public static ListNode initList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
}
