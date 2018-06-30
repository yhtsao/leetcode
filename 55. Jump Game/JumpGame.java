public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxIndex >= nums.length - 1) return true;
            if (maxIndex < i) return false;
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }
        return false;
    }
}
