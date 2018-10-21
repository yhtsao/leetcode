package first;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        return subsetsBit(nums);
    }

    public List<List<Integer>> subsetsBacktracking(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        backtracking(result, new ArrayList<>(), nums, 0);
        return result;
    }


    private void backtracking(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
        if (start == nums.length) {
            return;
        }

        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            result.add(new ArrayList<>(list));
            backtracking(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }

    private List<List<Integer>> subsetsBit(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        int total = 1 << nums.length;
        for (int i = 0; i < total; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if (((i >> j) & 1) == 1) list.add(nums[j]);
            }
            ret.add(list);
        }
        return ret;
    }
}
