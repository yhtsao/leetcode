package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExcelSheetColNumberTest {
    private ExcelSheetColNumber sol = new ExcelSheetColNumber();

    @Test
    public void test01() {
        String s = "AA";
        int ans = 27;
        int ret = sol.titleToNumber(s);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        String s = "ZY";
        int ans = 701;
        int ret = sol.titleToNumber(s);
        Assertions.assertEquals(ans, ret);
    }
}
