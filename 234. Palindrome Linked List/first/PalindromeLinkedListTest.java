package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {
    private PalindromeLinkedList sol = new PalindromeLinkedList();

    @Test
    public void test01() {
        ListNode head = ListNode.initList(new int[]{1, 2});
        Assertions.assertFalse(sol.isPalindrome(head));
    }

    @Test
    public void test02() {
        ListNode head = ListNode.initList(new int[]{1, 2, 2, 1});
        Assertions.assertTrue(sol.isPalindrome(head));
    }

    @Test
    public void test03() {
        ListNode head = ListNode.initList(new int[]{1, 2, 1});
        Assertions.assertTrue(sol.isPalindrome(head));
    }

    @Test
    public void test04() {
        ListNode head = ListNode.initList(new int[]{1});
        Assertions.assertTrue(sol.isPalindrome(head));
    }
}
