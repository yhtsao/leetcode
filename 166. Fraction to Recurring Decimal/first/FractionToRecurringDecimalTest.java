package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FractionToRecurringDecimalTest {
    private FractionToRecurringDecimal sol = new FractionToRecurringDecimal();

    @Test
    public void test01() {
        int numerator = 1;
        int denomicator = 2;
        String ans = "0.5";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test02() {
        int numerator = 2;
        int denomicator = 1;
        String ans = "2";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test03() {
        int numerator = 2;
        int denomicator = 3;
        String ans = "0.(6)";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test04() {
        int numerator = 1;
        int denomicator = 0;
        String ans = "NaN";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test05() {
        int numerator = 2147483647;
        int denomicator = 2147483646;
        String ans = "1.0(000000004656612877414201272105985574522973573322383289525642329385171019830900262883771455738480627293214786139516892041561093220078473184330829590867114803630034256381945923326486650227090949404138093259314161966847406669377728057445704990481683044211643789160664928295337528265395693728137476116546873111787133954267142297948843145695368895023473440691338331151137436880858090595210055443653888482278109045958248009866334507117359439951702430799326329305140608274508834140849145260498994272666977972413392711815790004856688906305179843963291350717927655873752809943401077709534277868954723578835580105740185925495052640787374825018807151372364863168788015068311258282802308241652611868132475640748139136236290574293854249914972344334211521161917151102719037889241276205742057604475000504846685104860630915370426061908179951746184333922513140293316114967052000544082373887377207993881039315723850685845921454807670279226890093858251435550163905648667277441050184370065279649631380708544869635761594060586387347976106543071667238205361401853488201139018126892874135536024473175429248414402127651872232232123829640563418753969873072551445171750565219438229891879698160923736319806181192217563457989658655589128523682363819035108963991616819046080875253380160083416998464071190416879197970851508873376537927777076072783280231788084126811552910890013827839879158735162726356799459417163822257112546132050963241654413977316034936640444152653630965066730012248018767915683582346591709504455057442612068208504531726710993542066769247936801284492762092959845525175189157179732953365643465300689884741501775329468562574562209262104899866604152942638986690565)";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test06() {
        int numerator = -1111;
        int denomicator = 13;
        String ans = "-85.(461538)";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test07() {
        int numerator = 59;
        int denomicator = 58;
        String ans = "1.0(1724137931034482758620689655)";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test08() {
        int numerator = 37;
        int denomicator = 36;
        String ans = "1.02(7)";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test09() {
        int numerator = 7;
        int denomicator = -12;
        String ans = "-0.58(3)";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test10() {
        int numerator = -1;
        int denomicator = Integer.MIN_VALUE;
        String ans = "0.0000000004656612873077392578125";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test13() {
        int numerator = 1;
        int denomicator = Integer.MIN_VALUE;
        String ans = "-0.0000000004656612873077392578125";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test11() {
        int numerator = Integer.MIN_VALUE;
        int denomicator = 1;
        String ans = "-2147483648";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test12() {
        int numerator = Integer.MIN_VALUE;
        int denomicator = -1;
        String ans = "2147483648";
        String res = sol.fractionToDecimal(numerator, denomicator);
        System.out.println(ans);
        System.out.println(res);
        Assertions.assertTrue(ans.equals(res));
    }
}
