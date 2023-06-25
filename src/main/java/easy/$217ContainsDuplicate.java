package easy;

import java.util.HashSet;
import java.util.Set;

/**
 *  透過Set特性判斷是否有包含此key
 */
public class $217ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if( set.contains(nums[i])){
        return true;
      }
      set.add(nums[i]);
    }
    return false;
  }
}
