package first;

import java.util.HashMap;

public class LRUCache {
    class DbLinkedNode {
        int key;
        int val;
        DbLinkedNode prev;
        DbLinkedNode next;

        DbLinkedNode(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            DbLinkedNode tmp = this;
            while (tmp != null) {
                sb.append(tmp.key + ", ");
                tmp = tmp.next;
            }
            return sb.toString();
        }
    }

    private DbLinkedNode head, tail;
    private HashMap<Integer, DbLinkedNode> map;
    int maxCapacity;
    int elems;

    public LRUCache(int capacity) {
        this.maxCapacity = capacity;
        this.elems = 0;
        this.map = new HashMap<>();
        this.head = new DbLinkedNode(-1, -1);
        this.tail = new DbLinkedNode(-1, -1);
        this.head.next = tail;
        this.tail.prev = head;
    }

    public int get(int key) {
        DbLinkedNode node = map.get(key);
        if (node == null) return -1;
        updatePriority(node);
        return node.val;
    }

    /**
     * If cache is full, remove element from tail of linked list
     */
    public void put(int key, int value) {
        DbLinkedNode node = map.get(key);
        if (node != null) {
            node.val = value;
            updatePriority(node);
            return;
        }
        if (elems == maxCapacity) {
            removeElems();
        }

        addElems(key, value);
    }

    /**
     * Move node to head of linked list
     */
    private void updatePriority(DbLinkedNode node) {
        DbLinkedNode prevNode = node.prev;
        DbLinkedNode nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        node.next = head.next;
        head.next.prev = node;

        node.prev = head;
        head.next = node;
    }

    /**
     * Add element to head of linked list
     */
    private void addElems(int key, int value) {
        DbLinkedNode node = new DbLinkedNode(key, value);

        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;

        map.put(key, node);
        elems++;
    }

    /**
     * Remove elements from tail of linked list
     */
    private void removeElems() {
        DbLinkedNode lastElem = tail.prev;
        map.remove(lastElem.key);
        lastElem.prev.next = tail;
        tail.prev = lastElem.prev;
        elems--;
    }
}