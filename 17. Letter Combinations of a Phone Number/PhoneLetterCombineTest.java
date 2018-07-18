import org.junit.jupiter.api.Test;

import java.util.List;

public class PhoneLetterCombineTest {
    @Test
    public void test01() {
        String digits = "23";
        PhoneLetterCombine phoneLetterCombine = new PhoneLetterCombine();
        List<String> result = phoneLetterCombine.letterCombinations(digits);
        System.out.println(result.toString());
    }

    @Test
    public void test02() {
        String digits = "";
        PhoneLetterCombine phoneLetterCombine = new PhoneLetterCombine();
        List<String> result = phoneLetterCombine.letterCombinations(digits);
        System.out.println(result.toString());
    }

    @Test
    public void test03() {
        String digits = "2";
        PhoneLetterCombine phoneLetterCombine = new PhoneLetterCombine();
        List<String> result = phoneLetterCombine.letterCombinations(digits);
        System.out.println(result.toString());
    }
}
