package first;

public class SentenceScreenFitting {
    /**
     * @param sentence: a list of string
     * @param rows:     an integer
     * @param cols:     an integer
     * @return: return an integer, denote times the given sentence can be fitted on the screen
     */
    public int wordsTyping(String[] sentence, int rows, int cols) {
        return wordsTypingCount(sentence, rows, cols);
    }

    /**
     * Count how many sentence in rows
     * <p>
     * Ex: {"I", "eat", "yo"}, row = 3, col = 7
     * convert to whold string: "I-eat-yo-" (length = 9)
     * row 1: start = 7
     * s[7 % 9] = s[7] = 'o'
     * move the start pointer back to 6 (start of word "yo")
     * start = 6
     * Current Row = "I-eat--"
     * row 2: start = 6 + col = 13
     * s[13 % 9] = s[4] = 't'
     * move the start pointer back to 2 (start of word "eat")
     * start = 11
     * Current Row = "yo-I---"
     * row 3: start = 11 + col = 18
     * s[18 % 9] = s[0] = 'I'
     * No need to move, s[17 % 9] = s[8] = '-'
     * start = 18
     * Current Row = "eat-yo-"
     * <p>
     * Total appear: start/len = 18 / 9 = 2
     */
    private int wordsTypingCount(String[] sentence, int rows, int cols) {
        StringBuilder sb = new StringBuilder();
        for (String word : sentence) sb.append(word).append("-");

        int start = 0, len = sb.length();
        while (rows-- > 0) {
            start += cols;
            if (sb.charAt(start % len) == '-')
                start++;
            else {
                while (start > 0 && sb.charAt((start - 1) % len) != '-')
                    start--;
            }
        }
        return start / len;
    }

    private int wordsTypingDP(String[] sentence, int rows, int cols) {
        int[] startWordOfNextRow = new int[sentence.length];
        int[] sentenceCount = new int[sentence.length];
        for (int i = 0; i < sentence.length; i++) {
            int length = 0;
            int j = i;
            while (sentence[j].length() + length <= cols) {
                length += sentence[j].length() + 1;
                if (j == sentence.length - 1) sentenceCount[i]++;
                j = (j + 1) % sentence.length;
            }
            startWordOfNextRow[i] = j;
        }

        int count = 0;
        int nextStart = 0;
        while (rows-- > 0) {
            count += sentenceCount[nextStart];
            nextStart = startWordOfNextRow[nextStart];
        }
        return count;
    }
}
