package first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeSumWithMultiplicity {
    final long mod = 1000000007;

    public int threeSumMulti(int[] A, int target) {
        long count = 0;
        long[] nums = new long[101];
        for (int i = 0; i < A.length; i++) {
            nums[A[i]]++;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int k = target - i - j;
                if (k > 100 || k < 0) continue;
                if (i == j && j == k)
                    count += nums[i] * (nums[i] - 1) * (nums[i] - 2) / 6;
                else if (i == j && j != k)
                    count += nums[i] * (nums[i] - 1) * nums[k] / 2;
                else if (j < k)
                    count += nums[i] * nums[j] * nums[k];

                count = count % mod;
            }
        }
        return (int) count;
    }

    public int threeSumMultiOld(int[] A, int target) {
        Arrays.sort(A);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++)
            map.compute(A[i], (key, val) -> {
                if (val == null)
                    val = 0;
                return ++val;
            });

        long total = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int num = entry.getKey();
            entry.setValue(0);

            // select one
            total += count * twoSum(map, target - num);
            total %= mod;

            // select two
            if (map.containsKey(target - 2 * num) && count > 1)
                total += combination(count, 2) * map.get(target - 2 * num);
            total %= mod;

            // select three
            if (target == num * 3 && count > 2)
                total += combination(count, 3);
            total %= mod;
        }
        return (int) total;
    }

    private long twoSum(Map<Integer, Integer> map, int target) {
        long total = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() > target / 2 || entry.getValue() < 1) continue;

            if (target == entry.getKey() * 2)
                total += combination(entry.getValue(), 2);
            else if (map.containsKey(target - entry.getKey()))
                total += entry.getValue() * map.get(target - entry.getKey());

            total %= mod;
        }
        return total;
    }

    public double combination(int n, int k) {
        if (k < 2) return n;
        double c = 0;
        while (n >= k) {
            c += combination(--n, k - 1);
            c %= mod;
        }
        return c;
    }
}
