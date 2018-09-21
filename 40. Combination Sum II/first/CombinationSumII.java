package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CombinationSumII {
    private List<List<Integer>> resultList = null;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        resultList = new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates, 0, new Stack<>(), target);
        return resultList;
    }

    private void combination(int[] nums, int start, Stack<Integer> stack, int target) {
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == target) {
                stack.push(nums[i]);
                List<Integer> result = new ArrayList<>(stack);
                if (!resultList.contains(result))
                    resultList.add(result);
                stack.pop();
                return;
            } else if (nums[i] < target) {
                stack.push(nums[i]);
                combination(nums, i + 1, stack, target - nums[i]);
                stack.pop();
            } else {
                return;
            }
        }
    }
}
