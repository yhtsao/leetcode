package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestConsecutiveSeqTest {
    private LongestConsecutiveSeq longestConsecutiveSeq = new LongestConsecutiveSeq();

    @Test
    public void test01() {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        int ans = 4;
        int result = longestConsecutiveSeq.longestConsecutive(nums);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{};
        int ans = 0;
        int result = longestConsecutiveSeq.longestConsecutive(nums);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{1};
        int ans = 1;
        int result = longestConsecutiveSeq.longestConsecutive(nums);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test04() {
        int[] nums = new int[]{2, 1};
        int ans = 2;
        int result = longestConsecutiveSeq.longestConsecutive(nums);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test05() {
        int[] nums = new int[]{1, 100};
        int ans = 1;
        int result = longestConsecutiveSeq.longestConsecutive(nums);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test06() {
        int[] nums = new int[]{1, 2, 0, 1};
        int ans = 3;
        int result = longestConsecutiveSeq.longestConsecutive(nums);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test07() {
        int[] nums = new int[]{4, 0, -4, -2, 2, 5, 2, 0, -8, -8, -8, -8, -1, 7, 4, 5, 5, -4, 6, 6, -3};
        int ans = 5;
        int result = longestConsecutiveSeq.longestConsecutive(nums);
        Assertions.assertEquals(ans, result);
    }
}
