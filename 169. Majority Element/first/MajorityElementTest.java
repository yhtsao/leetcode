package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {
    MajorityElement sol = new MajorityElement();

    @Test
    public void test01() {
        int[] nums = new int[]{2, 3, 3};
        int ans = 3;
        Assertions.assertEquals(ans, sol.majorityElement(nums));
    }
}
