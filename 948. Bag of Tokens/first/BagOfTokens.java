package first;

import java.util.Arrays;

public class BagOfTokens {
    // Purpose:
    // gain max points by losing least power,
    // gain max power while losing points
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int lo = 0, hi = tokens.length - 1;
        int point = 0, maxPoint = 0;

        while (lo <= hi) {
            if (tokens[lo] <= P) {
                P -= tokens[lo++];
                maxPoint = Math.max(maxPoint, ++point);
            } else if (point > 0) {
                P += tokens[hi--];
                point--;
            } else break;
        }
        return maxPoint;
    }
}
