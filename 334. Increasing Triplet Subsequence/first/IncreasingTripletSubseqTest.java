package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncreasingTripletSubseqTest {
    private IncreasingTripletSubseq sol = new IncreasingTripletSubseq();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        boolean ans = true;
        boolean ret = sol.increasingTriplet(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{5, 4, 3, 2, 1};
        boolean ans = false;
        boolean ret = sol.increasingTriplet(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{2, 5, 7, 2, 3, 1};
        boolean ans = true;
        boolean ret = sol.increasingTriplet(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test04() {
        int[] nums = new int[]{2, 5, 7, 2, 3, 1};
        boolean ans = true;
        boolean ret = sol.increasingTriplet(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test05() {
        int[] nums = new int[]{14, 2, 5, 1, 8, 1};
        boolean ans = true;
        boolean ret = sol.increasingTriplet(nums);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test06() {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1};
        boolean ans = false;
        boolean ret = sol.increasingTriplet(nums);
        Assertions.assertEquals(ans, ret);
    }
}
