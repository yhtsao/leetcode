package first;

import common.NestedInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiniParserTest {
    MiniParser sol = new MiniParser();

    @Test
    public void test01() {
        String s = "[[20,-1],76,123,[12,[14,-13]]]";
        NestedInteger nestedInteger = sol.deserialize(s);
        Assertions.assertTrue(s.equals(nestedInteger.toString()));
    }

    @Test
    public void test02() {
        String s = "-10";
        NestedInteger nestedInteger = sol.deserialize(s);
        Assertions.assertTrue(s.equals(nestedInteger.toString()));
    }
}
