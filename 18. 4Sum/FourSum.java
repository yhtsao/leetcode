import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> sumList = map.get(nums[i] + nums[j]);
                if (sumList == null) {
                    sumList = new ArrayList<>(Arrays.asList(i, j));
                } else {
                    sumList.add(i);
                    sumList.add(j);
                }
                map.put(nums[i] + nums[j], sumList);
            }
        }

        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int sum = target - nums[i] - nums[j];
                List<Integer> result = map.get(sum);
                if (result == null) continue;
                for (int k = 0; k < result.size(); k += 2) {
                    if (result.get(k) <= j) continue;
                    List<Integer> tempList = Arrays.asList(nums[i], nums[j], nums[result.get(k)], nums[result.get(k + 1)]);
                    Collections.sort(tempList);
                    if (!resultList.contains(tempList)) {
                        resultList.add(tempList);
                    }
                }
            }
        }
        return resultList;
    }

    public List<List<Integer>> fourSumSlow(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int lo = j + 1, hi = nums.length - 1;
                int remain = target - nums[i] - nums[j];
                while (lo < hi) {
                    int sum = nums[lo] + nums[hi];
                    if (sum == remain) {
                        List<Integer> result = Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]);
                        if (!resultList.contains(result))
                            resultList.add(result);
                        lo++;
                        hi--;
                    } else if (sum < remain) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return resultList;
    }
}
