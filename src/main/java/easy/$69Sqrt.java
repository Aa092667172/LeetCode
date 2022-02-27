package easy;
/**
 * 解題思路：利用二分法
 * 先將輸入值/2 +1 後 進入迴圈迭代,
 * 取得中間值 為 高與低點加總/2 
 * 假設中間值平方為x 則答案為中間值 
 * 假設中間值開平方大於x 則答案高為中間值-1 縮小範圍 在進入迭代 
 * 假設兩者皆不是 則將最低點設為中間值 +1 縮小範圍
 * 下次回圈再透過兩者相加/2 開始判斷
 * 直到中間值開平方為x為止 回傳中間值 或著低點大於高點 回傳高點
 * 題目陷阱:int型別最大數
 * @author linyukai
 *
 */
public class $69Sqrt {
	public int mySqrt(int x) {
		if(x==1) {
			return 1;
		}
		long high = (x/2);
		long low  =  0;
		
		while(high >=low) {
			long mid = (high + low)/2;
			if(mid*mid ==x) {
				return (int)mid;
			}else if(mid*mid>x) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return (int)high;
	}
	
//	public int mySqrt(int x) {
//		long i =0;
//		while(i*i<x) {
//			i++;
//		}
//		return (int) (i * i== x?i:i-1);
//	}
	
	public static void main(String[] args) {
		$69Sqrt v = new $69Sqrt();
		System.out.println(v.mySqrt(4));
		System.out.println(5/2);
		// 9-> 3 3 
		// 25 -> 5 5
		// 16 -> 4 4
		// 4 -> 2 2
		// 8 -> 2
	}
}
