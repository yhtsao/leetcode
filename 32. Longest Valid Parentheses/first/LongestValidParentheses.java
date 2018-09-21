package first;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        return longestValidParenthesesDP(s);
    }

    /**
     * Brute-force solution
     *
     * @param s
     * @return
     */
    public int longestValidParenthesesBF(String s) {
        int maxLen = 0;
        for (int len = 2; len <= s.length(); len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                if (isValid(s.substring(i, i + len))) {
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
        return maxLen;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() || c == '(') {
                stack.push(c);
            } else {
                char top = stack.peek();
                if (top == '(' && c == ')')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public int longestValidParenthesesStack(String s) {
        if (s == null || s.isEmpty()) return 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else {
                int top = stack.peek();
                if (top >= 0 && s.charAt(top) == '(') stack.pop();
                else stack.push(i);
            }
        }
        if (stack.isEmpty()) return s.length();

        int maxLen = 0;
        int last = s.length();
        while (!stack.isEmpty()) {
            maxLen = Math.max(maxLen, last - stack.peek() - 1);
            last = stack.pop();
        }

        return maxLen;
    }

    /**
     * Maintain one array to record longest length of valic parentheses
     * -- s[i] = '('
     * longest[i] = 0
     * -- s[i] = ')'
     * if s[i - 1] = '('
     * longest[i] = 2 + longest[i - 1]
     * else s[i - 1] = ')'
     * if s[i - longest[i - 1] - 1] = '('
     * longest[i] = 2 + longest[i - 1] + longest[i - longest[i - 1] - 2]
     * else
     * longest[i] = 0
     *
     * @param s
     * @return
     */
    public int longestValidParenthesesDP(String s) {
        if (s == null || s.isEmpty()) return 0;

        int[] longest = new int[s.length()];
        int maxLen = 0;
        longest[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(') longest[i] = 0;
            else { // ')'
                if (s.charAt(i - 1) == '(') {
                    longest[i] = 2;
                    if (i - 2 >= 0) longest[i] += longest[i - 2];
                } else if (i - longest[i - 1] - 1 >= 0 && s.charAt(i - longest[i - 1] - 1) == '(') {
                    longest[i] = 2 + longest[i - 1];
                    if (i - longest[i - 1] - 2 >= 0) longest[i] += longest[i - longest[i - 1] - 2];
                } else
                    longest[i] = 0;
            }
            maxLen = Math.max(maxLen, longest[i]);
        }
        return maxLen;
    }
}
