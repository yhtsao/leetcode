import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class NextPermutationTest {
    @Test
    public void test() {
        NextPermutation nextPermutation = new NextPermutation();
        int[] nums = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(nums));

        nextPermutation.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        Assertions.assertTrue(Arrays.equals(new int[]{1, 3, 2}, nums));

        nextPermutation.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        Assertions.assertTrue(Arrays.equals(new int[]{2, 1, 3}, nums));

        nextPermutation.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        Assertions.assertTrue(Arrays.equals(new int[]{2, 3, 1}, nums));

        nextPermutation.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        Assertions.assertTrue(Arrays.equals(new int[]{3, 1, 2}, nums));

        nextPermutation.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        Assertions.assertTrue(Arrays.equals(new int[]{3, 2, 1}, nums));

        nextPermutation.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        Assertions.assertTrue(Arrays.equals(new int[]{1, 2, 3}, nums));
    }
}