package first;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RemoveInvalidParenthesesTest {
    RemoveInvalidParentheses sol = new RemoveInvalidParentheses();

    @Test
    public void test01() {
        String s = "()())()";
        List<String> ans = Arrays.asList(
                "()()()", "(())()"
        );
        List<String> ret = sol.removeInvalidParentheses(s);
        for (String str : ret)
            System.out.println(str);
    }

    @Test
    public void test02() {
        String s = "(a)())()";
        List<String> ans = Arrays.asList(
                "(a)()()", "(a())()"
        );
        List<String> ret = sol.removeInvalidParentheses(s);
        for (String a : ans)
            ret.contains(a);
    }

    @Test
    public void test03() {
        String s = ")(";
        List<String> ans = Arrays.asList(
                ")("
        );
        List<String> ret = sol.removeInvalidParentheses(s);
        for (String a : ans)
            ret.contains(a);
    }
}
