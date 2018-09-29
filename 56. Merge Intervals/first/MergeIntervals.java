package first;

import common.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) return intervals;

        Collections.sort(intervals, (Interval a, Interval b) -> a.start - b.start);

        List<Interval> res = new ArrayList<>();
        res.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            int rightEdge = res.get(res.size() - 1).end;
            if (intervals.get(i).start <= rightEdge) {
                res.get(res.size() - 1).end = Math.max(rightEdge, intervals.get(i).end);
            } else
                res.add(intervals.get(i));
        }
        return res;
    }
}
