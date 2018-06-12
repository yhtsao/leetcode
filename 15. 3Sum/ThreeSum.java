import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    ans.add(list);
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    right--;

                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    left++;

                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return ans;
    }
}
