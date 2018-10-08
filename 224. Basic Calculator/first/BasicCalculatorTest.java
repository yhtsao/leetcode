package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicCalculatorTest {
    private BasicCalculator sol = new BasicCalculator();

    @Test
    public void test01() {
        String s = "1 + 1";
        int ans = 2;
        int res = sol.calculate(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String s = " 2-1 + 2 ";
        int ans = 3;
        int res = sol.calculate(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int ans = 23;
        int res = sol.calculate(s);
        Assertions.assertEquals(ans, res);
    }
}
