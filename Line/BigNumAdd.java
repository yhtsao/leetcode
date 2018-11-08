import java.util.Random;

public class BigNumAdd {
    public static void main(String[] args) {
        Random rand = new Random();
        BigNumAdd sol = new BigNumAdd();
        for (int i = 0; i <= 10; i++) {
            int a = rand.nextInt(100000000);
            int b = rand.nextInt(100000000);
            String ret = sol.add(String.valueOf(a), String.valueOf(b));
            String ans = String.valueOf(a + b);
            if (!ans.equals(ret)) System.out.print("-- ");
            System.out.println(a + ", " + b + ", " + ret);
        }

        System.out.println(sol.add("21342042842108423", "0"));
        System.out.println(sol.add("21342042842108423", "2482094293582919037920"));
        System.out.println(sol.add("0", "1"));
        System.out.println(sol.add("1", "0"));
        System.out.println(sol.add("0", "0"));
        System.out.println(sol.add("1", "1"));

    }

    public static String add(String a, String b) {
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
