package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueSubstringInWraparoundStrTest {
    private UniqueSubstringInWraparoundStr sol = new UniqueSubstringInWraparoundStr();

    @Test
    public void test01() {
        String p = "a";
        int ans = 1;
        int res = sol.findSubstringInWraproundString(p);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String p = "cac";
        int ans = 2;
        int res = sol.findSubstringInWraproundString(p);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String p = "zab";
        int ans = 6;
        int res = sol.findSubstringInWraproundString(p);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        String p = "zabd";
        int ans = 7;
        int res = sol.findSubstringInWraproundString(p);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        String p = "abczab";
        int ans = 9;
        int res = sol.findSubstringInWraproundString(p);
        Assertions.assertEquals(ans, res);
    }
}
