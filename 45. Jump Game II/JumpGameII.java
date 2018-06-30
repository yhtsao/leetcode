public class JumpGameII {
    public int jump(int[] nums) {
        int last = 0, maxIndex = -1, step = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > last) {
                step++;
                last = maxIndex;
            }
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }

        return step;
    }
}
