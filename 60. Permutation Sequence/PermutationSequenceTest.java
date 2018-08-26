import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermutationSequenceTest {
    PermutationSequence permutationSequence = new PermutationSequence();

    @Test
    public void test01() {
        int n = 3;
        int k = 3;

        String result = permutationSequence.getPermutation(n, k);
        String ans = "213";
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test02() {
        int n = 4;
        int k = 9;

        String result = permutationSequence.getPermutation(n, k);
        String ans = "2314";
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test03() {
        int n = 9;
        int k = 214267;

        String result = permutationSequence.getPermutation(n, k);
        System.out.println(result);
    }
}
