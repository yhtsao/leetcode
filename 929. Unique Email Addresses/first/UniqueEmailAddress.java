package first;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        if (emails.length == 0) return 0;
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            boolean isRemove = false;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    sb.append(email.substring(i, email.length()));
                    break;
                }
                if (isRemove || email.charAt(i) == '.')
                    continue;

                if (email.charAt(i) == '+')
                    isRemove = true;
                else {
                    sb.append(email.charAt(i));
                }
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
