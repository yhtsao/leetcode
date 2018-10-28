package first;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSum {
    /*
    Let sum[i] = A[0] + A[1] + ... + A[i]
    we want to find an interval have sum equal to target
    target = A[i] + A[i + 1] + ... + A[j]
           = sum[j] - sum[i - 1]

    Ex: A[] = {0, 0, 1}, target = 1
    when j = 2, sum[j] = 1
    and both sum[0] and sum[1] are equal to 0
    so we have two possible interval
        [0, 0, 1], [0, 1]
     */
    public int numSubarraysWithSum(int[] A, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (map.containsKey(sum - target))
                cnt += map.get(sum - target);
            if (sum == target) cnt++;
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }
}
