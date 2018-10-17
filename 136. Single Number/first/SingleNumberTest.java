package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {
    private SingleNumber sol = new SingleNumber();

    @Test
    public void test01() {
        int[] nums = new int[]{2, 2, 1};
        int ans = 1;
        int res = sol.singleNumber(nums);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        int ans = 4;
        int res = sol.singleNumber(nums);
        Assertions.assertEquals(ans, res);
    }
}
