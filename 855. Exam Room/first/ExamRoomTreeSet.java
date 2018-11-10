package first;

import java.util.TreeSet;

public class ExamRoomTreeSet {
    private int N;
    private TreeSet<Integer> students;

    public ExamRoomTreeSet(int N) {
        this.N = N;
        this.students = new TreeSet<>();
    }

    public int seat() {
        int position = 0;
        if (!students.isEmpty()) {
            int maxDist = students.first();
            Integer prev = null;
            for (Integer p : students) {
                if (prev != null) {
                    int d = (p - prev) / 2;
                    if (d > maxDist) {
                        position = prev + d;
                        maxDist = d;
                    }
                }
                prev = p;
            }

            // for right most position
            if (N - 1 - students.last() > maxDist)
                position = N - 1;
        }
        students.add(position);
        return position;
    }

    public void leave(int p) {
        students.remove(p);
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(N);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */
