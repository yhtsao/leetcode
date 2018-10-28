package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySubarraysWithSumTest {
    BinarySubarraysWithSum sol = new BinarySubarraysWithSum();

    @Test
    public void test01() {
        int[] A = new int[]{1, 0, 1, 0, 1};
        int S = 2;
        int ans = 4;
        Assertions.assertEquals(ans, sol.numSubarraysWithSum(A, S));
    }

    @Test
    public void test02() {
        int[] A = new int[]{0, 0, 0};
        int S = 0;
        int ans = 6;
        Assertions.assertEquals(ans, sol.numSubarraysWithSum(A, S));
    }

    @Test
    public void test03() {
        int[] A = new int[]{0, 1, 0, 1, 0};
        int S = 2;
        int ans = 4;
        Assertions.assertEquals(ans, sol.numSubarraysWithSum(A, S));

        S = 1;
        ans = 8;
        Assertions.assertEquals(ans, sol.numSubarraysWithSum(A, S));
    }

    @Test
    public void test04() {
        int[] A = new int[]{0, 1, 0};
        int S = 2;
        int ans = 0;
        Assertions.assertEquals(ans, sol.numSubarraysWithSum(A, S));
    }
}
