package first;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarTwoV1 {
    List<int[]> overlapped;
    List<int[]> events;

    public MyCalendarTwoV1() {
        this.overlapped = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] overlap : overlapped) {
            if (start >= overlap[1] || end <= overlap[0]) continue;
            else return false;
        }
        for (int[] event : events) {
            if (start >= event[1] || end <= event[0]) continue;
            else overlapped.add(new int[]{Math.max(event[0], start), Math.min(event[1], end)});
        }
        events.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
