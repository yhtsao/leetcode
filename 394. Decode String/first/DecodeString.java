package first;

import java.util.Stack;

public class DecodeString {
    public String decodeStringStack(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> timeStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                val = val * 10 + (c - '0');
            } else if (c == '[') {
                timeStack.push(val);
                strStack.push(currStr.toString());
                currStr = new StringBuilder();
                val = 0;
            } else if (c == ']') {
                StringBuilder sb = new StringBuilder();
                int cnt = timeStack.pop();
                String str = currStr.toString(); // current repeated string
                if (!strStack.isEmpty()) sb.append(strStack.pop());
                while (cnt-- > 0)
                    sb.append(str);
                currStr = sb;
            } else {
                currStr.append(c);
            }
        }
        return currStr.toString();
    }
}
