package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
解題思路,透過map將索引值紀錄,假設target扣掉當前陣列的數在map中代表此兩個索引已經為答案
因此利用map的值當作key 索引值當作value 將目前的值與target相減從map中取得兩個索引值回傳答案
 * @author linyukai
 *
 */

public class $1TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int result = target - nums[i];
			if (map.containsKey(result)) {
				return new int[]{map.get(result), i};
			}
			map.put(nums[i], i);
		}
		return new int[]{};
	}
	public static void main(String[] args) {
		$1TwoSum $1TwoSum = new $1TwoSum();
		System.out.println(Arrays.toString($1TwoSum.twoSum(new int[]{3,2,4}, 6)));
	}
}
