package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindKPairsWithSmallestSumTest {
    FindKPairsWithSmallestSum sol = new FindKPairsWithSmallestSum();

    @Test
    public void test01() {
        int[] nums1 = new int[]{1, 7, 11};
        int[] nums2 = new int[]{2, 4, 6};
        int k = 3;
        List<int[]> ans = Arrays.asList(
                new int[]{1, 2},
                new int[]{1, 4},
                new int[]{1, 6},
                new int[]{7, 2},
                new int[]{7, 4},
                new int[]{11, 2},
                new int[]{7, 6},
                new int[]{11, 4},
                new int[]{11, 6}
        );
        List<int[]> ret = sol.kSmallestPairs(nums1, nums2, k);
        for (int i = 0; i < k; i++)
            Assertions.assertTrue(Arrays.equals(ans.get(i), ret.get(i)));
    }

    @Test
    public void test02() {
        int[] nums1 = new int[]{1, 1, 2};
        int[] nums2 = new int[]{1, 2, 3};
        int k = 2;
        List<int[]> ans = Arrays.asList(new int[]{1, 1},
                new int[]{1, 1},
                new int[]{1, 2},
                new int[]{2, 1},
                new int[]{1, 2},
                new int[]{2, 2},
                new int[]{1, 3},
                new int[]{1, 3},
                new int[]{2, 3}
        );
        List<int[]> ret = sol.kSmallestPairs(nums1, nums2, k);
        for (int i = 0; i < k; i++)
            Assertions.assertTrue(Arrays.equals(ans.get(i), ret.get(i)));
    }

    @Test
    public void test03() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3};
        int k = 3;
        List<int[]> ans = Arrays.asList(
                new int[]{1, 3},
                new int[]{2, 3}
        );
        List<int[]> ret = sol.kSmallestPairs(nums1, nums2, k);
        for (int i = 0; i < k && i < ans.size(); i++)
            Assertions.assertTrue(Arrays.equals(ans.get(i), ret.get(i)));
    }
}
