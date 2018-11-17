package first;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        if (S.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        int cnt = 0; // count of letters and numbers
        // process the character from the end of S
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '-') continue;
            if (cnt == K) {
                sb.append('-');
                cnt = 0;
            }

            sb.append(S.charAt(i));
            cnt++;
        }
        return sb.reverse().toString().toUpperCase();
    }
}
