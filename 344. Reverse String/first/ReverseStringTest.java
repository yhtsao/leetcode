package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    private ReverseString sol = new ReverseString();

    @Test
    public void test01() {
        String s = "hello";
        String ans = "olleh";
        String res = sol.reverseString(s);
        Assertions.assertTrue(ans.equals(res));
    }

}
