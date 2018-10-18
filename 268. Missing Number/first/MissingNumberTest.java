package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {
    private MissingNumber sol = new MissingNumber();

    @Test
    public void test01() {
        int[] nums = new int[]{3, 0, 1};
        int ans = 2;
        int res = sol.missingNumber(nums);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        int ans = 8;
        int res = sol.missingNumber(nums);
        Assertions.assertEquals(ans, res);
    }
}
