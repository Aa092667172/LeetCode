package medium;

import java.util.HashMap;
import java.util.Map;

public class $3LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    if (s.isEmpty()) {
      return 0;
    }
    Map<Character, Integer> map = new HashMap<>();
    int maxLength = 1;
    int left = 0;
    for (int i = 0; i < s.length(); i++) {
      //假設有重複字元 將左索引更新到最大值
      if (map.containsKey(s.charAt(i))) {
        //因為當map重複key時 左指標需要更新,但又可能是小於現在的left所以需要用到math.max
        left = Math.max(left,map.get(s.charAt(i)) + 1);
      }
      //假設右邊索引-左邊索引 大於當前的最大數,把最大數換成 目前的數
      if (i - left + 1 > maxLength) {
        maxLength = i - left + 1;
      }
      //加入map中待該字元以及索引
      map.put(s.charAt(i), i);
    }
    return maxLength;
  }

  public static void main(String[] args) {
    $3LongestSubstringWithoutRepeatingCharacters $3LongestSubstringWithoutRepeatingCharacters = new $3LongestSubstringWithoutRepeatingCharacters();
    System.out.println($3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abba"));
  }
}
