package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 透過set來去從
 */
public class $349IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                set1.add(nums2[j]);
            }
        }
        int [] array = new int[set1.size()];
        int index = 0;
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()){
            array[index] = iterator.next();
            index++;
        }

        return array;
// java8
//        Set<Integer> intersect = IntStream.of(nums1).boxed()
//                .collect(Collectors.toSet());
//        intersect
//                .retainAll(IntStream.of(nums2).boxed().collect(Collectors.toSet()));
//        return intersect.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        int[] ints1 = {0, 2, 8, 9, 5};
        System.out.println(Arrays.toString(new $349IntersectionOfTwoArrays().intersection(ints, ints1)));
    }
}
