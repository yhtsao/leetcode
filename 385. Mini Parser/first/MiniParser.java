package first;

import common.NestedInteger;

import java.util.Stack;

public class MiniParser {
    public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') return new NestedInteger(Integer.valueOf(s));
        Stack<NestedInteger> stack = new Stack<>();
        NestedInteger ret = new NestedInteger();
        stack.push(ret);
        int start = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                NestedInteger nestedInteger = new NestedInteger();
                stack.peek().add(nestedInteger);
                stack.push(nestedInteger);
                start = i + 1;
            } else if (s.charAt(i) == ',' || s.charAt(i) == ']') {
                if (i > start) {
                    int num = Integer.valueOf(s.substring(start, i));
                    stack.peek().add(new NestedInteger(num));
                }
                start = i + 1;
                if (s.charAt(i) == ']')
                    stack.pop();
            }
        }
        return ret;
    }
}
