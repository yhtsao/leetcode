package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainDuplicatesTest {
    private ContainDuplicates sol = new ContainDuplicates();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 2, 3, 1};
        Assertions.assertTrue(sol.containsDuplicate(nums));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{1, 2, 3, 4};
        Assertions.assertFalse(sol.containsDuplicate(nums));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Assertions.assertTrue(sol.containsDuplicate(nums));
    }
}
