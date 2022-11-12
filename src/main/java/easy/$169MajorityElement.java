package easy;

import java.util.*;

public class $169MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        int max =  map.values().stream().mapToInt(Integer::intValue).max().getAsInt();
        for(Map.Entry<Integer,Integer> a:map.entrySet()){
            if(max == a.getValue()){
                return a.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new $169MajorityElement().majorityElement(new int[]{3,2,3}));
    }
}
