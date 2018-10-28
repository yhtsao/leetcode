package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BeautifulArrayTest {
    BeautifulArray sol = new BeautifulArray();

    @Test
    public void test01() {
        int N = 1;
        int[] ans = new int[]{1};
        Assertions.assertTrue(Arrays.equals(ans, sol.beautifulArray(N)));
    }

    @Test
    public void test02() {
        int N = 2;
        int[] ans = new int[]{1, 2};
        Assertions.assertTrue(Arrays.equals(ans, sol.beautifulArray(N)));
    }

    @Test
    public void test03() {
        int N = 3;
        int[] ans = new int[]{1, 3, 2};
        Assertions.assertTrue(Arrays.equals(ans, sol.beautifulArray(N)));
    }

    @Test
    public void test04() {
        int N = 4;
        int[] ans = new int[]{1, 3, 2, 4};
        Assertions.assertTrue(Arrays.equals(ans, sol.beautifulArray(N)));
    }

    @Test
    public void test05() {
        int N = 5;
        int[] ans = new int[]{1, 5, 3, 2, 4};
        Assertions.assertTrue(Arrays.equals(ans, sol.beautifulArray(N)));
    }
}
