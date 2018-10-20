package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestIncreasingSubseqTest {
    private LongestIncreasingSubseq sol = new LongestIncreasingSubseq();

    @Test
    public void test01() {
        int[] nums = new int[]{2, 5, 7, 2, 4, 5, 10};
        int ans = 4;
        int ret = sol.lengthOfLIS(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{2, 5, 7, 2, 3, 1};
        int ans = 3;
        int ret = sol.lengthOfLIS(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{2, 5, 7, 2, 3, 1};
        int ans = 3;
        int ret = sol.lengthOfLIS(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test05() {
        int[] nums = new int[]{14, 2, 5, 1, 8, 1};
        int ans = 3;
        int ret = sol.lengthOfLIS(nums);
        Assertions.assertEquals(ans, ret);
    }
}
