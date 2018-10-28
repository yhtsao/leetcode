package first;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return 0;
        int sum = 1, cnt = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum *= nums[i];

            while (sum >= k && start < i)
                sum /= nums[start++];

            if (sum < k)
                cnt += i - start + 1;
        }
        return cnt;
    }
}
