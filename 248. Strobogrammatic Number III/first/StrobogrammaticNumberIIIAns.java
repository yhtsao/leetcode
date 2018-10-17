package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// For Debug
public class StrobogrammaticNumberIIIAns {
    public List<String> helper(int n, int max) {
        if (n == 0) return new ArrayList<String>(Arrays.asList(""));
        if (n == 1) return new ArrayList<String>(Arrays.asList("1", "8", "0"));

        List<String> list = helper(n - 2, max);
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (n != max) result.add("0" + s + "0");
            result.add("1" + s + "1");
            result.add("8" + s + "8");
            result.add("6" + s + "9");
            result.add("9" + s + "6");
        }
        return result;
    }

    public int strobogrammaticInRange(String low, String high) {
        int count = 0;
        List<String> result = new ArrayList<String>();
        for (int i = low.length(); i <= high.length(); i++) {
            result.addAll(helper(i, i));
        }
        for (String str : result) {
            if (str.length() == low.length() && str.compareTo(low) < 0 || str.length() == high.length() && str.compareTo(high) > 0)
                continue;
            count++;
        }
        return count;
    }
}
