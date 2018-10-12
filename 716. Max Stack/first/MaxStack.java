package first;

import java.util.Stack;

public class MaxStack {
    Stack<Integer> stack;
    Stack<Integer> maxStack;

    public MaxStack() {
        this.stack = new Stack<>();
        this.maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);
    }

    public void push(int x) {
        if (x > maxStack.peek())
            maxStack.push(x);
        else
            maxStack.push(maxStack.peek());
        stack.push(x);
    }

    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int preMax = maxStack.peek();
        Stack<Integer> tmp = new Stack<>();
        while (stack.peek() != preMax) {
            tmp.push(pop());
        }
        pop();
        while (!tmp.isEmpty())
            push(tmp.pop());
        return preMax;
    }
}
