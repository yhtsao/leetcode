package first;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() || c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                char top = stack.peek();

                if (top == '(' && c == ')')
                    stack.pop();
                else if (top == '[' && c == ']')
                    stack.pop();
                else if (top == '{' && c == '}')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
