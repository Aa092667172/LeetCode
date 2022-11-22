package easy;

import java.util.ArrayList;
import java.util.List;

public class $448FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer>lst=new ArrayList<>();
        int[] a=new int[n+1];
        //先迭代一次放入所有nums[i]的-1當作1
        for(int i=0;i<n;i++) {
            a[nums[i]-1]=1;
        }
        //第二次迭代 如果是初始0代表沒塞到 並把索引+1取得沒塞入的值
        for(int j=0;j<n;j++) {
            if(a[j]==0)
                lst.add(j+1);
        }
        return lst;
    }

    public static void main(String[] args) {
        System.out.println(new $448FindAllNumbersDisappearedinanArray()
                .findDisappearedNumbers(new int[]{3,5,4,5}));
    }
}
