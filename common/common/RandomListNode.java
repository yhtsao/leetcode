package common;

public class RandomListNode {
    public int label;
    public RandomListNode next, random;

    public RandomListNode(int x) {
        this.label = x;
    }

    public static RandomListNode initList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        RandomListNode head = new RandomListNode(arr[0]);
        RandomListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new RandomListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.label);
        RandomListNode cur = this.next;
        while (cur != null) {
            sb.append(" -> ").append(cur.label);
            cur = cur.next;
        }
        return sb.toString();
    }
}
