import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndTest {
    @Test
    public void test01() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode head = initListNode(arr);
        ListNode ans;

        RemoveNthNodeFromEnd remove = new RemoveNthNodeFromEnd();
        ans = initListNode(new int[]{1, 2, 3, 4});
        Assertions.assertTrue(ans.equals(remove.removeNthFromEnd(head, 1)));

        head = initListNode(arr);
        ans = initListNode(new int[]{1, 2, 3, 5});
        Assertions.assertTrue(ans.equals(remove.removeNthFromEnd(head, 2)));

        head = initListNode(arr);
        ans = initListNode(new int[]{1, 2, 4, 5});
        Assertions.assertTrue(ans.equals(remove.removeNthFromEnd(head, 3)));

        head = initListNode(arr);
        ans = initListNode(new int[]{1, 3, 4, 5});
        Assertions.assertTrue(ans.equals(remove.removeNthFromEnd(head, 4)));

        head = initListNode(arr);
        ans = initListNode(new int[]{2, 3, 4, 5});
        Assertions.assertTrue(ans.equals(remove.removeNthFromEnd(head, 5)));
    }

    @Test
    public void test02() {
        int[] arr = new int[]{1};
        ListNode head = initListNode(arr);

        RemoveNthNodeFromEnd remove = new RemoveNthNodeFromEnd();
        Assertions.assertNull(remove.removeNthFromEnd(head, 1));
    }

    private ListNode initListNode(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }
}
