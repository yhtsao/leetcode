package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheDuplicateNumTest {
    FindTheDuplicateNum sol = new FindTheDuplicateNum();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 3, 4, 2, 2};
        int ans = 2;
        int ret = sol.findDuplicate(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{2, 2, 2, 2, 2};
        int ans = 2;
        int ret = sol.findDuplicate(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{3, 1, 3, 4, 2};
        int ans = 3;
        int ret = sol.findDuplicate(nums);
        Assertions.assertEquals(ans, ret);
    }
}
