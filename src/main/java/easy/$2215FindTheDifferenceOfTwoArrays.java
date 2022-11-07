package easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class $2215FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> collect = IntStream.of(nums1).boxed().collect(Collectors.toList());
        List<Integer> collect1 = IntStream.of(nums2).boxed().collect(Collectors.toList());
        collect.removeAll(collect1);
        collect1.removeAll(IntStream.of(nums1).boxed().collect(Collectors.toList()));
        List<Integer> collect2 = collect.stream().distinct().collect(Collectors.toList());
        List<Integer> collect3 = collect1.stream().distinct().collect(Collectors.toList());

        return Arrays.asList(collect2, collect3);
    }

    public static void main(String[] args) {
        int[] ints = {1,1,2,2,3};
        int[] ints1 = {1,2,3,4};
        List<List<Integer>> difference = new $2215FindTheDifferenceOfTwoArrays().findDifference(ints, ints1);
        System.out.println(difference);
    }
}
