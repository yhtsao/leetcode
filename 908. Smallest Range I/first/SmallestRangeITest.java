package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestRangeITest {
    private SmallestRangeI smallestRangeI = new SmallestRangeI();

    @Test
    public void test01() {
        int[] A = new int[]{1, 3, 6};
        int K = 3;
        int ans = 0;
        int result = smallestRangeI.smallestRangeI(A, K);
        Assertions.assertEquals(ans, result);
    }
}
