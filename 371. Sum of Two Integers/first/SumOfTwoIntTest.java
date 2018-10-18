package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoIntTest {
    private SumOfTwoInt sol = new SumOfTwoInt();

    @Test
    public void test01() {
        int a = 1;
        int b = 2;
        Assertions.assertEquals(a + b, sol.getSum(a, b));
    }

    @Test
    public void test04() {
        int a = 5;
        int b = 9;
        Assertions.assertEquals(a + b, sol.getSum(a, b));
    }

    @Test
    public void test02() {
        int a = -2;
        int b = 3;
        Assertions.assertEquals(a + b, sol.getSum(a, b));
    }

    @Test
    public void test03() {
        int a = 2;
        int b = -3;
        Assertions.assertEquals(a + b, sol.getSum(a, b));
    }
}
