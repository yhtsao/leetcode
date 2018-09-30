package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionToDisjointSetTest {
    private PartitionToDisjointSet partitionToDisjointSet = new PartitionToDisjointSet();

    @Test
    public void test01() {
        int[] A = new int[]{5, 0, 3, 8, 6};
        int result = partitionToDisjointSet.partitionDisjoint(A);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void test02() {
        int[] A = new int[]{1, 1, 1, 0, 6, 12};
        int result = partitionToDisjointSet.partitionDisjoint(A);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void test03() {
        int[] A = new int[]{1, 2, 3};
        int result = partitionToDisjointSet.partitionDisjoint(A);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void test04() {
        int[] A = new int[]{2, 5, 1, 8, 6};
        int result = partitionToDisjointSet.partitionDisjoint(A);
        Assertions.assertEquals(3, result);
    }
}
