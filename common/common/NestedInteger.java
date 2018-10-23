package common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NestedInteger {
    Integer num;
    List<NestedInteger> list;

    // Constructor initializes an empty nested list.
    public NestedInteger() {
        this.list = new ArrayList<>();
    }

    // Constructor initializes a single integer.
    public NestedInteger(int value) {
        this.list = new ArrayList<>();
        this.num = value;

    }

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger() {
        return num != null;
    }

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger() {
        return num;
    }

    // Set this NestedInteger to hold a single integer.
    public void setInteger(int value) {
        num = value;
    }

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    public void add(NestedInteger ni) {
        list.add(ni);
    }

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList() {
        return list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (num != null)
            sb.append(num);
        else {
            sb.append("[");
            for (NestedInteger ni : list) {
                sb.append(ni).append(",");
            }
            String tmp = sb.substring(0, sb.length() - 1);
            sb = new StringBuilder().append(tmp).append("]");
        }
        return sb.toString();
    }

    public static NestedInteger deserialize(String s) {
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

    public static void main(String[] args) {
        NestedInteger curr = new NestedInteger();
        curr.add(new NestedInteger(2));
        curr.add(new NestedInteger(3));
        NestedInteger parent = new NestedInteger();
        parent.add(curr);
        parent.add(new NestedInteger(4));
        System.out.println(parent.toString());
        curr = NestedInteger.deserialize("[[20,345],-4,[12,6]]");
        System.out.println(curr.toString());
    }
}
