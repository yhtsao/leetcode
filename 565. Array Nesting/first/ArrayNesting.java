package first;

public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            int cnt = 0;
            while (nums[start] < nums.length) {
                int tmp = nums[start];
                nums[start] = nums.length;
                start = tmp;
                cnt++;
                if (start == i) break;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}
