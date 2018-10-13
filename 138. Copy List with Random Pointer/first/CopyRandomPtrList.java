package first;

import common.RandomListNode;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomPtrList {
    public RandomListNode copyRandomList(RandomListNode head) {
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
