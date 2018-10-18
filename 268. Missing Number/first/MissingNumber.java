package first;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        return missingNumberAdd(nums);
    }

    /**
     * Because a^b^b = a, when the array = [0, 2, 4, 1]
     * Do the XOR operation on each elements: i ^ nums[i]
     * (0^0)^(1^2)^(2^4)^(3^1)^4 = 3
     *
     * @param nums
     * @return
     */
    private int missingNumberBitwise(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++)
            res = res ^ i ^ nums[i];
        return res;
    }

    /**
     * array = [0, 2, 4, 1]
     * result = (0 - 0) + (1 - 2) + (2 - 4) + (3 - 1) + 4 = 3
     */
    private int missingNumberAdd(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++)
            res += i - nums[i];
        return res;
    }
}
