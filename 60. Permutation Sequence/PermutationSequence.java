import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        backtracking(n, k, list);
        StringBuilder sb = new StringBuilder();
        for (Integer num : list)
            sb.append(num);
        return sb.toString();
    }

    private void backtracking(int n, int k, List<Integer> list) {
        if (list.size() == n) return;

        int count = 1;
        int remain = factorial(n - list.size() - 1);
        for (int i = 1; i <= n; i++) {
            if (list.contains(i)) continue;
            if (remain * count < k) {
                count++;
                continue;
            }
            k = k - remain * (count - 1);
            list.add(i);
            backtracking(n, k, list);
            if (list.size() == n) break;
        }
    }

    private int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
