package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KindInDeckTest {
    private KindInDeck kindInDeck = new KindInDeck();

    @Test
    public void test01() {
        int[] deck = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        Assertions.assertTrue(kindInDeck.hasGroupsSizeX(deck));
    }

    @Test
    public void test02() {
        int[] deck = new int[]{1, 1, 1, 2, 2, 2, 3, 3};
        Assertions.assertFalse(kindInDeck.hasGroupsSizeX(deck));
    }

    @Test
    public void test03() {
        int[] deck = new int[]{1};
        Assertions.assertFalse(kindInDeck.hasGroupsSizeX(deck));
    }

    @Test
    public void test04() {
        int[] deck = new int[]{1, 1};
        Assertions.assertTrue(kindInDeck.hasGroupsSizeX(deck));
    }

    @Test
    public void test05() {
        int[] deck = new int[]{1, 1, 2, 2, 2, 2};
        Assertions.assertTrue(kindInDeck.hasGroupsSizeX(deck));
    }

    @Test
    public void test06() {
        int[] deck = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
        Assertions.assertTrue(kindInDeck.hasGroupsSizeX(deck));
    }

    @Test
    public void test07() {
        int[] deck = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        Assertions.assertTrue(kindInDeck.hasGroupsSizeX(deck));
    }

}
