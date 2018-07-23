import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestValidParenthesesTest {
    @Test
    public void test01() {
        String s = "(()";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(2, longest.longestValidParentheses(s));
    }

    @Test
    public void test02() {
        String s = ")()())";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(4, longest.longestValidParentheses(s));
    }

    @Test
    public void test03() {
        String s = ")";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(0, longest.longestValidParentheses(s));
    }

    @Test
    public void test04() {
        String s = "(";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(0, longest.longestValidParentheses(s));
    }

    @Test
    public void test05() {
        String s = "";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(0, longest.longestValidParentheses(s));
    }

    @Test
    public void test06() {
        String s = ")(";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(0, longest.longestValidParentheses(s));
    }

    @Test
    public void test07() {
        String s = "((";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(0, longest.longestValidParentheses(s));
    }

    @Test
    public void test08() {
        String s = "))";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(0, longest.longestValidParentheses(s));
    }

    @Test
    public void test09() {
        String s = "((())((()";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(4, longest.longestValidParentheses(s));
    }

    @Test
    public void test10() {
        String s = "((())(()";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(4, longest.longestValidParentheses(s));
    }

    @Test
    public void test11() {
        String s = "(()(()()";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(4, longest.longestValidParentheses(s));
    }

    @Test
    public void test12() {
        String s = "()()";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(4, longest.longestValidParentheses(s));
    }

    @Test
    public void test13() {
        String s = "(())";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(4, longest.longestValidParentheses(s));
    }

    @Test
    public void test14() {
        String s = "())";
        LongestValidParentheses longest = new LongestValidParentheses();
        Assertions.assertEquals(2, longest.longestValidParentheses(s));
    }
}
