import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    @Test
    public void test01() {
        String s = "()";
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertTrue(validParentheses.isValid(s));
    }

    @Test
    public void test02() {
        String s = "()[]{}";
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertTrue(validParentheses.isValid(s));
    }

    @Test
    public void test03() {
        String s = "(]";
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertFalse(validParentheses.isValid(s));
    }

    @Test
    public void test04() {
        String s = "([)]";
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertFalse(validParentheses.isValid(s));
    }

    @Test
    public void test05() {
        String s = "{[]}";
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertTrue(validParentheses.isValid(s));
    }

    @Test
    public void test06() {
        String s = "{";
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertFalse(validParentheses.isValid(s));
    }

    @Test
    public void test08() {
        String s = "";
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertTrue(validParentheses.isValid(s));
    }

    @Test
    public void test07() {
        String s = "}}";
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertFalse(validParentheses.isValid(s));
    }

    @Test
    public void test09() {
        String s = "(])";
        ValidParentheses validParentheses = new ValidParentheses();
        Assertions.assertFalse(validParentheses.isValid(s));
    }
}
