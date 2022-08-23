package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an integer array , move all 's to the end of it while maintaining the relative order of the non-zero elements.nums0
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 */
public class $283MoveZeroes {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
               System.out.println(i);
              nums[i]=nums[i+1];
              nums[i+1]=0;
           }
        }
    }
}
