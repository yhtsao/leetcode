package first;

import org.junit.jupiter.api.Test;

import java.util.List;

public class NQueensTest {
    private NQueens nQueens = new NQueens();

    @Test
    public void test01() {
        int n = 4;
        List<List<String>> results = nQueens.solveNQueens(n);

        for (List<String> result : results) {
            System.out.println("----------");
            for (String row : result)
                System.out.println(row);
        }
    }

    @Test
    public void test02() {
        int n = 8;
        List<List<String>> results = nQueens.solveNQueens(n);

        for (List<String> result : results) {
            System.out.println("----------");
            for (String row : result)
                System.out.println(row);
        }
    }
}

