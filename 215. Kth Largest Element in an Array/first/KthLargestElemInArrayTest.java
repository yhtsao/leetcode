package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestElemInArrayTest {
    private KthLargestElemInArray sol = new KthLargestElemInArray();

    @Test
    public void test01() {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;
        int ans = 5;
        int res = sol.findKthLargest(nums, k);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int ans = 4;
        int res = sol.findKthLargest(nums, k);
        Assertions.assertEquals(ans, res);
    }
}
