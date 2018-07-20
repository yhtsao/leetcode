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
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        getCombinationsDFS(digits, 0, "", result);
        //return getCombinations(digits, 0);
        return getCombinationBFS(digits);
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

    public void getCombinationsDFS(String digits, int i, String comb, List<String> result) {
        if (i == digits.length()) {
            result.add(comb);
            return;
        }

        String letters = letterMap.get(digits.charAt(i));
        for (int j = 0; j < letters.length(); j++) {
            char c = letters.charAt(j);
            getCombinationsDFS(digits, i + 1, comb + c, result);
        }
    }

    public List<String> getCombinationBFS(String digits) {
        List<String> result = new LinkedList<>();
        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            String letters = letterMap.get(digits.charAt(i));
            while (result.get(0).length() == i) {
                String comp = result.get(0);
                result.remove(0);
                for (int j = 0; j < letters.length(); j++) {
                    result.add(comp + letters.charAt(j));
                }
            }
        }
        return result;
    }

}
