package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SingleNumberIIITest {
    private SingleNumberIII sol = new SingleNumberIII();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        int[] ans = new int[]{3, 5};
        int[] res = sol.singleNumber(nums);
        Arrays.sort(res);
        Assertions.assertTrue(Arrays.equals(ans, res));
    }
}
