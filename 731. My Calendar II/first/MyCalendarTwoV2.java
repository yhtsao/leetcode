package first;

import java.util.Map;
import java.util.TreeMap;

public class MyCalendarTwoV2 {
    TreeMap<Integer, Integer> events;

    public MyCalendarTwoV2() {
        this.events = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        int cnt = 0;
        events.put(start, events.getOrDefault(start, 0) + 1);
        events.put(end, events.getOrDefault(end, 0) - 1);
        for (Map.Entry<Integer, Integer> event : events.entrySet()) {
            cnt += event.getValue();
            if (cnt == 3) {
                events.put(start, events.get(start) - 1);
                events.put(end, events.get(end) + 1);
                return false;
            }
        }
        return true;
    }
}
