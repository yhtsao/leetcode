package first;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        if (s.length() == 0 || words.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() == 0 || words[i].charAt(0) == ' ') continue;
            sb.append(words[i]).append(' ');
        }
        return sb.substring(0, sb.length() - 1);
    }
}
