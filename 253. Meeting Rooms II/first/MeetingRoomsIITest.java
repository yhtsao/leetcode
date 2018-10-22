package first;

import common.Interval;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MeetingRoomsIITest {
    MeetingRoomsII sol = new MeetingRoomsII();

    @Test
    public void test01() {
        List<Interval> intervals = Arrays.asList(
                new Interval(0, 30),
                new Interval(5, 10),
                new Interval(15, 20),
                new Interval(20, 40),
                new Interval(35, 50)
        );
        int ans = 2;
        int ret = sol.minMeetingRooms(intervals);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        List<Interval> intervals = Arrays.asList(
                new Interval(0, 10),
                new Interval(5, 18),
                new Interval(8, 15),
                new Interval(12, 30),
                new Interval(20, 25)
        );
        int ans = 3;
        int ret = sol.minMeetingRooms(intervals);
        Assertions.assertEquals(ans, ret);
    }
}
