package first;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    public List<List<String>> partition(String s) {
        List<List<String>> ret = new ArrayList<>();
        if (s.isEmpty()) return ret;
        backtracking(s, 0, ret, new ArrayList<>());
        return ret;
    }

    private void backtracking(String s, int index, List<List<String>> ret, List<String> list) {
        if (index == s.length()) {
            ret.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                list.add(s.substring(index, i + 1));
                backtracking(s, i + 1, ret, list);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
