import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class NQueensIITest {
    private NQueensII nQueensII = new NQueensII();

    @Test
    public void test01() {
        int n = 4;
        int numOfSol = nQueensII.totalNQueens(n);
        Assertions.assertEquals(2, numOfSol);
    }
}

