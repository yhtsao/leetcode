package first;

public class FilpStrToMonotoneIncrease {
    public int minFlipsMonoIncr(String S) {
        return minFlipsMonoIncrCounting(S);
    }

    private int minFlipsMonoIncrCounting(String S) {
        int flip = 0, oneCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                if (oneCount == 0) continue;
                flip++;
            } else
                oneCount++;

            // When the times of flipping 0 to 1 is larger than flipping 1 to 0
            if (flip > oneCount)
                flip = oneCount;
        }
        return flip;
    }
}
