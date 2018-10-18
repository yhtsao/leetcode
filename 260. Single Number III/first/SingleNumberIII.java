package first;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int diff = 0;

        // 1. XOR all nums
        //      nums = {1,2,1,3,2,5}
        //      diff = 6
        for (int num : nums)
            diff ^= num;

        // 2. Get right most '1' bit
        //      diff: 6 (0110) -> 2 (0010)
        diff &= -diff;

        // 3. Divide nums into two group
        int[] ret = new int[2];
        for (int num : nums) {
            if ((num & diff) == 0)
                ret[0] ^= num; // {1, 1, 5}
            else
                ret[1] ^= num; // {2, 3, 2}
        }
        return ret;
    }
}
