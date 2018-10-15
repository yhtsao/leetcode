package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class LongestSubstringKDistinctCharTest {
    private LongestSubstringKDistinctChar solution = new LongestSubstringKDistinctChar();

    @Test
    public void test01() {
        String s = "abcadcacacaca";
        int k = 3;
        Assertions.assertEquals(solution.correctAns(s, k),
                solution.lengthOfLongestSubstringKistinct(s, k));
    }

    @Test
    public void test02() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int k = rand.nextInt(10) + 1;
            String s = randomString(k);
            System.out.println(s + ", " + k);
            Assertions.assertEquals(solution.correctAns(s, k),
                    solution.lengthOfLongestSubstringKistinct(s, k));
        }
    }

    @Test
    public void test03() {
        String s = "nfhiexxjrtvpfhkrxcutexxcodfioburrtjefrgwrnqtyzelvtpvwdvvpsbudwtiryqzzy";
        int k = 25;
        Assertions.assertEquals(solution.correctAns(s, k),
                solution.lengthOfLongestSubstringKistinct(s, k));
    }

    private String randomString(int k) {
        Random rand = new Random();
        int len = rand.nextInt(50) + 5;
        char[] chars = new char[len];
        for (int i = 0; i < len; i++)
            chars[i] = (char) (rand.nextInt(k) + 'a');
        return String.valueOf(chars);
    }
}
