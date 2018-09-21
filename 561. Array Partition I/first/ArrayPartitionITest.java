package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayPartitionITest {
    @Test
    public void test1() {
        int nums[] = new int[]{1, 4, 3, 2};
        ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
        int sum = arrayPartitionI.arrayPairSum(nums);
        Assertions.assertEquals(4, sum);
    }

    @Test
    public void test2() {
        int nums[] = new int[]{-1, 4, -3, 2, 10, -7};
        ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
        int sum = arrayPartitionI.arrayPairSum(nums);
        Assertions.assertEquals(-4, sum);
    }
}