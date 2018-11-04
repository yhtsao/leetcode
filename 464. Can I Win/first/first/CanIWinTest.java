package first.first;

import first.CanIWin;
import org.junit.jupiter.api.Test;

public class CanIWinTest {
    private CanIWin sol = new CanIWin();

    @Test
    public void test01() {
        int M = 3;
        int T = 5;
        sol.canIWin(M, T);
    }
}
