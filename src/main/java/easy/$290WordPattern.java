package easy;

import java.util.*;

public class $290WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        if(pattern.length()!=s1.length)
            return false;
        Map<Character,String> map = new HashMap<>();

        for (int i = 0; i < s1.length; i++) {
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(s1[i]))
                    return false;
            }else{
                if(map.containsValue(s1[i])){
                    return false;
                }
                map.put(pattern.charAt(i),s1[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new $290WordPattern().wordPattern("aaaa", "dog dog dog dog"));
    }
}
