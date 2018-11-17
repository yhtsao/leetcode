package first;

public class NextClosestTime {
    private int minDiff = Integer.MAX_VALUE;
    private String closestTime = "";
    final int maxTime = 23 * 60 + 59;

    public String nextClosestTime(String time) {
        int[] nums = new int[4];
        nums[0] = Integer.parseInt(time.charAt(0) + "");
        nums[1] = Integer.parseInt(time.charAt(1) + "");
        nums[2] = Integer.parseInt(time.charAt(3) + "");
        nums[3] = Integer.parseInt(time.charAt(4) + "");

        int currTime = (nums[0] * 10 + nums[1]) * 60 + (nums[2] * 10 + nums[3]);
        dfs(currTime, new int[2], 0, nums);

        return closestTime;
    }

    // nextTime = {HH, mm};
    private void dfs(int time, int[] nextTime, int currPos, int[] nums) {
        if (currPos == 2) {
            // compare time
            int timeInMinute = nextTime[0] * 60 + nextTime[1]; // 19:24 = 19 * 60 + 24 = 1164
            int diff = 0;
            if (timeInMinute <= time)
                diff = (maxTime - time) + timeInMinute;
            else diff = timeInMinute - time;

            if (diff < minDiff && diff != 0) {
                minDiff = diff;
                closestTime = String.format("%02d", nextTime[0]) + ":" + String.format("%02d", nextTime[1]);
            }

            return;
        }

        for (int first : nums) {
            for (int second : nums) {
                int num = first * 10 + second;
                if ((currPos == 0 && num < 24) || (currPos == 1 && num < 60)) {
                    nextTime[currPos] = num;
                    dfs(time, nextTime, currPos + 1, nums);
                    nextTime[currPos] = 0;
                }
            }
        }
    }
}
