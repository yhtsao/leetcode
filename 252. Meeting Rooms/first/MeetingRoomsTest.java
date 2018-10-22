package first;

import common.Interval;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MeetingRoomsTest {
    MeetingRooms sol = new MeetingRooms();

    @Test
    public void test01() {
        List<Interval> intervals = Arrays.asList(
                new Interval(0, 30),
                new Interval(5, 10),
                new Interval(15, 20)
        );
        Assertions.assertFalse(sol.canAttendMeetings(intervals));
    }

    @Test
    public void test02() {
        List<Interval> intervals = Arrays.asList(
                new Interval(0, 12),
                new Interval(15, 18),
                new Interval(20, 30)
        );
        Assertions.assertTrue(sol.canAttendMeetings(intervals));
    }
}
