public class RegExMatch {

    public boolean isMatch(String s, String p) {
        return isMatchDFS(s, 0, p, 0);
    }

    public boolean isMatchDFS(String s, int startS, String p, int startP) {
        if (startP >= p.length())
            return (startS >= s.length());

        if (startP + 1 < p.length() && p.charAt(startP + 1) == '*') {
            while (startS < s.length()
                    && (s.charAt(startS) == p.charAt(startP) || p.charAt(startP) == '.')) {
                if (isMatchDFS(s, startS, p, startP + 2)) {
                    return true;
                }
                startS++;
            }
            return isMatchDFS(s, startS, p, startP + 2);
        } else {
            if (startS < s.length()
                    && (s.charAt(startS) == p.charAt(startP) || p.charAt(startP) == '.'))
                return isMatchDFS(s, startS + 1, p, startP + 1);
            return false;
        }
    }
}
