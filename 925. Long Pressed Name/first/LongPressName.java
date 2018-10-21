package first;

public class LongPressName {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        for (char c : typed.toCharArray()) {
            if (i < name.length() && name.charAt(i) == c) i++;
        }
        return i == name.length();
    }
}
