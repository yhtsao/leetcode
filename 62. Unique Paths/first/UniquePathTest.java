package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePathTest {
    private UniquePath uniquePath = new UniquePath();

    @Test
    public void test01() {
        int m = 3;
        int n = 2;
        int ans = 3;
        int result = uniquePath.uniquePaths(m, n);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        int m = 7;
        int n = 3;
        int ans = 28;
        int result = uniquePath.uniquePaths(m, n);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        int m = 1;
        int n = 1;
        int ans = 1;
        int result = uniquePath.uniquePaths(m, n);
        Assertions.assertEquals(ans, result);
    }
}
