package first;

public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int[] count = new int[10];

        int a = 0, b = 0;
        for (int i = 0; i < guess.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if (s == g) a++;
            else {
                if (count[s] < 0) b++;
                if (count[g] > 0) b++;
                count[s]++;
                count[g]--;
            }
        }

        return a + "A" + b + "B";
    }
}
