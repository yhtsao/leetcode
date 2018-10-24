package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {
    HappyNumber sol = new HappyNumber();

    @Test
    public void test01() {
        int n = 19;
        Assertions.assertTrue(sol.isHappy(n));
    }

    @Test
    public void test02() {
        int n = 300;
        Assertions.assertFalse(sol.isHappy(n));
    }
}
