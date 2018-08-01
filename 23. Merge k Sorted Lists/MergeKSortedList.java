public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKListsInsert(lists);
    }

    /**
     * Merge lists by insertion
     */
    public ListNode mergeKListsInsert(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode head = new ListNode(Integer.MIN_VALUE);
        head.next = lists[0];
        ListNode curr;

        for (int i = 1; i < lists.length; i++) {
            curr = head;
            ListNode tmp = lists[i];
            while (tmp != null) {
                while (tmp.val < curr.val ||
                        (curr.next != null && tmp.val >= curr.next.val)) {
                    curr = curr.next;
                }
                ListNode tmpNext = curr.next;
                curr.next = tmp;
                tmp = tmp.next;
                curr = curr.next;
                curr.next = tmpNext;
            }
        }

        return head.next;
    }
}
