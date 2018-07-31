import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntTest {
    private RomanToInt romanToInt = new RomanToInt();

    @Test
    public void test01() {
        String roman = "III";
        int ans = 3;
        Assertions.assertEquals(ans, romanToInt.romanToInt(roman));
    }

    @Test
    public void test02() {
        String roman = "IV";
        int ans = 4;
        Assertions.assertEquals(ans, romanToInt.romanToInt(roman));
    }

    @Test
    public void test03() {
        String roman = "IX";
        int ans = 9;
        Assertions.assertEquals(ans, romanToInt.romanToInt(roman));
    }

    @Test
    public void test04() {
        String roman = "LVIII";
        int ans = 58;
        Assertions.assertEquals(ans, romanToInt.romanToInt(roman));
    }

    @Test
    public void test05() {
        String roman = "MCMXCIV";
        int ans = 1994;
        Assertions.assertEquals(ans, romanToInt.romanToInt(roman));
    }
}
