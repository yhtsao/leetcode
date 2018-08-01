import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListTest {
    @Test
    public void test01() {
        ListNode a = ListNode.initList(new int[]{1, 2, 4});
        ListNode b = ListNode.initList(new int[]{1, 3, 4});
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode ans = ListNode.initList(new int[]{1, 1, 2, 3, 4, 4});
        Assertions.assertTrue(ans.equals(mergeTwoSortedList.mergeTwoLists(a, b)));
    }

    @Test
    public void test02() {
        ListNode a = ListNode.initList(new int[]{1});
        ListNode b = ListNode.initList(new int[]{2, 3, 6});
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode ans = ListNode.initList(new int[]{1, 2, 3, 6});
        Assertions.assertTrue(ans.equals(mergeTwoSortedList.mergeTwoLists(a, b)));
    }

    @Test
    public void test03() {
        ListNode b = ListNode.initList(new int[]{2, 3, 6});
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode ans = ListNode.initList(new int[]{2, 3, 6});
        Assertions.assertTrue(ans.equals(mergeTwoSortedList.mergeTwoLists(null, b)));
    }

    @Test
    public void test04() {
        ListNode a = ListNode.initList(new int[]{1});
        ListNode b = ListNode.initList(new int[]{3});
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode ans = ListNode.initList(new int[]{1, 3});
        Assertions.assertTrue(ans.equals(mergeTwoSortedList.mergeTwoLists(a, b)));
    }
}
