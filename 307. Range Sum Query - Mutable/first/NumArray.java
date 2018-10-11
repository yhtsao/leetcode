package first;

public class NumArray {
    int[] nums;
    int[] BIT; // binary index tree

    public NumArray(int[] nums) {
        this.BIT = new int[nums.length + 1];
        this.nums = nums;

        for (int i = 0; i < nums.length; i++) {
            updateBIT(i, nums[i]);
        }
    }

    private void updateBIT(int i, int val) {
        int index = i + 1;
        while (index < BIT.length) {
            BIT[index] += val;
            index += getLowBit(index);
        }
    }

    private int getSum(int i) {
        int sum = 0;
        int index = i + 1;
        while (index > 0) {
            sum += BIT[index];
            index -= getLowBit(index);
        }
        return sum;
    }

    public void update(int i, int val) {
        int diff = val - nums[i];
        nums[i] = val;
        updateBIT(i, diff);
    }

    public int sumRange(int i, int j) {
        return getSum(j) - getSum(i - 1);
    }

    private int getLowBit(int i) {
        return i & (-i);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */
