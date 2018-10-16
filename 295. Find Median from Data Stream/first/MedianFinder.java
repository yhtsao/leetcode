package first;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> maxQueue, minQueue;
    int size;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        this.maxQueue = new PriorityQueue<>(1000, Collections.reverseOrder()); // left part of median
        this.minQueue = new PriorityQueue<>(); // right part of median
        this.size = 0;
    }

    public void addNum(int num) {
        maxQueue.offer(num);
        minQueue.offer(maxQueue.poll());
        if (maxQueue.size() < minQueue.size()) {
            maxQueue.offer(minQueue.poll());
        }
        size++;
    }

    public double findMedian() {
        return size % 2 == 0 ?
                (double) (maxQueue.peek() + minQueue.peek()) / 2
                : maxQueue.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */