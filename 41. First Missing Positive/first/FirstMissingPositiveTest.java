package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstMissingPositiveTest {
    @Test
    public void test01() {
        int[] nums = new int[]{1, 2, 0};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        int first = firstMissingPositive.firstMissingPositive(nums);
        Assertions.assertEquals(3, first);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{3, 4, -1, 1};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        int first = firstMissingPositive.firstMissingPositive(nums);
        Assertions.assertEquals(2, first);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{7, 8, 9, 11, 12};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        int first = firstMissingPositive.firstMissingPositive(nums);
        Assertions.assertEquals(1, first);
    }

    @Test
    public void test04() {
        int[] nums = new int[]{2, 3, 1};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        int first = firstMissingPositive.firstMissingPositive(nums);
        Assertions.assertEquals(4, first);
    }

    @Test
    public void test05() {
        int[] nums = new int[]{1, 1};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        int first = firstMissingPositive.firstMissingPositive(nums);
        Assertions.assertEquals(2, first);
    }

    @Test
    public void test06() {
        int[] nums = new int[]{};
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        int first = firstMissingPositive.firstMissingPositive(nums);
        Assertions.assertEquals(1, first);
    }
}
