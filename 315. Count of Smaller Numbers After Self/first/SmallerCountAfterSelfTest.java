package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallerCountAfterSelfTest {
    private SmallerCountAfterSelf sol = new SmallerCountAfterSelf();

    @Test
    public void test01() {
        int[] nums = new int[]{5, 2, 6, 1};
        List<Integer> ans = Arrays.asList(2, 1, 1, 0);
        List<Integer> res = sol.countSmaller(nums);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{5};
        List<Integer> ans = Arrays.asList(0);
        List<Integer> res = sol.countSmaller(nums);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test03() {
        int[] nums = new int[0];
        List<Integer> ans = new ArrayList<>();
        List<Integer> res = sol.countSmaller(nums);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test04() {
        int[] nums = new int[]{5, 2, 6, 1, 3};
        List<Integer> ans = Arrays.asList(3, 1, 2, 0, 0);
        List<Integer> res = sol.countSmaller(nums);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test05() {
        int[] nums = new int[]{-1, -1};
        List<Integer> ans = Arrays.asList(0, 0);
        List<Integer> res = sol.countSmaller(nums);
        Assertions.assertTrue(ans.equals(res));
    }
}
