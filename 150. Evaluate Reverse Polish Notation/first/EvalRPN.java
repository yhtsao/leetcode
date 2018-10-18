package first;

import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (Character.isDigit(token.charAt(token.length() - 1))) {
                stack.push(Integer.parseInt(token));
                continue;
            }
            int second = stack.pop();
            int first = stack.pop();
            if (token.equals("+"))
                stack.push(first + second);
            else if (token.equals("-"))
                stack.push(first - second);
            else if (token.equals("*"))
                stack.push(first * second);
            else if (token.equals("/"))
                stack.push(first / second);
        }
        return stack.peek();
    }
}
