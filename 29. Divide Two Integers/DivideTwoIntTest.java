import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideTwoIntTest {
    private DivideTwoInt divideTwoInt = new DivideTwoInt();

    @Test
    public void test01() {
        int n = 10;
        int d = 3;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));
    }

    @Test
    public void test02() {
        int n = 7;
        int d = -3;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));

        n = -7;
        d = 3;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));

        n = -7;
        d = -3;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));
    }

    @Test
    public void test03() {
        int n = 0;
        int d = 3;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));
    }

    @Test
    public void test04() {
        int n = 4;
        int d = 2;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));

        n = 2;
        d = 1;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));
    }

    @Test
    public void test05() {
        int n = Integer.MAX_VALUE;
        int d = 3;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));

        d = 2;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));

        d = 1;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));

        d = -1;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));

        d = Integer.MIN_VALUE;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));
    }

    @Test
    public void test06() {
        int n = Integer.MIN_VALUE;
        int d = 3;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));

        d = -2;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));

        d = -1;
        Assertions.assertEquals(Integer.MAX_VALUE, divideTwoInt.divide(n, d));

        d = n;
        Assertions.assertEquals(n / d, divideTwoInt.divide(n, d));
    }
}
