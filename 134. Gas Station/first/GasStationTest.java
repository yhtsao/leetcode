package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GasStationTest {
    private GasStation sol = new GasStation();

    @Test
    public void test01() {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        int ans = 3;
        int ret = sol.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int[] gas = new int[]{2, 3, 4};
        int[] cost = new int[]{3, 4, 3};
        int ans = -1;
        int ret = sol.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        int[] gas = new int[]{1, 2, 4, 1, 8};
        int[] cost = new int[]{3, 4, 3, 3, 2};
        int ans = 4;
        int ret = sol.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test04() {
        int[] gas = new int[]{6, 1, 3, 2, 1};
        int[] cost = new int[]{2, 5, 2, 1, 3};
        int ans = 0;
        int ret = sol.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test05() {
        int[] gas = new int[]{6};
        int[] cost = new int[]{2};
        int ans = 0;
        int ret = sol.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test06() {
        int[] gas = new int[]{2};
        int[] cost = new int[]{6};
        int ans = -1;
        int ret = sol.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test07() {
        int[] gas = new int[]{6, 2};
        int[] cost = new int[]{2, 6};
        int ans = 0;
        int ret = sol.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test08() {
        int[] gas = new int[]{2, 6};
        int[] cost = new int[]{6, 2};
        int ans = 1;
        int ret = sol.canCompleteCircuit(gas, cost);
        Assertions.assertEquals(ans, ret);
    }
}
