package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberIITest {
    private SingleNumberII sol = new SingleNumberII();

    @Test
    public void test01() {
        int[] nums = new int[]{2, 2, 3, 2};
        int ans = 3;
        int res = sol.singleNumber(nums);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{0, 1, 0, 1, 0, 1, 99};
        int ans = 99;
        int res = sol.singleNumber(nums);
        Assertions.assertEquals(ans, res);
    }
}
