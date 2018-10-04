package first;

public class UniqueSubstringInWraparoundStr {
    public int findSubstringInWraproundString(String p) {
        if (p.length() < 2) return p.length();

        int[] count = new int[26];
        count[p.charAt(0) - 'a'] = 1;
        int maxLen = 1;
        for (int i = 1; i < p.length(); i++) {
            if (p.charAt(i) % 26 == (p.charAt(i - 1) + 1) % 26) {
                maxLen++;
            } else {
                maxLen = 1;
            }

            // update maximum continuous length with end at p.charAt(i)
            int index = p.charAt(i) - 'a';
            count[index] = Math.max(count[index], maxLen);
        }

        int sum = 0;
        for (int i = 0; i < count.length; i++) sum += count[i];
        return sum;
    }
}
