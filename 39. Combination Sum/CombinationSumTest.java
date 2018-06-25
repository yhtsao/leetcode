import org.junit.jupiter.api.Test;

import java.util.List;

class CombinationSumTest {
    @Test
    public void test01() {
        int[] nums = new int[]{2, 3, 6, 7};
        int target = 7;
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> resultList = combinationSum.combinationSum(nums, target);
        for (List<Integer> result : resultList)
            System.out.println(result.toString());
    }

    @Test
    public void test02() {
        int[] nums = new int[]{2, 3, 5};
        int target = 8;
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> resultList = combinationSum.combinationSum(nums, target);
        for (List<Integer> result : resultList)
            System.out.println(result.toString());
    }

    @Test
    public void test03() {
        int[] nums = new int[]{8, 7, 4, 3};
        int target = 11;
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> resultList = combinationSum.combinationSum(nums, target);
        for (List<Integer> result : resultList)
            System.out.println(result.toString());
    }
}