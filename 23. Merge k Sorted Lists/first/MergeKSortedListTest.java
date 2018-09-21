package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeKSortedListTest {
    private MergeKSortedList mergeKSortedList = new MergeKSortedList();

    @Test
    public void test01() {
        int[][] arr = new int[][]{
                {1, 4, 5},
                {1, 3, 4},
                {2, 6}
        };
        ListNode[] lists = initListNodes(arr);
        ListNode ans = ListNode.initList(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        ListNode result = mergeKSortedList.mergeKLists(lists);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test02() {
        int[][] arr = new int[][]{
                {3},
                {1, 3},
                {2}
        };
        ListNode[] lists = initListNodes(arr);
        ListNode ans = ListNode.initList(new int[]{1, 2, 3, 3});
        ListNode result = mergeKSortedList.mergeKLists(lists);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test03() {
        int[][] arr = new int[][]{
                {1, 2},
                {3, 4}
        };
        ListNode[] lists = initListNodes(arr);
        ListNode ans = ListNode.initList(new int[]{1, 2, 3, 4});
        ListNode result = mergeKSortedList.mergeKLists(lists);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test04() {
        int[][] arr = new int[][]{
                {3, 4},
                {1, 2}
        };
        ListNode[] lists = initListNodes(arr);
        ListNode ans = ListNode.initList(new int[]{1, 2, 3, 4});
        ListNode result = mergeKSortedList.mergeKLists(lists);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test05() {
        int[][] arr = new int[][]{
                {},
                {-1, 5, 11},
                {},
                {6, 10}
        };
        ListNode[] lists = initListNodes(arr);
        ListNode ans = ListNode.initList(new int[]{-1, 5, 6, 10, 11});
        ListNode result = mergeKSortedList.mergeKLists(lists);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test06() {
        int[][] arr = new int[][]{
                {},
                {}
        };
        ListNode[] lists = initListNodes(arr);
        ListNode result = mergeKSortedList.mergeKLists(lists);
        Assertions.assertNull(result);
    }

    private ListNode[] initListNodes(int[][] arr) {
        ListNode[] lists = new ListNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            lists[i] = ListNode.initList(arr[i]);
        }
        return lists;
    }
}
