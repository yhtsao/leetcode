package first;

import java.util.Stack;

public class MinAddToValidParenthese {
    public int minAddToMakeValid(String S) {
        if (S == null || S.isEmpty()) return 0;
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char c : S.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else if (stack.isEmpty())
                count++;
            else
                stack.pop();
        }
        return count + stack.size();
    }
}
