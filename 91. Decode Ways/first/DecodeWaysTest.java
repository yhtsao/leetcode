package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecodeWaysTest {
    private DecodeWays sol = new DecodeWays();

    @Test
    public void test01() {
        String s = "12";
        int ans = 2;
        int res = sol.numDecodings(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String s = "226";
        int ans = 3;
        int res = sol.numDecodings(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String s = "282136125";
        int ans = 9;
        int res = sol.numDecodings(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        String s = "0";
        int ans = 0;
        int res = sol.numDecodings(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        String s = "10";
        int ans = 1;
        int res = sol.numDecodings(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test06() {
        String s = "17";
        int ans = 2;
        int res = sol.numDecodings(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test07() {
        String s = "10";
        int ans = 1;
        int res = sol.numDecodings(s);
        Assertions.assertEquals(ans, res);

        s = "100";
        ans = 0;
        res = sol.numDecodings(s);
        Assertions.assertEquals(ans, res);

        s = "1001";
        ans = 0;
        res = sol.numDecodings(s);
        Assertions.assertEquals(ans, res);

        s = "101";
        ans = 1;
        res = sol.numDecodings(s);
        Assertions.assertEquals(ans, res);
    }
}
