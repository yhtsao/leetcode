package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class StrobogrammaticNumberIIITest {
    private StrobogrammaticNumberIII sol = new StrobogrammaticNumberIII();
    private StrobogrammaticNumberIIIAns strobogrammaticNumberIIIAns = new StrobogrammaticNumberIIIAns();

    @Test
    public void test01() {
        String low = "50";
        String high = "100";
        int ans = 3;
        int res = sol.strobogrammaticInRange(low, high);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String low = "11";
        String high = "100";
        int ans = 4;
        int res = sol.strobogrammaticInRange(low, high);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String low = "11";
        String high = "55667";
        int ans = strobogrammaticNumberIIIAns.strobogrammaticInRange(low, high);
        int res = sol.strobogrammaticInRange(low, high);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            Long low = Math.abs(rand.nextLong() % 10000);
            Long high = low + Math.abs(rand.nextLong() % 10000);
            String lowStr = Long.toString(low), highStr = Long.toString(high);
            int ans = strobogrammaticNumberIIIAns.strobogrammaticInRange(lowStr, highStr);
            int res = sol.strobogrammaticInRange(lowStr, highStr);
            Assertions.assertEquals(ans, res);
        }
    }
}
