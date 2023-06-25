package medium;

import java.util.Arrays;

public class $238ProductofArrayExceptSelf {
  public int[] productExceptSelf(int[] nums) {
    int result[] = new int[nums.length];
    int temp = 1;
    //將陣列填補為1
    Arrays.fill(result, 1);
    //左邊
    for (int i = 0; i < nums.length; i++) {
      result[i] *= temp;
      temp *= nums[i];
    }
    temp = 1;
    //右邊
    //從後面開始算
    for (int i = nums.length - 1 ; i >= 0 ; i--) {
      result[i] *= temp;
      temp *= nums[i];
    }
    return result;
  }


  public static void main(String[] args) {
    $238ProductofArrayExceptSelf $238ProductofArrayExceptSelf = new $238ProductofArrayExceptSelf();
    System.out.println(Arrays.toString($238ProductofArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4})));

  }
}
