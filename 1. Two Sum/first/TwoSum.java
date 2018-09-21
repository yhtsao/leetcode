package first;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer other = map.get(target - nums[i]);
            if (other != null) {
                ans = new int[]{other, i};
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
