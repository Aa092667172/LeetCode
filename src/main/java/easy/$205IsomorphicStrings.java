package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class $205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(Objects.isNull(s) || s.length() <=1)
            return true;
        Map<Character,Character> map  = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            //假設map有包含這個key代表上一個字元與這個字元是相同的
            //那就比對這次輸入的字元 tc是不是跟上一次輸入的tc相同
            //不是則代表格式不相同
            if(map.containsKey(sc)){
                if(map.get(sc)==tc)
                    continue;
                    return false;
            }else {
                //假設此value也不包含 代表還沒輸入過 放入map中
                if(!map.containsValue(tc)){
                    map.put(sc,tc);
                    //包含此value卻沒包含這個key 代表這兩個字串的格式不同
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new $205IsomorphicStrings().isIsomorphic("paper", "title"));
    }
}
