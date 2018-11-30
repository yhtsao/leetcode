package first;

import java.util.Arrays;

public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int cnt = 0;
        for (int i = nums.length - 1; i > 1; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] < target) {
                    cnt += right - left;
                    left++;
                } else
                    right--;
            }
        }
        return cnt;
    }
}
