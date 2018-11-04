package first;

import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCounter {
    Deque<Integer> deque;

    public RecentCounter() {
        this.deque = new ArrayDeque<>();
    }

    public int ping(int t) {
        deque.offerLast(t);
        while (t - deque.getFirst() > 3000)
            deque.pollFirst();
        return deque.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
