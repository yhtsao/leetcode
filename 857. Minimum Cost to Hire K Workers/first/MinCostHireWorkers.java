package first;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinCostHireWorkers {
    // Try to find a ratio r, which r * quality[i] > wage[i]
    // r > wage[i] / quality[i]
    // Time: O(nlgn)
    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        double min = Integer.MAX_VALUE;
        Double[][] workers = new Double[quality.length][2];
        // initial ratio and quality of each worker
        for (int i = 0; i < quality.length; i++)
            workers[i] = new Double[]{(double) wage[i] / (double) quality[i], (double) quality[i]};
        // sort the workers by ascending order
        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));

        // put qulities into priority queue, sorted in descending order
        PriorityQueue<Double> pq = new PriorityQueue<>((a, b) -> Double.compare(b, a));
        double currSum = 0;
        for (Double[] worker : workers) {
            currSum += worker[1];
            pq.add(worker[1]);
            if (pq.size() > K) // remove largest quality worker
                currSum -= pq.poll();
            if (pq.size() == K)
                min = Math.min(min, worker[0] * currSum);
        }

        return min;
    }
}
