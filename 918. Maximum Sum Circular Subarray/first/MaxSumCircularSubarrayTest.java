package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSumCircularSubarrayTest {
    private MaxSumCircularSubarray sol = new MaxSumCircularSubarray();

    @Test
    public void test05() {
        int[] A = new int[]{1, -2, 3, -2};
        int ans = 3;
        int res = sol.maxSubarraySumCircular(A);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test06() {
        int[] A = new int[]{5, -3, 5};
        int ans = 10;
        int res = sol.maxSubarraySumCircular(A);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test07() {
        int[] A = new int[]{3, -1, 2, -1};
        int ans = 4;
        int res = sol.maxSubarraySumCircular(A);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test08() {
        int[] A = new int[]{3, -2, 2, -3};
        int ans = 3;
        int res = sol.maxSubarraySumCircular(A);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test09() {
        int[] A = new int[]{-2, -3, -1};
        int ans = -1;
        int res = sol.maxSubarraySumCircular(A);
        Assertions.assertEquals(ans, res);
    }
}
