package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseOnlyLettersTest {
    private ReverseOnlyLetters sol = new ReverseOnlyLetters();

    @Test
    public void test01() {
        String S = "ab-cd";
        String ans = "dc-ba";
        String res = sol.reverseOnlyLetters(S);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test02() {
        String S = "a-bC-dEf-ghIj";
        String ans = "j-Ih-gfE-dCba";
        String res = sol.reverseOnlyLetters(S);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test03() {
        String S = "Test1ng-Leet=code-Q!";
        String ans = "Qedo1ct-eeLg=ntse-T!";
        String res = sol.reverseOnlyLetters(S);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test04() {
        String S = "!12)?~";
        String ans = "!12)?~";
        String res = sol.reverseOnlyLetters(S);
        Assertions.assertTrue(ans.equals(res));
    }
}
