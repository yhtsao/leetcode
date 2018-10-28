package first;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    // Key idea: (a + n * x) % x = a % x
    // for example: given array nums, k = 6
    // nums = [23, 2, 4, 6, 7],
    // sum =  [23, 25, 29, 35, 42], sum[i] == nums[0] + ... + nums[i]
    // sum % 6 = [5, 1, 5, 5, 0]
    // where index 0 and 3 are both 5,
    // that means there exist a subarray whick sum is multiple of 6
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) sum %= k;
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                if (i - prevIndex > 1) return true;
            } else map.put(sum, i);
        }
        return false;
    }
}
