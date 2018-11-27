package first;

public class MyHashMap {
    class ListNode {
        ListNode next;
        int key, val;

        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    ListNode[] listnodes;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        listnodes = new ListNode[10000];
        for (int i = 0; i < listnodes.length; i++)
            listnodes[i] = new ListNode(-1, -1);
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int index = getIndex(key);
        ListNode head = listnodes[index];
        ListNode curr = getNode(head, key);
        if (curr != null) {
            curr.val = value;
        } else {
            curr = new ListNode(key, value);
            curr.next = head.next;
            head.next = curr;
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int index = getIndex(key);
        ListNode curr = listnodes[index];
        curr = getNode(curr, key);
        return curr == null ? -1 : curr.val;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        if (get(key) < 0) return;
        ListNode head = listnodes[getIndex(key)];
        while (head.next != null && head.next.key != key)
            head = head.next;
        if (head.next != null)
            head.next = head.next.next;
    }

    // get the node that contains key, otherwise return last node
    private ListNode getNode(ListNode head, int key) {
        while (head != null && head.key != key)
            head = head.next;
        return head;
    }

    private int getIndex(int key) {
        return Integer.hashCode(key) % 10000;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
