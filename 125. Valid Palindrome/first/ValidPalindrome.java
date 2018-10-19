package first;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            if (!Character.isLetterOrDigit(chars[i])) i++;
            else if (!Character.isLetterOrDigit(chars[j])) j--;
            else if (Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j]))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
