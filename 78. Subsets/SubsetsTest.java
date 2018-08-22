import org.junit.jupiter.api.Test;

import java.util.List;

public class SubsetsTest {
    private Subsets subsets = new Subsets();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> results = subsets.subsets(nums);
        for (List<Integer> result : results)
            System.out.println(result);
    }
}
