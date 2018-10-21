package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPeakElementTest {
    FindPeakElement sol = new FindPeakElement();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 2, 3, 1};
        int ans = 2;
        int ret = sol.findPeakElement(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        int ans = 5;
        int ret = sol.findPeakElement(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{5, 1};
        int ans = 0;
        int ret = sol.findPeakElement(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test05() {
        int[] nums = new int[]{1, 2};
        int ans = 1;
        int ret = sol.findPeakElement(nums);
        Assertions.assertEquals(ans, ret);
    }
}
