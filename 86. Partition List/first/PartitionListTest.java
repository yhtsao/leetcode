package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionListTest {
    private PartitionList partitionList = new PartitionList();

    @Test
    public void test01() {
        int[] arr = new int[]{1, 4, 3, 2, 5, 2};
        int[] ansArr = new int[]{1, 2, 2, 4, 3, 5};
        ListNode head = ListNode.initList(arr);
        ListNode ans = ListNode.initList(ansArr);
        int x = 3;
        ListNode result = partitionList.partition(head, x);
        Assertions.assertTrue(ans.equals(result));

        x = 4;
        head = ListNode.initList(arr);
        ans = ListNode.initList(new int[]{1, 3, 2, 2, 4, 5});
        result = partitionList.partition(head, x);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test02() {
        int[] arr = new int[]{4, 3, 2, 5, 2};
        int[] ansArr = new int[]{2, 2, 4, 3, 5};
        ListNode head = ListNode.initList(arr);
        ListNode ans = ListNode.initList(ansArr);
        int x = 3;
        ListNode result = partitionList.partition(head, x);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test03() {
        int[] arr = new int[]{2, 2, 4, 3, 5};
        int[] ansArr = new int[]{2, 2, 4, 3, 5};
        ListNode head = ListNode.initList(arr);
        ListNode ans = ListNode.initList(ansArr);
        int x = 3;
        ListNode result = partitionList.partition(head, x);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test04() {
        int[] arr = new int[]{2, 1};
        int[] ansArr = new int[]{2, 1};
        ListNode head = ListNode.initList(arr);
        ListNode ans = ListNode.initList(ansArr);
        int x = 3;
        ListNode result = partitionList.partition(head, x);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test05() {
        int[] arr = new int[]{4, 3, 5};
        int[] ansArr = new int[]{4, 3, 5};
        ListNode head = ListNode.initList(arr);
        ListNode ans = ListNode.initList(ansArr);
        int x = 3;
        ListNode result = partitionList.partition(head, x);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test06() {
        int[] arr = new int[]{};
        ListNode head = ListNode.initList(arr);
        int x = 3;
        ListNode result = partitionList.partition(head, x);
        Assertions.assertNull(result);
    }

    @Test
    public void test07() {
        int[] arr = new int[]{1};
        int[] ansArr = new int[]{1};
        ListNode head = ListNode.initList(arr);
        ListNode ans = ListNode.initList(ansArr);
        int x = 3;
        ListNode result = partitionList.partition(head, x);
        Assertions.assertTrue(ans.equals(result));
    }
}
