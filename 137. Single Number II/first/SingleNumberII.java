package first;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        return singleNumberBoolean2(nums);
    }

    private int singleNumberCountEachBit(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums)
                sum += (num >> i) & 1;
            res |= (sum % 3) << i;
        }
        return res;
    }

    private int singleNumberBoolean1(int[] nums) {
        int one = 0, two = 0, three = 0;
        for (int num : nums) {
            two |= one & num;
            one ^= num;

            // if occurs 3 times, reset one & two to zero
            three = one & two;
            one &= ~three;
            two &= ~three;
        }
        return one;
    }

    private int singleNumberBoolean2(int[] nums) {
        int a = 0, b = 0;
        for (int num : nums) {
            a = a ^ num & ~b;
            b = b ^ num & ~a;
        }
        return a;
    }
}
