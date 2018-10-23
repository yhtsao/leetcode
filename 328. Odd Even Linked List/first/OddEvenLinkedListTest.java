package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenLinkedListTest {
    OddEvenLinkedList sol = new OddEvenLinkedList();

    @Test
    public void test01() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3, 4, 5});
        head = sol.oddEvenList(head);
        ListNode ans = ListNode.initList(new int[]{1, 3, 5, 2, 4});
        Assertions.assertTrue(ans.equals(head));
    }

    @Test
    public void test02() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3, 4, 5, 6});
        head = sol.oddEvenList(head);
        ListNode ans = ListNode.initList(new int[]{1, 3, 5, 2, 4, 6});
        Assertions.assertTrue(ans.equals(head));
    }
}
