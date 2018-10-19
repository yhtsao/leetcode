package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MissingRangesTest {
    private MissingRanges sol = new MissingRanges();

    @Test
    public void test01() {
        int[] nums = new int[]{0, 1, 3, 50, 75};
        int lower = 0, upper = 99;
        List<String> ans = Arrays.asList("2", "4->49", "51->74", "76->99");
        List<String> ret = sol.findMissingRanges(nums, lower, upper);
        Assertions.assertTrue(ans.equals(ret));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{1};
        int lower = 0, upper = 1;
        List<String> ans = Arrays.asList("0");
        List<String> ret = sol.findMissingRanges(nums, lower, upper);
        Assertions.assertTrue(ans.equals(ret));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{3, 15, 30};
        int lower = 1, upper = 20;
        List<String> ans = Arrays.asList("1->2", "4->14", "16->20");
        List<String> ret = sol.findMissingRanges(nums, lower, upper);
        Assertions.assertTrue(ans.equals(ret));
    }

    @Test
    public void test04() {
        int[] nums = new int[]{3, 15, 30};
        int lower = 6, upper = 20;
        List<String> ans = Arrays.asList("6->14", "16->20");
        List<String> ret = sol.findMissingRanges(nums, lower, upper);
        Assertions.assertTrue(ans.equals(ret));
    }

    @Test
    public void test05() {
        int[] nums = new int[]{3, 4, 6, 7};
        int lower = 3, upper = 8;
        List<String> ans = Arrays.asList("5", "8");
        List<String> ret = sol.findMissingRanges(nums, lower, upper);
        Assertions.assertTrue(ans.equals(ret));
    }

    @Test
    public void test06() {
        int[] nums = new int[]{0, Integer.MAX_VALUE};
        int lower = 0, upper = Integer.MAX_VALUE;
        List<String> ans = Arrays.asList("1->2147483646");
        List<String> ret = sol.findMissingRanges(nums, lower, upper);
        Assertions.assertTrue(ans.equals(ret));
    }

    @Test
    public void test07() {
        int[] nums = new int[]{0, Integer.MAX_VALUE - 1};
        int lower = 0, upper = Integer.MAX_VALUE;
        List<String> ans = Arrays.asList("1->2147483645", "2147483647");
        List<String> ret = sol.findMissingRanges(nums, lower, upper);
        Assertions.assertTrue(ans.equals(ret));
    }
}
