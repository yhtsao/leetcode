package first;

import org.junit.jupiter.api.Test;

import java.util.List;

public class PascalsTriangleTest {
    PascalsTriangle sol = new PascalsTriangle();

    @Test
    public void test01() {
        int n = 5;
        List<List<Integer>> ret = sol.generate(n);
        for (List<Integer> list : ret)
            System.out.println(list.toString());
    }
}
