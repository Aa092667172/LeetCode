package easy;

import java.util.Arrays;

public class $58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.trim().split(" ");
        return s1[s1.length - 1].length();

        /**  1.
         *   int len=s.length(), lastLength=0;
         *
         *     while(len > 0 && s.charAt(len-1)==' '){
         *         len--;
         *     }
         *
         *     while(len > 0 && s.charAt(len-1)!=' '){
         *         lastLength++;
         *         len--;
         *     }
         *
         *     return lastLength;
         *     2.
         *     return s.trim().length()-s.trim().lastIndexOf(" ")-1;
         */
    }

    public static void main(String[] args) {
        System.out.println(new $58LengthOfLastWord().lengthOfLastWord("Hello World"));
    }
}
