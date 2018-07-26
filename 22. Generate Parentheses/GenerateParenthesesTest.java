import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateParenthesesTest {
    @Test
    public void test01() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 1;
        List<String> results = generateParentheses.generateParenthesis(n);
        System.out.println("n = " + n);
        for (String result : results)
            System.out.println(result);
    }

    @Test
    public void test02() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 2;
        List<String> results = generateParentheses.generateParenthesis(n);
        System.out.println("n = " + n);
        for (String result : results)
            System.out.println(result);
    }

    @Test
    public void test03() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 3;
        List<String> results = generateParentheses.generateParenthesis(n);
        System.out.println("n = " + n);
        for (String result : results)
            System.out.println(result);
    }

    @Test
    public void test04() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 4;
        List<String> results = generateParentheses.generateParenthesis(n);
        System.out.println("n = " + n);
        for (String result : results)
            System.out.println(result);
        String[] ans = new String[]{"(((())))", "((()()))",
                "((())())", "((()))()", "(()(()))", "(()()())",
                "(()())()", "(())(())", "(())()()", "()((()))",
                "()(()())", "()(())()", "()()(())", "()()()()"};

        Arrays.sort(ans);
        String ansString = Arrays.toString(ans);
        System.out.println(ansString);

        Collections.sort(results);
        String rsltString = results.toString();
        System.out.println(rsltString);

        Assertions.assertTrue(ansString.equals(rsltString));
    }
}
