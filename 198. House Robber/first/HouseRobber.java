package first;

public class HouseRobber {
    public int rob(int[] nums) {
        int prevRob = 0, prevPrevRob = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = Math.max(prevPrevRob + nums[i], prevRob);
            prevPrevRob = prevRob;
            prevRob = current;
        }
        return prevRob;
    }

    private int robDP(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] money = new int[nums.length];
        money[0] = nums[0];
        money[1] = Math.max(money[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            money[i] = Math.max(money[i - 1], money[i - 2] + nums[i]);
        }

        return money[nums.length - 1];
    }
}
