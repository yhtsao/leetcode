package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinGeneticMutationTest {
    private MinGeneticMutation sol = new MinGeneticMutation();

    @Test
    public void test01() {
        String start = "AACCGGTT";
        String end = "AACCGGTA";
        String[] bank = new String[]{"AACCGGTA"};
        int ans = 1;
        int res = sol.minMutation(start, end, bank);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String start = "AACCGGTT";
        String end = "AAACGGTA";
        String[] bank = new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        int ans = 2;
        int res = sol.minMutation(start, end, bank);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String start = "AAAAACCC";
        String end = "AACCCCCC";
        String[] bank = new String[]{"AAAACCCC", "AAACCCCC", "AACCCCCC"};
        int ans = 3;
        int res = sol.minMutation(start, end, bank);
        Assertions.assertEquals(ans, res);
    }
}
