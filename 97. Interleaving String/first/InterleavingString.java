package first;

public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        return isInterleaveRecur(s1, s2, s3);
    }

    public boolean isInterleaveRecur(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        int[][] memo = new int[s1.length()][s2.length()];
        return recur(s1, 0, s2, 0, s3, 0, memo);
    }

    private boolean recur(String s1, int s1Ptr, String s2, int s2Ptr,
                          String s3, int s3Ptr, int[][] memo) {
        if (s1Ptr >= s1.length()) return s2.substring(s2Ptr).equals(s3.substring(s3Ptr));
        if (s2Ptr >= s2.length()) return s1.substring(s1Ptr).equals(s3.substring(s3Ptr));

        if (memo[s1Ptr][s2Ptr] != 0)
            return memo[s1Ptr][s2Ptr] == 1;

        boolean res = (s1.charAt(s1Ptr) == s3.charAt(s3Ptr) && recur(s1, s1Ptr + 1, s2, s2Ptr, s3, s3Ptr + 1, memo))
                | (s2.charAt(s2Ptr) == s3.charAt(s3Ptr) && recur(s1, s1Ptr, s2, s2Ptr + 1, s3, s3Ptr + 1, memo));
        memo[s1Ptr][s2Ptr] = res ? 1 : -1;
        return res;
    }
}
