package easy;

import java.util.Arrays;

/**
 * 因 約束條件 m+n = nums1的長度
 * 將回圈長度設定在m+n為次數
 * 兩者傳入m,n 因爲是長度 陣列索引至0 所以先在-1;
 * 判斷n是否小於0結束回圈
 * 
 * 因題目告知 此兩者陣列唯有序陣列,因此從nums1後方做迭代，比對兩者大小 再將其塞入
 * 
 * @author linyukai
 *
 */
public class $88MergeSortedArray {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		m--;
		n--;
		for(int i=nums1.length-1;i>=0;i--) {
			if(n<0) {
				return;
			}
			if(m>=0&&nums1[m]>nums2[n]) {
				nums1[i] = nums1[m];
				m--;
			}else{
				nums1[i] = nums2[n];
				n--;
			}
			
		}
		System.out.println(Arrays.toString(nums1));
	}
	
	public static void main(String[] args) {
		new $88MergeSortedArray().merge(new int[]{1,2,3,0,0,0},3,new int[] {2,5,6},3);
	}
}
