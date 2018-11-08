public class BoardGame {
    public static void main(String[] args) {
        BoardGame sol = new BoardGame();
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + ", " + sol.wayToFinal(i));
        }
        System.out.println(sol.wayToFinalBigNum(610));
    }

    public int wayToFinal(int n) {
        int[] memo = new int[n + 1];
        return wayToFinal(n, memo);
    }

    private int wayToFinal(int n, int[] memo) {
        if (n <= 1) return 1;
        if (memo[n] != 0) return memo[n];
        int cnt = 0;
        for (int i = 1; i <= 6; i++) {
            if (n - i >= 0) cnt += wayToFinal(n - i, memo);
        }
        memo[n] = cnt;
        return memo[n];
    }

    public String wayToFinalBigNum(int n) {
        String[] memo = new String[n + 1];
        return wayToFinalBigNum(n, memo);
    }

    private String wayToFinalBigNum(int n, String[] memo) {
        if (n <= 1) return "1";
        if (memo[n] != null) return memo[n];
        String cnt = "0";
        for (int i = 1; i <= 6; i++) {
            if (n - i >= 0) cnt = add(cnt, wayToFinalBigNum(n - i, memo));
        }
        memo[n] = cnt;
        return memo[n];
    }

    public String add(String a, String b) {
        int len = Math.max(a.length(), b.length());
        int[] result = new int[len + 1];
        char[] aChars = new StringBuilder(a).reverse().toString().toCharArray();
        char[] bChars = new StringBuilder(b).reverse().toString().toCharArray();
        int carrier = 0;
        for (int i = 0; i < result.length; i++) {
            int aVal = i < aChars.length ? aChars[i] - '0' : 0;
            int bVal = i < bChars.length ? bChars[i] - '0' : 0;
            int sum = carrier + aVal + bVal;
            result[i] = sum % 10;
            carrier = sum / 10;
        }

        StringBuilder sb = new StringBuilder();
        int i = result.length - 1;
        while (i >= 0 && result[i] == 0) i--;
        for (; i >= 0; i--) {
            sb.append(result[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
