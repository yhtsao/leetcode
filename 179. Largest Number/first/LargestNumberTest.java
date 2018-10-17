package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestNumberTest {
    private LargestNumber sol = new LargestNumber();

    @Test
    public void test01() {
        int[] nums = new int[]{10, 2};
        String ans = "210";
        String res = sol.largestNumber(nums);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{3, 30, 34, 5, 9};
        String ans = "9534330";
        String res = sol.largestNumber(nums);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{98, 9};
        String ans = "998";
        String res = sol.largestNumber(nums);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test04() {
        int[] nums = new int[]{0, 0, 0};
        String ans = "0";
        String res = sol.largestNumber(nums);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test05() {
        int[] nums = new int[]{98, 997, 9899, 9, 99969};
        String ans = "999969997989998";
        String res = sol.largestNumber(nums);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test06() {
        int[] nums = new int[]{98, 9899, 96, 969};
        String ans = "98999896996";
        String res = sol.largestNumber(nums);
        Assertions.assertTrue(ans.equals(res));
    }
}
