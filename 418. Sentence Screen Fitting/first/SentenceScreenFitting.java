package first;

public class SentenceScreenFitting {
    /**
     * @param sentence: a list of string
     * @param rows:     an integer
     * @param cols:     an integer
     * @return: return an integer, denote times the given sentence can be fitted on the screen
     */
    public int wordsTyping(String[] sentence, int rows, int cols) {
        int[] startWordOfNextRow = new int[sentence.length];
        int[] sentenceCount = new int[sentence.length];
        sentenceCount[sentence.length - 1] = 1;
        for (int i = 0; i < sentence.length; i++) {
            int length = sentence[i].length();
            int j = (i + 1) % sentence.length;
            while (j < sentence.length) {
                length += sentence[j].length() + 1;
                startWordOfNextRow[i] = j;
                if (length > cols) break;
                if (j == sentence.length - 1) sentenceCount[i]++;
                j = (j + 1) % sentence.length;
            }
        }

        int count = 0;
        int nextStart = 0;
        while (rows > 0) {
            count += sentenceCount[nextStart];
            nextStart = startWordOfNextRow[nextStart];
            rows--;
        }
        return count;

    }
}
