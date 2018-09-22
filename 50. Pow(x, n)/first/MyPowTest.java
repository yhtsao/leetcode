package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyPowTest {
    private MyPow myPow = new MyPow();

    @Test
    public void test01() {
        double x = 2.00000;
        int n = 10;
        double ans = 1024.00000;
        double res = myPow.myPow(x, n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        double x = 2.10000;
        int n = 3;
        double ans = 9.26100;
        double res = myPow.myPow(x, n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        double x = 2.00000;
        int n = -2;
        double ans = 0.25000;
        double res = myPow.myPow(x, n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        double x = 2.00000;
        int n = Integer.MIN_VALUE;
        double ans = 0;
        double res = myPow.myPow(x, n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        double x = -1.00000;
        int n = Integer.MIN_VALUE;
        double ans = 1.0;
        double res = myPow.myPow(x, n);
        Assertions.assertEquals(ans, res);
    }
}
