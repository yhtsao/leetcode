package first;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ShuffleArrayTest {
    @Test
    public void test01() {
        int[] nums = new int[]{1, 2, 3};
        ShuffleArray sol = new ShuffleArray(nums);
        System.out.println(Arrays.toString(sol.shuffle()));
        System.out.println(Arrays.toString(sol.shuffle()));
        System.out.println(Arrays.toString(sol.reset()));
        System.out.println(Arrays.toString(sol.shuffle()));
        System.out.println(Arrays.toString(sol.shuffle()));

    }
}
