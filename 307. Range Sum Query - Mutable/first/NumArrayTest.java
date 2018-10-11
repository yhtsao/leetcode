package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumArrayTest {

    @Test
    public void test01() {
        int[] nums = new int[]{1, 3, 5};
        NumArray numArray = new NumArray(nums);
        Assertions.assertEquals(9, numArray.sumRange(0, 2));
        numArray.update(1, 2);
        Assertions.assertEquals(8, numArray.sumRange(0, 2));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{3, 2, -1, 6, 5, 4, -3, 3, 7, 2, 3};
        NumArray numArray = new NumArray(nums);
        Assertions.assertEquals(22, numArray.sumRange(3, 8));
        numArray.update(5, -1);
        Assertions.assertEquals(17, numArray.sumRange(3, 8));
    }

}
