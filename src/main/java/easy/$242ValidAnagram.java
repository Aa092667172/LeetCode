package easy;

import java.util.HashMap;
import java.util.Map;

public class $242ValidAnagram {
  public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
      return false;
    Map<Character,Integer> map1 = new HashMap<>();
    Map<Character,Integer> map2 = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      map1.merge(s.charAt(i),1,(oldValue,newValue)->oldValue+1);
    }
    for (int i = 0; i < t.length(); i++) {
      map2.merge(t.charAt(i),1,(oldValue,newValue)->oldValue+1);
    }
    return map1.equals(map2);
  }

  public static void main(String[] args) {
    $242ValidAnagram $242ValidAnagram = new $242ValidAnagram();
    System.out.println($242ValidAnagram.isAnagram("aabbbb","aaaabb"));
  }
}
