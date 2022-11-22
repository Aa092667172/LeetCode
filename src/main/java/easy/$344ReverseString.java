package easy;

import java.util.HashMap;
import java.util.Map;

public class $344ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; ++i, --j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }

    public static void main(String[] args) {
        new $344ReverseString().reverseString(new char[]{'h','e','l','l','o'});
    }
}
