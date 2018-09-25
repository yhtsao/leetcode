package first;

public class JumpGameII {
    public int jump(int[] nums) {
        return jumpByBFS(nums);
    }

    private int jumpByBFS(int[] nums) {
        if (nums.length < 2 || nums[0] == 0) return 0;

        int i = 0, maxIndex = 0, level = 0;

        while (i <= maxIndex) {
            level++;
            int nextMaxIndex = maxIndex;
            for (; i <= maxIndex; i++) {
                nextMaxIndex = Math.max(nextMaxIndex, nums[i] + i);
                if (nextMaxIndex >= nums.length - 1) return level;
            }
            maxIndex = Math.max(maxIndex, nextMaxIndex);
        }
        return 0;
    }

    private int jumpByGreedy(int[] nums) {
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
