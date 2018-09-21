package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveDuplicatesTest {
    @Test
    public void test01() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int lenAfterRemovedDuplicate = 5;
        RemoveDuplicates remove = new RemoveDuplicates();
        int result = remove.removeDuplicates(nums);
        Assertions.assertEquals(lenAfterRemovedDuplicate, result);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < lenAfterRemovedDuplicate; i++)
            Assertions.assertEquals(i, nums[i]);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{0, 0, 0, 0, 0};
        int lenAfterRemovedDuplicate = 1;
        RemoveDuplicates remove = new RemoveDuplicates();
        int result = remove.removeDuplicates(nums);
        Assertions.assertEquals(lenAfterRemovedDuplicate, result);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < lenAfterRemovedDuplicate; i++)
            Assertions.assertEquals(i, nums[i]);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int lenAfterRemovedDuplicate = 5;
        RemoveDuplicates remove = new RemoveDuplicates();
        int result = remove.removeDuplicates(nums);
        Assertions.assertEquals(lenAfterRemovedDuplicate, result);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < lenAfterRemovedDuplicate; i++)
            Assertions.assertEquals(i, nums[i]);
    }
}