package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayNestingTest {
    ArrayNesting sol = new ArrayNesting();

    @Test
    public void test01() {
        int[] nums = new int[]{5, 4, 0, 3, 1, 6, 2};
        int ans = 4;
        Assertions.assertEquals(ans, sol.arrayNesting(nums));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{0, 2, 1};
        int ans = 2;
        Assertions.assertEquals(ans, sol.arrayNesting(nums));
    }
}
