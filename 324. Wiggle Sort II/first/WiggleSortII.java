package first;

import java.util.Arrays;

public class WiggleSortII {
    public void wiggleSort(int[] nums) {
        wiggleSortMedian(nums);
    }

    private void wiggleSortBySort(int[] nums) {
        int[] tmp = new int[nums.length];
        System.arraycopy(nums, 0, tmp, 0, nums.length);
        Arrays.sort(tmp);
        int frontPart = (nums.length - 1) / 2, backPart = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i % 2 == 1 ? tmp[backPart--] : tmp[frontPart--];
        }
    }

    private void wiggleSortMedian(int[] nums) {
        int median = findKthLargest(nums, (nums.length + 1) / 2);
        int even = nums.length % 2 == 0 ? nums.length - 2 : nums.length - 1;
        int odd = 1;
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > median) {
                tmp[odd] = nums[i];
                odd += 2;
            } else if (nums[i] < median) {
                tmp[even] = nums[i];
                even -= 2;
            }
        }
        while (odd < nums.length) {
            tmp[odd] = median;
            odd += 2;
        }
        while (even >= 0) {
            tmp[even] = median;
            even -= 2;
        }

        for (int i = 0; i < nums.length; i++)
            nums[i] = tmp[i];

    }

    private int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
