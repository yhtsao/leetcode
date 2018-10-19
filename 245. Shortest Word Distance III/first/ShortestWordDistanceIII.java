package first;

public class ShortestWordDistanceIII {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int word1Index = words.length, word2Index = -words.length;
        int min = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) word1Index = word1.equals(word2) ? word2Index : i;
            if (words[i].equals(word2)) word2Index = i;
            min = Math.min(min, Math.abs(word1Index - word2Index));
        }
        return min;
    }
}
