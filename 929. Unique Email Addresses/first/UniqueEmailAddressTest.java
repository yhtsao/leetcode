package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueEmailAddressTest {
    UniqueEmailAddress sol = new UniqueEmailAddress();

    @Test
    public void test01() {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int ans = 2;
        Assertions.assertEquals(ans, sol.numUniqueEmails(emails));
    }

    @Test
    public void test02() {
        String[] emails = new String[]{"test.email+alex+sss@leetcode.com", "testemail@leetcode.com", "testemail@lee.tcode.com"};
        int ans = 2;
        Assertions.assertEquals(ans, sol.numUniqueEmails(emails));
    }
}
