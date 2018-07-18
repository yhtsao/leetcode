import java.util.*;

public class PhoneLetterCombine {
    private static final Map<Character, String> letterMap;

    static {
        letterMap = new HashMap<>();
        letterMap.put('2', "abc");
        letterMap.put('3', "def");
        letterMap.put('4', "ghi");
        letterMap.put('5', "jkl");
        letterMap.put('6', "mno");
        letterMap.put('7', "pqrs");
        letterMap.put('8', "tuv");
        letterMap.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        return getCombinations(digits, 0);
    }

    public List<String> getCombinations(String digits, int i) {
        String letters = letterMap.get(digits.charAt(i));
        List<String> result = new ArrayList<>();
        if (i == digits.length() - 1) {
            for (int j = 0; j < letters.length(); j++) {
                result.add(String.valueOf(letters.charAt(j)));
            }
            return result;
        }

        List<String> tempResult = getCombinations(digits, i + 1);
        for (int j = 0; j < letters.length(); j++) {
            for (String temp : tempResult) {
                result.add(letters.charAt(j) + temp);
            }
        }
        return result;
    }
}
