package first;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        List<String> ret = new ArrayList<>();
        dfs(num, target, 0, new StringBuilder(), 0, 0, ret);
        return ret;
    }

    private void dfs(String num, int target, int pos, StringBuilder path, long val, long multi, List<String> ret) {
        if (pos == num.length() && target == val) {
            ret.add(path.toString());
            return;
        }

        for (int i = pos; i < num.length(); i++) {
            if (num.charAt(pos) == '0' && i != pos) break;
            Long n = Long.parseLong(num.substring(pos, i + 1));
            int len = path.length();
            if (pos == 0) {
                path.append(n);
                dfs(num, target, i + 1, path, val + n, n, ret);
                path.setLength(len);
            } else {
                path.append('+').append(n);
                dfs(num, target, i + 1, path, val + n, n, ret);
                path.setLength(len);

                path.append('-').append(n);
                dfs(num, target, i + 1, path, val - n, -n, ret);
                path.setLength(len);

                path.append('*').append(n);
                dfs(num, target, i + 1, path, val - multi + multi * n, multi * n, ret);
                path.setLength(len);
            }

        }
    }
}
