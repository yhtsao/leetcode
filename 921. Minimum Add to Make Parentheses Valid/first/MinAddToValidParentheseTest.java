package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinAddToValidParentheseTest {
    private MinAddToValidParenthese sol = new MinAddToValidParenthese();

    @Test
    public void test02() {
        String S = "())";
        int ans = 1;
        int res = sol.minAddToMakeValid(S);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String S = "(((";
        int ans = 3;
        int res = sol.minAddToMakeValid(S);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        String S = "()";
        int ans = 0;
        int res = sol.minAddToMakeValid(S);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        String S = "()))((";
        int ans = 4;
        int res = sol.minAddToMakeValid(S);
        Assertions.assertEquals(ans, res);
    }
}
