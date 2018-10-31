package first;

import java.util.TreeMap;

public class MyCalendar {
    TreeMap<Integer, Integer> calendar;

    public MyCalendar() {
        this.calendar = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prevStart = calendar.floorKey(start);
        Integer nextStart = calendar.ceilingKey(start);
        if (prevStart != null && calendar.get(prevStart) > start)
            return false;
        if (nextStart != null && nextStart < end)
            return false;
        calendar.put(start, end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */