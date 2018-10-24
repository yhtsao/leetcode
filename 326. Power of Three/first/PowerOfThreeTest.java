package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfThreeTest {
    PowerOfThree sol = new PowerOfThree();

    @Test
    public void test01() {
        int n = 27;
        Assertions.assertTrue(sol.isPowerOfThree(n));
    }

    @Test
    public void test02() {
        int n = 3;
        Assertions.assertTrue(sol.isPowerOfThree(n));
    }

    @Test
    public void test03() {
        int n = 9;
        Assertions.assertTrue(sol.isPowerOfThree(n));
    }

    @Test
    public void test04() {
        int n = 0;
        Assertions.assertFalse(sol.isPowerOfThree(n));
    }

    @Test
    public void test05() {
        int n = 45;
        Assertions.assertFalse(sol.isPowerOfThree(n));
    }
}
