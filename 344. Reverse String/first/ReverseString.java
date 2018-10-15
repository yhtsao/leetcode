package first;

public class ReverseString {
    public String reverseString(String s) {
        char[] chars = new char[s.length()];
        int j = chars.length - 1;
        for (int i = 0; i < s.length(); i++) {
            chars[j--] = s.charAt(i);
        }
        return new String(chars);
    }
}
