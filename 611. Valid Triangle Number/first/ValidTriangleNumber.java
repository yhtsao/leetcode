package first;

import java.util.Arrays;

public class ValidTriangleNumber {

    // O(N^2lgN)
    public int triangleNumberBinarySearch(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int lo = j + 1, hi = nums.length;
                int sum = nums[i] + nums[j];
                while (lo < hi) { // binary search
                    int mid = lo + (hi - lo) / 2;
                    if (nums[mid] < sum) lo = mid + 1;
                    else hi = mid;
                }
                cnt += hi - j - 1;
            }
        }
        return cnt;
    }

    // O(N^2)
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        for (int i = nums.length - 1; i > 1; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    cnt += right - left;
                    right--;
                } else
                    left++;
            }
        }
        return cnt;
    }
}
