public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int notDuplicate = 0, duplicate = 1;

        while (duplicate < nums.length) {
            if (nums[notDuplicate] == nums[duplicate])
                duplicate++;
            else {
                notDuplicate++;
                swap(nums, notDuplicate, duplicate);
                duplicate++;
            }
        }
        return notDuplicate + 1;
    }

    private void swap(int[] nums, int p, int q) {
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }
}
