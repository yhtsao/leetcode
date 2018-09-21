package first;

import common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {
    @Test
    public void test01() {
        int a = 342, b = 465;

        ListNode aNode = initList(a);
        System.out.println(aNode.toString());

        ListNode bNode = initList(b);
        System.out.println(bNode.toString());

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(aNode, bNode);
        ListNode ans = initList(a + b);
        Assertions.assertTrue(ans.equals(result));

    }

    @Test
    public void test02() {
        int b = 34259, a = 465;

        ListNode aNode = initList(a);
        System.out.println(aNode.toString());

        ListNode bNode = initList(b);
        System.out.println(bNode.toString());

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(aNode, bNode);
        ListNode ans = initList(a + b);
        Assertions.assertTrue(ans.equals(result));

    }

    @Test
    public void test03() {
        int b = 5, a = 5;

        ListNode aNode = initList(a);
        System.out.println(aNode.toString());

        ListNode bNode = initList(b);
        System.out.println(bNode.toString());

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(aNode, bNode);
        ListNode ans = initList(a + b);
        Assertions.assertTrue(ans.equals(result));

    }

    private ListNode initList(int n) {
        ListNode parent = new ListNode(n % 10);
        ListNode currentNode = parent;
        n = n / 10;
        while (n > 0) {
            currentNode.next = new ListNode(n % 10);
            currentNode = currentNode.next;
            n = n / 10;
        }
        return parent;
    }
}
