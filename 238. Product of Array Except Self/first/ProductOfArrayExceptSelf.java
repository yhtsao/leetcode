package first;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        ret[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            ret[i] = ret[i - 1] * nums[i];
        int right = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            ret[i] = ret[i - 1] * right;
            right *= nums[i];
        }
        ret[0] = right;
        return ret;
    }
}
