package first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) return nums.length;

        return solutionByHashMap(nums);
    }

    private int solutionByHashMap(int[] nums) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // duplicate case
            if (map.containsKey(nums[i]))
                continue;

            // find left and right boundary
            int left = map.containsKey(nums[i] - 1) ? map.get(nums[i] - 1) : 0;
            int right = map.containsKey(nums[i] + 1) ? map.get(nums[i] + 1) : 0;

            // update new boundary
            map.put(nums[i] - left, left + right + 1);
            map.put(nums[i] + right, left + right + 1);
            map.put(nums[i], left + right + 1);

            max = Math.max(max, left + right + 1);
        }
        return max;
    }

    private int solutionBySorting(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            if (nums[i] == nums[i - 1] + 1) {
                count++;
                continue;
            }
            max = Math.max(max, count);
            count = 1;
        }
        max = Math.max(max, count);
        return max;
    }
}
