package first;

public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    public int rob(int[] nums, int lo, int hi) {
        int prevRob = 0, prevPrevRob = 0;
        for (int i = lo; i <= hi; i++) {
            int current = Math.max(prevPrevRob + nums[i], prevRob);
            prevPrevRob = prevRob;
            prevRob = current;
        }
        return prevRob;
    }
}
