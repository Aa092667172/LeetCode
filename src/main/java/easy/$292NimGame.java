package easy;
/**
 * 解題思路
 * 1-3 直接贏
 * 4會輸
 * 5 只要一開始拿1顆怎樣都能贏 對方剩下4
 * 6 只要一開始拿2顆怎樣都能贏 對方剩下4
 * 7 一開始拿3顆怎樣都可以贏 對方剩下4
 * 8怎樣都會輸 由此得知 只要4的倍數都會輸
 * 
 * @author linyukai
 *
 */
public class $292NimGame {
		 public boolean canWinNim(int n) {
			 	return n%4!=0;
		    }
	 
	 public static void main(String[] args) {
		System.out.println(new $292NimGame().canWinNim(4));
	}
}
