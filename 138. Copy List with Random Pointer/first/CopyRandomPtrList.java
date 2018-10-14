package first;

import common.RandomListNode;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomPtrList {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        RandomListNode cur = head;
        // Create all copy nodes
        // original:    1 -> 2 -> 3 -> 4
        // after:       1 -> 1 -> 2 -> 2 -> 3 -> 3 -> 4 -> 4
        while (cur != null) {
            RandomListNode next = new RandomListNode(cur.label);
            next.next = cur.next;
            cur.next = next;
            cur = cur.next.next;
        }

        // Set random pointer
        cur = head;
        while (cur != null) {
            if (cur.random != null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }

        // Seperate original and copyed list
        RandomListNode newHead = head.next;
        RandomListNode newCur = newHead;
        cur = head;
        while (newCur.next != null) {
            cur.next = cur.next.next;
            newCur.next = newCur.next.next;
            cur = cur.next;
            newCur = newCur.next;
        }
        cur.next = null;
        return newHead;
    }

    // time: O(n), space: O(n)
    public RandomListNode copyRandomListHash(RandomListNode head) {
        if (head == null) return null;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode root = new RandomListNode(head.label);
        RandomListNode cur = root;
        map.put(head, root);
        while (head != null) {
            if (head.next != null) {
                if (!map.containsKey(head.next)) {
                    cur.next = new RandomListNode(head.next.label);
                    map.put(head.next, cur.next);
                } else
                    cur.next = map.get(head.next);
            }

            if (head.random != null) {
                if (!map.containsKey(head.random)) {
                    cur.random = new RandomListNode(head.random.label);
                    map.put(head.random, cur.random);
                } else
                    cur.random = map.get(head.random);
            }
            head = head.next;
            cur = cur.next;
        }
        return root;
    }
}
