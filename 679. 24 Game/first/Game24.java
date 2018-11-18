package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game24 {
    final Double precision = 0.0001;

    public boolean judgePoint24(int[] nums) {
        List<Double> arr = new ArrayList<>();
        for (int num : nums) arr.add((double) num);
        return dfs(arr);
    }

    private boolean dfs(List<Double> arr) {
        if (arr.size() == 1) {
            if (Math.abs(arr.get(0) - 24) < precision) return true;
            return false;
        }
        boolean ret = false;
        // Generate all possible permutation
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                double p1 = arr.get(i), p2 = arr.get(j);
                List<Double> next = Arrays.asList(p1 + p2, p1 - p2, p2 - p1, p1 * p2,
                        p1 / p2, p2 / p1);

                arr.remove(i);
                arr.remove(j);
                for (Double n : next) {
                    arr.add(n);
                    ret |= dfs(arr);
                    if (ret) return ret;
                    arr.remove(arr.size() - 1);
                }
                arr.add(j, p2);
                arr.add(i, p1);
            }
        }
        return ret;
    }
}
