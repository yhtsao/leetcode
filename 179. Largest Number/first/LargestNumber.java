package first;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        if (nums.length == 0) return "0";

        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            numsStr[i] = String.valueOf(nums[i]);

        Arrays.sort(numsStr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });

        if (numsStr[0].charAt(0) == '0') return "0";

        StringBuilder sb = new StringBuilder();
        for (String numStr : numsStr)
            sb.append(numStr);

        return sb.toString();
    }
}
