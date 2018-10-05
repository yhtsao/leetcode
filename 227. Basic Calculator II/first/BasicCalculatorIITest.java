package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicCalculatorIITest {
    private BasicCalculatorII calculator = new BasicCalculatorII();

    @Test
    public void test01() {
        String s = "3+2*2";
        int ans = 7;
        int res = calculator.calculate(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String s = " 3/2 ";
        int ans = 1;
        int res = calculator.calculate(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String s = " 3+5 / 2 ";
        int ans = 5;
        int res = calculator.calculate(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        String s = " 3 * 5/2 ";
        int ans = 7;
        int res = calculator.calculate(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        String s = " 1+2 -17   +99";
        int ans = 85;
        int res = calculator.calculate(s);
        Assertions.assertEquals(ans, res);
    }
}
