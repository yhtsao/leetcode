import org.junit.jupiter.api.Test;

import java.util.List;

public class SubsetsIITest {
    private SubsetsII subsetsII = new SubsetsII();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 2, 2};
        List<List<Integer>> results = subsetsII.subsetsWithDup(nums);
        for (List<Integer> result : results)
            System.out.println(result);
    }
}
