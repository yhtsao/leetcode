package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwapAdjacentInLRStrTest {
    SwapAdjacentInLRStr sol = new SwapAdjacentInLRStr();

    @Test
    public void test01() {
        String start = "RXXLRXRXL";
        String end = "XRLXXRRLX";
        Assertions.assertTrue(sol.canTransform(start, end));
    }

    @Test
    public void test02() {
        String start = "RXLRXL";
        String end = "RLRLXX";
        Assertions.assertFalse(sol.canTransform(start, end));
    }
}
