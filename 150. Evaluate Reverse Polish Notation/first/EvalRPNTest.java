package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvalRPNTest {
    private EvalRPN sol = new EvalRPN();

    @Test
    public void test01() {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        int ans = 9;
        int ret = sol.evalRPN(tokens);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        String[] tokens = new String[]{"4", "13", "5", "/", "+"};
        int ans = 6;
        int ret = sol.evalRPN(tokens);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        String[] tokens = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int ans = 22;
        int ret = sol.evalRPN(tokens);
        Assertions.assertEquals(ans, ret);
    }
}
