package first;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) return false;

        return isPalindromeWoStr(x);
    }

    private boolean isPalindromeWoStr(int x) {
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return x == res || x == res / 10;
    }

    private boolean isPalindromeByStr(int x) {
        String str = Integer.toString(x);

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }
}
