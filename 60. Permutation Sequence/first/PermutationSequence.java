package first;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        // initial number array [1, 2, ..., n]
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            nums.add(i);

        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            int remain = factorial(i);
            int count = (k - 1) / remain;
            k -= count * remain;

            sb.append(nums.get(count));
            nums.remove(count);
        }

        return sb.toString();
    }

    private void backtracking(int n, int k, List<Integer> list) {
        int count = 1;
        int remain = factorial(n - list.size() - 1);
        for (int i = 1; i <= n; i++) {
            if (list.size() == n) break;
            if (list.contains(i)) continue;
            if (remain * count < k) {
                count++;
                continue;
            }
            k = k - remain * (count - 1);
            list.add(i);
            backtracking(n, k, list);
        }
    }

    private int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
