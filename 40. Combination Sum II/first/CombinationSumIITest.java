package first;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CombinationSumIITest {
    @Test
    public void test01() {
        int[] nums = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        CombinationSumII combinationSum = new CombinationSumII();
        List<List<Integer>> resultList = combinationSum.combinationSum2(nums, target);
        for (List<Integer> result : resultList)
            System.out.println(result.toString());
    }

    @Test
    public void test02() {
        int[] nums = new int[]{2, 5, 2, 1, 2};
        int target = 5;
        CombinationSumII combinationSum = new CombinationSumII();
        List<List<Integer>> resultList = combinationSum.combinationSum2(nums, target);
        for (List<Integer> result : resultList)
            System.out.println(result.toString());
    }
}
