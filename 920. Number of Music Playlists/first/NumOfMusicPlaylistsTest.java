package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumOfMusicPlaylistsTest {
    private NumOfMusicPlaylists sol = new NumOfMusicPlaylists();

    @Test
    public void test01() {
        int N = 3;
        int L = 3;
        int K = 1;
        int ans = 6;
        int res = sol.numMusicPlaylists(N, L, K);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int N = 2;
        int L = 3;
        int K = 0;
        int ans = 6;
        int res = sol.numMusicPlaylists(N, L, K);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        int N = 2;
        int L = 3;
        int K = 1;
        int ans = 2;
        int res = sol.numMusicPlaylists(N, L, K);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        int N = 5;
        int L = 10;
        int K = 3;
        int ans = 7560;
        int res = sol.numMusicPlaylists(N, L, K);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test06() {
        int N = 80;
        int L = 100;
        int K = 5;
        int ans = 801749007;
        int res = sol.numMusicPlaylists(N, L, K);
        Assertions.assertEquals(ans, res);
    }
}
