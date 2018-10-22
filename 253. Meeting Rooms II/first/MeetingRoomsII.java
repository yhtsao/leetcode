package first;

import common.Interval;

import java.util.*;

public class MeetingRoomsII {

    /**
     * @param intervals: an array of meeting time intervals
     * @return: the minimum number of conference rooms required
     */
    public int minMeetingRooms(List<Interval> intervals) {
        return minMeetingRoomsTwoPtr(intervals);
    }

    private int minMeetingRoomsPQ(List<Interval> intervals) {
        intervals.sort((Interval int1, Interval int2) -> int1.start - int2.start);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(0);
        for (Interval interval : intervals) {
            if (interval.start >= pq.peek()) {
                pq.poll();
            }
            pq.offer(interval.end);
        }
        return pq.size();
    }

    private int minMeetingRoomsTreeMap(List<Interval> intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Interval interval : intervals) {
            map.compute(interval.start, (key, value) -> {
                if (value == null)
                    value = 0;
                return ++value;
            });
            map.compute(interval.end, (key, value) -> {
                if (value == null)
                    value = 0;
                return --value;
            });
        }
        int currentUsedRoom = 0, totalRooms = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            totalRooms = Math.max(totalRooms, currentUsedRoom += entry.getValue());
        }
        return totalRooms;
    }

    private int minMeetingRoomsTwoPtr(List<Interval> intervals) {
        int[] start = new int[intervals.size()], end = new int[intervals.size()];
        for (int i = 0; i < intervals.size(); i++) {
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int rooms = 0, endPtr = 0;
        for (int i = 0; i < start.length; i++) {
            if (start[i] < end[endPtr]) rooms++;
            else endPtr++;
        }
        return rooms;
    }
}
