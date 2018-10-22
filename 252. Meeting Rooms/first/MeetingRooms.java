package first;

import common.Interval;

import java.util.List;

public class MeetingRooms {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((Interval int1, Interval int2) -> int1.start - int2.start);
        for (int i = 0; i < intervals.size() - 1; i++)
            if (intervals.get(i).end > intervals.get(i + 1).start) return false;

        return true;
    }
}
