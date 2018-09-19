import org.junit.jupiter.api.Test;

import java.util.List;

public class CombinationsTest {
    private Combinations combinations = new Combinations();

    @Test
    public void test01() {
        int n = 4;
        int k = 2;

        List<List<Integer>> results = combinations.combine(n, k);
        for (List<Integer> result : results)
            System.out.println(result.toString());

    }

    @Test
    public void test02() {
        int n = 20;
        int k = 10;

        List<List<Integer>> results = combinations.combine(n, k);
        for (List<Integer> result : results)
            System.out.println(result.toString());

    }
}
