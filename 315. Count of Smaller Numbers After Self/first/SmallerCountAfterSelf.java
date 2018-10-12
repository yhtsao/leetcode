package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallerCountAfterSelf {

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new int[]{i, nums[i]};
            res.add(0);
        }
        mergesort(pairs, res);
        return res;
    }

    private int[][] mergesort(int[][] nums, List<Integer> smaller) {
        if (nums.length <= 1) return nums;

        int mid = nums.length / 2;
        int[][] left = mergesort(Arrays.copyOfRange(nums, 0, mid), smaller);
        int[][] right = mergesort(Arrays.copyOfRange(nums, mid, nums.length), smaller);

        for (int i = 0, j = 0; i < left.length || j < right.length; ) {
            if (j == right.length || (i < left.length && left[i][1] <= right[j][1])) {
                nums[i + j] = left[i];
                smaller.set(left[i][0], smaller.get(left[i][0]) + j);
                i++;
            } else {
                nums[i + j] = right[j];
                j++;
            }
        }
        return nums;
    }
}
