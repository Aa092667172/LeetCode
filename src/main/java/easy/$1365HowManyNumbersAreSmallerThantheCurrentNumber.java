package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class $1365HowManyNumbersAreSmallerThantheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copyArrays = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyArrays);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < copyArrays.length; i++) {
            if (!map.containsKey(copyArrays[i])) {
                map.put(copyArrays[i], i);
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get((nums[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        $1365HowManyNumbersAreSmallerThantheCurrentNumber $1365HowManyNumbersAreSmallerThantheCurrentNumber = new $1365HowManyNumbersAreSmallerThantheCurrentNumber();
        System.out.println(Arrays.toString($1365HowManyNumbersAreSmallerThantheCurrentNumber.smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }
}
