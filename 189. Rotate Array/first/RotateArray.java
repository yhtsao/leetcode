package first;

import java.util.ArrayList;
import java.util.List;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        rotateWithReverse(nums, k);
    }

    private void rotateWithBuffer(int[] nums, int k) {
        if (nums.length < 2 || k == 0) return;
        k = k % nums.length;
        List<Integer> buffer = new ArrayList<>();
        for (int i = nums.length - k; i < nums.length; i++)
            buffer.add(nums[i]);
        for (int i = nums.length - 1; i >= k; i--)
            nums[i] = nums[i - k];
        for (int i = 0; i < k; i++)
            nums[i] = buffer.get(i);
    }

    private void rotateWithReverse(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int lo, int hi) {
        while (lo < hi) {
            int tmp = nums[lo];
            nums[lo++] = nums[hi];
            nums[hi--] = tmp;
        }
    }
}
