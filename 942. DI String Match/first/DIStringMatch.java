package first;

public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int currMin = -1, currMax = 1;
        int[] ret = new int[S.length() + 1];
        ret[0] = 0;
        for (int i = 1; i < ret.length; i++) {
            if (S.charAt(i - 1) == 'D') {
                ret[i] = currMin;
                currMin--;
            } else {
                ret[i] = currMax;
                currMax++;
            }
        }
        int diff = -currMin - 1;
        for (int i = 0; i < ret.length; i++)
            ret[i] += diff;
        return ret;
    }
}
