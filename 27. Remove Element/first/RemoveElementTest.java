package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveElementTest {
    @Test
    public void test01() {
        int[] nums = new int[]{3, 2, 2, 3};
        int[] numsAns = new int[]{2, 2};
        int val = 3;
        RemoveElement removeElement = new RemoveElement();
        int lenAfterRemove = removeElement.removeElement(nums, val);
        Assertions.assertEquals(numsAns.length, lenAfterRemove);
        for (int i = 0; i < numsAns.length; i++)
            Assertions.assertEquals(numsAns[i], nums[i]);

    }

    @Test
    public void test02() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int[] numsAns = new int[]{0, 1, 3, 0, 4};
        int val = 2;
        RemoveElement removeElement = new RemoveElement();
        int lenAfterRemove = removeElement.removeElement(nums, val);
        Assertions.assertEquals(numsAns.length, lenAfterRemove);
        for (int i = 0; i < numsAns.length; i++)
            Assertions.assertEquals(numsAns[i], nums[i]);

    }

    @Test
    public void test03() {
        int[] nums = new int[]{3, 2, 2, 3, 2, 1};
        int[] numsAns = new int[]{3, 2, 2, 3, 2, 1};
        int val = 7;
        RemoveElement removeElement = new RemoveElement();
        int lenAfterRemove = removeElement.removeElement(nums, val);
        Assertions.assertEquals(numsAns.length, lenAfterRemove);
        for (int i = 0; i < numsAns.length; i++)
            Assertions.assertEquals(numsAns[i], nums[i]);

    }
}