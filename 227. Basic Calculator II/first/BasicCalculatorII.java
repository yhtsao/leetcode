package first;

import java.util.Stack;

public class BasicCalculatorII {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int val = 0;
        char operator = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                val = val * 10 + (c - '0');
                if (i != s.length() - 1) continue;
            }
            if (!Character.isSpaceChar(c) || i == s.length() - 1) {
                if (operator == '+')
                    stack.push(val);
                else if (operator == '-')
                    stack.push(-val);
                else if (operator == '*')
                    stack.push(stack.pop() * val);
                else if (operator == '/')
                    stack.push(stack.pop() / val);
                operator = c;
                val = 0;
            }
        }

        int sum = 0;
        while (!stack.isEmpty())
            sum += stack.pop();

        return sum;
    }
}
