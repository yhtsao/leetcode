package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {
    private ReverseLinkedList sol = new ReverseLinkedList();

    @Test
    public void test01() {
        ListNode head = ListNode.initList(new int[]{1, 2, 3, 4, 5});
        ListNode ans = ListNode.initList(new int[]{5, 4, 3, 2, 1});
        ListNode ret = sol.reverseList(head);
        Assertions.assertTrue(ans.equals(ret));
    }
}
