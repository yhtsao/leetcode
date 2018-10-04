package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FourSumIITest {
    private FourSumII fourSumII = new FourSumII();

    @Test
    public void test01() {
        int[] A = new int[]{1, 2};
        int[] B = new int[]{-2, -1};
        int[] C = new int[]{-1, 2};
        int[] D = new int[]{0, 2};
        int ans = 2;
        int res = fourSumII.fourSumCount(A, B, C, D);
        Assertions.assertEquals(res, ans);
    }

    @Test
    public void test02() {
        int[] A = new int[]{0, 0};
        int[] B = new int[]{2, 0};
        int[] C = new int[]{-1, -2};
        int[] D = new int[]{0, -1};
        int ans = 4;
        int res = fourSumII.fourSumCount(A, B, C, D);
        Assertions.assertEquals(res, ans);
    }
}