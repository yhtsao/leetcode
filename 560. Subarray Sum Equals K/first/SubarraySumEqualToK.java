package first;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualToK {
    public int subarraySum(int[] nums, int k) {
        // hashmap is to record presum and frequency of the presum
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                cnt += map.get(sum - k);
            if (sum == k) cnt++;
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}
