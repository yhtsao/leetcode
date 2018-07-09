public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val).append(" -> ");
        ListNode nextNode = this.next;
        while (nextNode != null) {
            sb.append(nextNode.val);
            if (nextNode.next != null)
                sb.append(" -> ");
            nextNode = nextNode.next;
        }

        return sb.toString();
    }

    public boolean equals(ListNode listNode) {
        ListNode current = this;

        while (current != null && listNode != null && current.val == listNode.val) {
            current = current.next;
            listNode = listNode.next;
        }

        if (current == null && listNode == null)
            return true;
        return false;
    }
}
