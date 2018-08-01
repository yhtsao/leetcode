public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode tmpHead = new ListNode(Integer.MIN_VALUE);
        tmpHead.next = head;
        ListNode curr = tmpHead, last = tmpHead;
        while (curr != null) {
            if (curr.next != null && curr.next.val < x) {
                if (curr == last) {
                    curr = curr.next;
                    last = last.next;
                    continue;
                }
                ListNode tmp = last.next;
                last.next = curr.next;
                last = last.next;
                curr.next = last.next;
                last.next = tmp;
            } else curr = curr.next;
        }
        return tmpHead.next;
    }
}
