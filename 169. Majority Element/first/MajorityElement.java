package first;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        return majorityElementSmart(nums);
    }

    private int majorityElementHash(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) >= (nums.length + 1) / 2) return num;
        }
        return 0;
    }

    // Boyer-Moore Majority Vote Algorithm
    private int majorityElementSmart(int[] nums) {
        int major = nums[0], cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (cnt == 0) {
                major = nums[i];
                cnt++;
            } else if (major == nums[i])
                cnt++;
            else
                cnt--;
        }
        return major;
    }
}
