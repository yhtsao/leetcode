package first;

import java.util.HashMap;

public class StrobogrammaticNumber {
    /**
     * @param num: a string
     * @return: true if a number is strobogrammatic or false
     */
    public boolean isStrobogrammatic(String num) {
        return isStrobogrammaticHash(num);
    }

    private boolean isStrobogrammaticHash(String num) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        for (int i = 0; i <= num.length() / 2; i++) {
            char c = num.charAt(i);
            char upsideC = num.charAt(num.length() - i - 1);
            if (!map.containsKey(c) || map.get(c) != upsideC)
                return false;
        }
        return true;
    }

    private boolean isStrobogrammaticSwitch(String num) {
        for (int i = 0; i <= num.length() / 2; i++) {
            char c = num.charAt(i);
            char upsideC = num.charAt(num.length() - i - 1);
            switch (c) {
                case '0':
                case '1':
                case '8':
                    if (c != upsideC) return false;
                    break;
                case '6':
                    if (upsideC != '9') return false;
                    break;
                case '9':
                    if (upsideC != '6') return false;
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
