package first;

public class MaxDistanceToCloestPerson {
    public int maxDistToClosest(int[] seats) {
        int start = -1;
        int maxDist = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (start < 0)
                    maxDist = i - start - 1;
                else
                    maxDist = Math.max(maxDist, (i - start) / 2);
                start = i;
            }
        }
        if (seats[seats.length - 1] == 0)
            maxDist = Math.max(maxDist, (seats.length - start - 1));
        return maxDist;
    }
}
