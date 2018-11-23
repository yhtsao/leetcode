package first;

import java.util.List;

public class ValidWordSquare {
    public boolean validWordSquare(List<String> words) {
        if (words.isEmpty() || words.size() != words.get(0).length()) return false;
        for (int i = 0; i < words.size(); i++) {
            String curr = words.get(i);
            // current string length > number of words
            if (curr.length() > words.size()) return false;
            for (int j = 0; j < curr.length(); j++) {
                if (i >= words.get(j).length()) return false;
                if (curr.charAt(j) != words.get(j).charAt(i)) return false;
            }
        }
        return true;
    }
}
