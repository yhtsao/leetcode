import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {
    @Test
    public void test01() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = 123;
        int ans = 321;
        Assertions.assertEquals(ans, reverseInteger.reverse(x));
    }

    @Test
    public void test02() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = -123;
        int ans = -321;
        Assertions.assertEquals(ans, reverseInteger.reverse(x));
    }

    @Test
    public void test03() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = 120;
        int ans = 21;
        Assertions.assertEquals(ans, reverseInteger.reverse(x));
    }

    @Test
    public void test04() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = Integer.MAX_VALUE;
        int ans = 0;
        Assertions.assertEquals(ans, reverseInteger.reverse(x));
    }

    @Test
    public void test05() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = Integer.MIN_VALUE;
        int ans = 0;
        Assertions.assertEquals(ans, reverseInteger.reverse(x));
    }

}
