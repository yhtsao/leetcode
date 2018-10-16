package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrobogrammaticNumberTest {
    private StrobogrammaticNumber sol = new StrobogrammaticNumber();

    @Test
    public void test01() {
        String num = "69";
        Assertions.assertTrue(sol.isStrobogrammatic(num));
    }

    @Test
    public void test02() {
        String num = "1";
        Assertions.assertTrue(sol.isStrobogrammatic(num));
    }

    @Test
    public void test03() {
        String num = "808";
        Assertions.assertTrue(sol.isStrobogrammatic(num));
    }

    @Test
    public void test04() {
        String num = "68";
        Assertions.assertFalse(sol.isStrobogrammatic(num));
    }
}
