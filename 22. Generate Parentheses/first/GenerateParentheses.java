package first;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        if (n == 0) return results;
        recursiveGen(results, "", n, 0, 0);
        return results;
    }

    private void recursiveGen(List<String> results, String s, int n, int lt, int rt) {
        if (lt + rt == n * 2) {
            results.add(s);
            return;
        }
        if (lt < n)
            recursiveGen(results, s + "(", n, lt + 1, rt);

        if (rt < lt)
            recursiveGen(results, s + ")", n, lt, rt + 1);
    }
}
