import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountAndSayTest {
    private CountAndSay countAndSay = new CountAndSay();

    @Test
    public void test01() {
        int n = 2;
        Assertions.assertEquals("11", countAndSay.countAndSay(n));
    }

    @Test
    public void test02() {
        int n = 3;
        Assertions.assertEquals("21", countAndSay.countAndSay(n));
    }

    @Test
    public void test03() {
        int n = 4;
        Assertions.assertEquals("1211", countAndSay.countAndSay(n));
    }

    @Test
    public void test04() {
        int n = 5;
        Assertions.assertEquals("111221", countAndSay.countAndSay(n));
    }

    @Test
    public void test05() {
        int n = 6;
        Assertions.assertEquals("312211", countAndSay.countAndSay(n));
    }

    @Test
    public void test06() {
        int n = 7;
        Assertions.assertEquals("13112221", countAndSay.countAndSay(n));
    }

}
