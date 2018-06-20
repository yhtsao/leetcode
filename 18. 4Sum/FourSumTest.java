import org.junit.jupiter.api.Test;

import java.util.List;

class FourSumTest {
    @Test
    public void test01() {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;

        FourSum fourSum = new FourSum();
        List<List<Integer>> resultList = fourSum.fourSum(nums, target);
        for (List<Integer> result : resultList) {
            System.out.println(result.toString());
        }
    }
}