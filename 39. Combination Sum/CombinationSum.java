import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CombinationSum {
    private List<List<Integer>> resultList = null;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        resultList = new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates, 0, new Stack<>(), target);
        return resultList;
    }

    private void combination(int[] nums, int start, Stack<Integer> stack, int target) {
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == target) {
                stack.push(nums[i]);
                resultList.add(new ArrayList<>(stack));
                stack.pop();
                return;
            } else if (nums[i] < target) {
                stack.push(nums[i]);
                combination(nums, i, stack, target - nums[i]);
                stack.pop();
            } else {
                return;
            }
        }
    }
}
