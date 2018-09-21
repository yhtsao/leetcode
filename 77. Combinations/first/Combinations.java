package first;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        backtracking(n, k, 1, new ArrayList<>(), results);
        return results;
    }

    private void backtracking(int n, int k, int start, List<Integer> list,
                              List<List<Integer>> results) {
        if (k == 0) {
            results.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= n - k + 1; i++) {
            list.add(i);
            backtracking(n, k - 1, i + 1, list, results);
            list.remove(list.size() - 1);
        }
    }

}
