package first;

import java.util.Random;

public class ShuffleArray {
    int[] nums;
    Random rand;

    public ShuffleArray(int[] nums) {
        this.nums = nums;
        this.rand = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        int[] shuffled = new int[nums.length];
        System.arraycopy(nums, 0, shuffled, 0, nums.length);
        for (int i = 1; i < nums.length; i++) {
            // always swap with index {0, i}, never get original array
            int swapIndex = rand.nextInt(i + 1);
            swap(shuffled, i, swapIndex);
        }
        return shuffled;
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */