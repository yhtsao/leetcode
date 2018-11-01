package first;

import java.util.Map;
import java.util.TreeMap;

public class MyCalendarThreeV1 {
    TreeMap<Integer, Integer> map;
    int maxCnt;

    public MyCalendarThreeV1() {
        this.map = new TreeMap<>();
        this.maxCnt = 0;
    }

    public int book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);
        int cnt = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            cnt += entry.getValue();
            maxCnt = Math.max(maxCnt, cnt);
        }
        return maxCnt;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */