package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToIntegerTest {

    @Test
    public void test01() {
        String s = "42";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(42, stringToInteger.myAtoi(s));
    }

    @Test
    public void test02() {
        String s = "  -42  ";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(-42, stringToInteger.myAtoi(s));
    }

    @Test
    public void test03() {
        String s = "4193 with words";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(4193, stringToInteger.myAtoi(s));
    }

    @Test
    public void test04() {
        String s = "words and 987";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(0, stringToInteger.myAtoi(s));
    }

    @Test
    public void test05() {
        String s = "-91283472332";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(Integer.MIN_VALUE, stringToInteger.myAtoi(s));
    }

    @Test
    public void test06() {
        String s = "9128347233222";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi(s));
    }

    @Test
    public void test07() {
        String s = "+12  2";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(12, stringToInteger.myAtoi(s));
    }

    @Test
    public void test08() {
        String s = "++1";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(0, stringToInteger.myAtoi(s));
    }

    @Test
    public void test09() {
        String s = "+00124";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(124, stringToInteger.myAtoi(s));
    }

    @Test
    public void test10() {
        String s = "+-124";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(0, stringToInteger.myAtoi(s));
    }

    @Test
    public void test11() {
        String s = "  +0   123";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(0, stringToInteger.myAtoi(s));
    }

    @Test
    public void test12() {
        String s = " -6147483648";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(Integer.MIN_VALUE, stringToInteger.myAtoi(s));
    }

    @Test
    public void test13() {
        String s = "2147483648";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi(s));
    }

    @Test
    public void test14() {
        String s = "0-1";
        StringToInteger stringToInteger = new StringToInteger();
        Assertions.assertEquals(0, stringToInteger.myAtoi(s));
    }
}
