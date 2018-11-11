package first;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompareStack(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '#' && !stackS.isEmpty())
                stackS.pop();
            else if (c != '#')
                stackS.push(c);
        }

        Stack<Character> stackT = new Stack<>();
        for (char c : T.toCharArray()) {
            if (c == '#' && !stackT.isEmpty())
                stackT.pop();
            else if (c != '#')
                stackT.push(c);
        }

        if (stackS.size() != stackT.size()) return false;
        while (!stackS.isEmpty()) {
            if (!stackS.pop().equals(stackT.pop())) return false;
        }
        return true;
    }

    // time: O(m + n), space: O(1)
    public boolean backspaceCompare(String S, String T) {
        int i, j;
        for (i = S.length() - 1, j = T.length() - 1; ; i--, j--) {
            i = moveToNotDeleteChar(S, i);
            j = moveToNotDeleteChar(T, j);

            if (i < 0 || j < 0 || S.charAt(i) != T.charAt(j)) break;
        }
        return i < 0 && j < 0;
    }

    // if the current character is '#'
    // move the index to not delete position
    //
    // Ex: abc##, index = 4 will be moved to 0
    //     ae#f#, index = 4 will be moved to 0
    private int moveToNotDeleteChar(String s, int index) {
        if (index < 0 || s.charAt(index) != '#') return index;

        int i = index;
        int cnt = 0; // number of '#'
        for (; i >= 0; i--) {
            if (s.charAt(i) == '#')
                cnt++;
            else if (cnt == 0)
                break;
            else
                cnt--;
        }
        return cnt == 0 ? i : -1;
    }
}
