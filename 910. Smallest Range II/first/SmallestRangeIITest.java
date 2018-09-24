package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestRangeIITest {
    private SmallestRangeII smallestRangeII = new SmallestRangeII();

    @Test
    public void test01() {
        int[] A = new int[]{7, 8, 8, 5, 2};
        int K = 4;
        int ans = 5;
        int result = smallestRangeII.smallestRangeII(A, K);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        int[] A = new int[]{7, 8, 8};
        int K = 4;
        int ans = 1;
        int result = smallestRangeII.smallestRangeII(A, K);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        int[] A = new int[]{1, 3, 6};
        int K = 3;
        int ans = 3;
        int result = smallestRangeII.smallestRangeII(A, K);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test04() {
        int[] A = new int[]{1, 3};
        int K = 3;
        int ans = 2;
        int result = smallestRangeII.smallestRangeII(A, K);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test05() {
        int[] A = new int[]{2, 7, 2};
        int K = 1;
        int ans = 3;
        int result = smallestRangeII.smallestRangeII(A, K);

        Assertions.assertEquals(ans, result);
    }
}
