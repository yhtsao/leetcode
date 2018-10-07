package first;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        char[] chars = new char[S.length()];
        int newIndex = S.length() - 1;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (newIndex >= 0 && Character.isLetter(c) && Character.isLetter(S.charAt(newIndex))) {
                chars[newIndex--] = c;
            } else {
                if (!Character.isLetter(c))
                    chars[i] = c;
                if (newIndex >= 0 && !Character.isLetter(S.charAt(newIndex))) {
                    newIndex--;
                    i--;
                }
            }
        }

        return new String(chars);
    }
}
