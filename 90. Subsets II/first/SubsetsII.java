package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        result.add(new ArrayList<>());
        backtracking(result, new ArrayList<>(), nums, 0);
        return result;

    }

    private void backtracking(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
        if (start == nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            result.add(new ArrayList<>(list));
            backtracking(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}

