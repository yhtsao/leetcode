package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TopKFrequentElemTest {
    TopKFrequentElem sol = new TopKFrequentElem();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> ans = Arrays.asList(1, 2);
        Assertions.assertTrue(ans.equals(sol.topKFrequent(nums, k)));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{1};
        int k = 1;
        List<Integer> ans = Arrays.asList(1);
        Assertions.assertTrue(ans.equals(sol.topKFrequent(nums, k)));
    }
}
