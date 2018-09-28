package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtTest {
    private Sqrt sqrt = new Sqrt();

    @Test
    public void test01() {
        int x = 4;
        int ans = 2;
        int result = sqrt.mySqrt(x);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        int x = 8;
        int ans = 2;
        int result = sqrt.mySqrt(x);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        int x = Integer.MAX_VALUE;
        int ans = 46340;
        int result = sqrt.mySqrt(x);
        Assertions.assertEquals(ans, result);
    }
}
