package first;

import common.ListNode;
import org.junit.jupiter.api.Test;

public class DeleteNodeInLinkedListTest {
    private DeleteNodeInLinkedList sol = new DeleteNodeInLinkedList();

    @Test
    public void test01() {
        int[] nums = new int[]{4, 5, 1, 9};
        ListNode head = ListNode.initList(nums);
        ListNode toBeDeleted = head.next;
        sol.deleteNode(toBeDeleted);
        System.out.println(head.toString());
    }

    @Test
    public void test02() {
        int[] nums = new int[]{4, 5, 1, 9};
        ListNode head = ListNode.initList(nums);
        ListNode toBeDeleted = head.next.next;
        sol.deleteNode(toBeDeleted);
        System.out.println(head.toString());
    }
}
