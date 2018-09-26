package first;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;
    private int numOfElems;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        this.stackIn = new Stack<>();
        this.stackOut = new Stack<>();
        this.numOfElems = 0;
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stackIn.add(x);
        numOfElems++;
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        numOfElems--;
        int val = peek();
        stackOut.pop();
        return val;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }

        return stackOut.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return numOfElems == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
