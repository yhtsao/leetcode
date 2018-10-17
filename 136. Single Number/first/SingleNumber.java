package first;

public class SingleNumber {
    // ex: {4, 1, 2, 1, 2}
    // result = (1^1)^(2^2)^(4) = 0^0^4 = 0
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums)
            result ^= num;
        return result;
    }
}
