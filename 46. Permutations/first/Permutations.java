package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        return permuteBacktracking(nums);
    }

    /**
     * Using insertion to generate all permutation
     */
    public List<List<Integer>> permuteInsert(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length == 0) return lists;

        List<Integer> list = Arrays.asList(nums[0]);
        lists.add(list);
        for (int i = 1; i < nums.length; i++) {
            list = lists.get(0);
            while (list.size() <= i) {
                for (int j = 0; j <= list.size(); j++) {
                    List<Integer> temp = new ArrayList<>(list);
                    temp.add(j, nums[i]);
                    lists.add(temp);
                }
                lists.remove(0);
                list = lists.get(0);
            }
        }
        return lists;
    }

    /**
     * Using backtracking to generate all permutation
     */
    public List<List<Integer>> permuteBacktracking(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        backtracking(lists, new ArrayList<>(), nums);
        return lists;
    }

    private void backtracking(List<List<Integer>> lists, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) continue;
            list.add(nums[i]);
            backtracking(lists, list, nums);
            list.remove(list.size() - 1);
        }
    }
}
