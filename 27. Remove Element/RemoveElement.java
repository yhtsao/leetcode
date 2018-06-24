public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int notRemove = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != val)
                nums[notRemove++] = nums[i];
        return notRemove;
    }
}
