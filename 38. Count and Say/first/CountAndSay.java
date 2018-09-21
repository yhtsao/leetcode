package first;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n < 1) return "";
        String result = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char num = result.charAt(0);
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == num)
                    count++;
                else {
                    sb.append(count).append(num);
                    count = 1;
                    num = result.charAt(j);
                }
            }
            sb.append(count).append(num);
            result = sb.toString();
        }
        return result;
    }
}
