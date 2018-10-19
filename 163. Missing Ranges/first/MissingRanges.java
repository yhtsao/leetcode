package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {
    /*
     * @param nums: a sorted integer array
     * @param lower: An integer
     * @param upper: An integer
     * @return: a list of its missing ranges
     */
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ret = new ArrayList<>();
        Arrays.sort(nums);
        int ptr = lower;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < lower || nums[i] > upper) continue;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (ptr == nums[i]) {
                ptr++;
                continue;
            }
            if (ptr != nums[i] - 1)
                ret.add(String.format("%d->%d", ptr, nums[i] - 1));
            else
                ret.add(Integer.toString(ptr));
            ptr = nums[i] + 1;
        }
        if (ptr < upper && (nums.length == 0 || ptr != Integer.MIN_VALUE))
            ret.add(String.format("%d->%d", ptr, upper));
        if (ptr == upper)
            ret.add(Integer.toString(ptr));

        return ret;
    }
}
