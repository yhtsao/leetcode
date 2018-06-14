import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minClosest = Integer.MAX_VALUE;
        int minSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum;
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                sum = nums[i] + nums[lo] + nums[hi];
                if (sum == target)
                    return sum;
                if (Math.abs(sum - target) < minClosest) {
                    minClosest = Math.abs(sum - target);
                    minSum = sum;
                }
                if (sum < target)
                    lo++;
                else
                    hi--;

            }
        }
        return minSum;
    }
}
