import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        backtracking(resultList, new ArrayList<>(), nums, new boolean[nums.length]);
        return resultList;
    }

    private void backtracking(List<List<Integer>> resultList,
                              List<Integer> list, int[] nums, boolean[] used) {
        if (list.size() == nums.length) {
            resultList.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            list.add(nums[i]);
            backtracking(resultList, list, nums, used);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
