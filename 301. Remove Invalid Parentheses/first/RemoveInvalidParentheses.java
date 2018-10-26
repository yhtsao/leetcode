package first;

import java.util.*;

public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        return removeInvalidParenthesesDFS(s);
    }

    public List<String> removeInvalidParenthesesDFS(String s) {
        List<String> ret = new ArrayList<>();
        removeParenthese(s, 0, 0, new char[]{'(', ')'}, ret);
        return ret;
    }

    public void removeParenthese(String s, int last_i, int last_j, char[] par, List<String> ret) {
        int cnt = 0;
        for (int i = last_i; i < s.length(); i++) {
            if (s.charAt(i) == par[0]) cnt++;
            else if (s.charAt(i) == par[1]) cnt--;
            if (cnt >= 0) continue;

            for (int j = last_j; j <= i; j++) {
                if (s.charAt(j) == par[1] && (j == 0 || s.charAt(j - 1) != par[1])) {
                    removeParenthese(s.substring(0, j) + s.substring(j + 1, s.length()), i, j, par, ret);
                }
            }
            return;
        }

        String reverStr = new StringBuilder(s).reverse().toString();
        if (par[0] == '(')
            removeParenthese(reverStr, 0, 0, new char[]{')', '('}, ret);
        else
            ret.add(reverStr);
    }

    public List<String> removeInvalidParenthesesBFS(String s) {
        List<String> ret = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(s);
        boolean found = false;
        while (!queue.isEmpty()) {
            String currStr = queue.poll();
            if (isParentheses(currStr)) {
                ret.add(currStr);
                found = true;
            }
            if (found) continue;

            for (int i = 0; i < currStr.length(); i++) {
                if (currStr.charAt(i) != '(' && currStr.charAt(i) != ')')
                    continue;
                String next = currStr.substring(0, i) + currStr.substring(i + 1, currStr.length());
                if (!visited.contains(next)) {
                    queue.offer(next);
                    visited.add(next);
                }
            }
        }
        return ret;
    }

    private boolean isParentheses(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') cnt++;
            if (c == ')' && cnt-- == 0) return false;
        }
        return cnt == 0;
    }
}
