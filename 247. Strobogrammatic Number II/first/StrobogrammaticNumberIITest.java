package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StrobogrammaticNumberIITest {
    private StrobogrammaticNumberII sol = new StrobogrammaticNumberII();

    @Test
    public void test01() {
        int n = 1;
        List<String> ansList = Arrays.asList("0", "1", "8");
        List<String> resList = sol.findStrobogrammatic(n);
        for (String ans : ansList)
            Assertions.assertTrue(resList.contains(ans));
    }

    @Test
    public void test02() {
        int n = 2;
        List<String> ansList = Arrays.asList("11", "69", "88", "96");
        List<String> resList = sol.findStrobogrammatic(n);
        for (String ans : ansList)
            Assertions.assertTrue(resList.contains(ans));
    }

    @Test
    public void test03() {
        int n = 3;
        List<String> ansList = Arrays.asList("101", "111", "181", "609", "619", "689", "808", "818", "888", "906", "916", "986");
        List<String> resList = sol.findStrobogrammatic(n);
        for (String ans : ansList)
            Assertions.assertTrue(resList.contains(ans));
    }

    @Test
    public void test04() {
        int n = 4;
        List<String> ansList = Arrays.asList("1001", "1111", "1691", "1881", "1961", "6009", "6119", "6699", "6889", "6969", "8008", "8118", "8698", "8888", "8968", "9006", "9116", "9696", "9886", "9966");
        List<String> resList = sol.findStrobogrammatic(n);
        for (String ans : ansList)
            Assertions.assertTrue(resList.contains(ans));
    }
}
