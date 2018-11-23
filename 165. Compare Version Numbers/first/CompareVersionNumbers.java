package first;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1s = version1.split("\\.");
        String[] v2s = version2.split("\\.");

        for (int i = 0; i < Math.max(v1s.length, v2s.length); i++) {
            Integer v1 = i < v1s.length ? Integer.parseInt(v1s[i]) : 0;
            Integer v2 = i < v2s.length ? Integer.parseInt(v2s[i]) : 0;
            int compare = v1.compareTo(v2);
            if (compare != 0) return compare;
        }

        return 0;
    }
}
