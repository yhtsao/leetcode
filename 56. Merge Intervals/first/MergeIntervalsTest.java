package first;

import common.Interval;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MergeIntervalsTest {
    private MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    public void test01() {
        List<Interval> intervals = Arrays.asList(
                new Interval(1, 3),
                new Interval(2, 6),
                new Interval(8, 10),
                new Interval(15, 18)
        );
        List<Interval> ans = Arrays.asList(
                new Interval(1, 6),
                new Interval(8, 10),
                new Interval(15, 18)
        );
        List<Interval> result = mergeIntervals.merge(intervals);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test02() {
        List<Interval> intervals = Arrays.asList(
                new Interval(1, 4),
                new Interval(4, 5)
        );
        List<Interval> ans = Arrays.asList(
                new Interval(1, 5)
        );
        List<Interval> result = mergeIntervals.merge(intervals);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test03() {
        List<Interval> intervals = Arrays.asList(
                new Interval(1, 4),
                new Interval(2, 3)
        );
        List<Interval> ans = Arrays.asList(
                new Interval(1, 4)
        );
        List<Interval> result = mergeIntervals.merge(intervals);
        Assertions.assertTrue(ans.equals(result));
    }

}
