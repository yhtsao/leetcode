package first;

public class DistinctSubSeqII {
    int mod = 1000000007;

    // time: O(n^2), space: O(n)
    public int distinctSubseqIISol1(String S) {
        int cnt = 0;
        int[] cnts = new int[S.length() + 1];
        cnts[0] = 1;

        for (int i = 0; i < S.length(); i++) {
            int currCnt = 0;
            for (int j = i; j >= 0; j--) {
                currCnt += cnts[j];
                currCnt %= mod;
                if (j != 0 && S.charAt(j - 1) == S.charAt(i))
                    break;
            }
            cnts[i + 1] = currCnt;
            cnt += currCnt;
            cnt %= mod;
        }
        return cnt;
    }

    // time: O(n), space: O(n)
    public int distinctSubseqIISol2(String S) {
        int[] dp = new int[S.length()]; // dp[i] represents number of unique subsequences ends at i
        int[] cnt = new int[26]; // number of subsequences ends at {cnt[i] - 'a'}
        int sum = 0; // total subsequences
        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'a';

            // update dp[i]
            dp[i] = 1 + sum - cnt[index]; // add 1 to represent character itself
            dp[i] = (dp[i] + mod) % mod; // avoid negative condition

            // update cnt[index]
            cnt[index] += dp[i];
            cnt[index] %= mod;

            // update sum
            sum += dp[i];
            sum %= mod;
        }
        return sum;
    }

    // time: O(n), space: O(1)
    public int distinctSubseqIISol3(String S) {
        int[] cnt = new int[26]; // number of subsequences ends at {cnt[i] - 'a'}
        int sum = 0; // total subsequences
        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'a';

            // get number of subsequences end at current character
            int currCnt = 1 + sum - cnt[index]; // add 1 to represent character itself
            currCnt = (currCnt + mod) % mod; // avoid negative condition

            // update cnt[index]
            cnt[index] += currCnt;
            cnt[index] %= mod;

            // update sum
            sum += currCnt;
            sum %= mod;
        }
        return sum;
    }
}
