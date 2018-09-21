package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThreeSumClosestTest {
    @Test
    public void test01() {
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;

        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int closest = threeSumClosest.threeSumClosest(nums, target);
        Assertions.assertEquals(2, closest);
    }
}