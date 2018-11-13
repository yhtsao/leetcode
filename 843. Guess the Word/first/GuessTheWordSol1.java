package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GuessTheWordSol1 {
    class Master { // just for syntax correct
        public int guess(String word) {
            return 0;
        }
    }

    // Brute force
    // time: O(N)
    public void findSecretWord(String[] wordlist, Master master) {
        int feedback = -1;
        List<String> wordArray = new ArrayList<>();
        for (String word : wordlist)
            wordArray.add(word);

        Random rand = new Random();
        for (int k = 0; k < 10 && feedback < 6; k++) {
            String guess = wordArray.get(rand.nextInt(wordArray.size()));
            feedback = master.guess(guess);
            List<String> tmp = new ArrayList<>();
            for (String word : wordArray) {
                int cnt = matchCnt(guess, word);
                if (cnt == feedback)
                    tmp.add(word);
            }
            wordArray = tmp;
        }
    }

    private int matchCnt(String secret, String word) {
        int cnt = 0;
        for (int i = 0; i < secret.length(); i++)
            if (secret.charAt(i) == word.charAt(i)) cnt++;
        return cnt;
    }
}
