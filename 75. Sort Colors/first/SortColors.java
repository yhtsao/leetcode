package first;

public class SortColors {
    public void sortColors(int[] nums) {
        sortColorsTwoPtr(nums);
    }

    /*
    By Two pointer
    sweep all 0s to left, all 2s to right, all 1s left in middle
    */
    private void sortColorsTwoPtr(int[] nums) {
        int left = 0, right = nums.length - 1;
        for (int i = 0; i <= right; i++) {
            while (nums[i] == 2 && i < right)
                swap(nums, i, right--);
            while (nums[i] == 0 && i > left)
                swap(nums, i, left++);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    /*
    By Counting sort
     */
    private void sortColorsCount(int[] nums) {
        int[] counts = new int[3];
        for (int num : nums)
            counts[num]++;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (counts[j] == 0) j++;
            nums[i] = j;
            counts[j]--;
        }
    }
}
