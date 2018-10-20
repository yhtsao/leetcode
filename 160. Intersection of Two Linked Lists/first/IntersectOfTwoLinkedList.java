package first;

import common.ListNode;

public class IntersectOfTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        /*
        Assume that length of A is "a + c", length of B is "b + c"
        After 'A' pointer go (a + c) steps, 'A' pointer points to B
        and go (b) steps, 'A' pointer will meet intersect node
        Same as 'B' pointer go (b + c + a) steps, will meet intersect node
        Two pointer will meet at same time, (a + c + b) = (b + c + a)
         */
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
