package first;

import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        int sign = 1;
        int result = 0, val = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(sign);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                val = val * 10 + c - '0';
            else if (c == '+' || c == '-') {
                result += val * sign;
                sign = stack.peek() * (c == '+' ? 1 : -1);
                val = 0;
            } else if (c == '(')
                stack.push(sign);
            else if (c == ')')
                stack.pop();
        }
        result += val * sign;
        return result;
    }
}
