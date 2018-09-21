package first;

import common.ListNode;

public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        //return mergeKListsInsert(lists);
        return mergeKListsRecur(lists, 0, lists.length - 1);
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

    public ListNode mergeKListsRecur(ListNode[] lists, int lo, int hi) {
        if (lo == hi)
            return lists[lo];
        ListNode result = null;
        if (lo < hi) {
            int mid = (hi - lo) / 2;
            ListNode a = mergeKListsRecur(lists, lo, lo + mid);
            ListNode b = mergeKListsRecur(lists, lo + mid + 1, hi);
            result = mergeTwoList(new ListNode(0), a, b);
        }
        return result;
    }

    public ListNode mergeTwoList(ListNode head, ListNode a, ListNode b) {
        if (a == null || b == null) {
            head.next = (a == null) ? b : a;
            return head.next;
        }
        if (a.val < b.val) {
            head.next = a;
            mergeTwoList(head.next, a.next, b);
        } else {
            head.next = b;
            mergeTwoList(head.next, a, b.next);
        }
        return head.next;
    }
}
