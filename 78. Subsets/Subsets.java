import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
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
}
