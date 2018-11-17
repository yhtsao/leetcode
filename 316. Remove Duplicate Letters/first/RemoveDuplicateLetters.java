package first;

public class RemoveDuplicateLetters {
    public String removeDuplicateLettersSb(String s) {
        // count occurence of each char
        int[] cnt = new int[26];
        for (char c : s.toCharArray())
            cnt[c - 'a']++;

        // if current char is less than the end char of result
        // and the end char will appear after current char
        // pop the end char of result
        boolean[] visited = new boolean[26]; // check if the char is already add to result
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            cnt[index]--;
            if (visited[index]) continue;
            visited[index] = true;
            while (sb.length() > 0) {
                int last = sb.charAt(sb.length() - 1) - 'a';
                if (last > index && cnt[last] > 0) {
                    visited[last] = false;
                    sb.deleteCharAt(sb.length() - 1);
                } else break;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
