package easy;
/**
 * 此題與509相同概念
 * 排列組合方式為前幾次的加總，採用動態規劃 
 * 因1 2 3 皆為自身 因此迭代從4開始
 * 
 * @author linyukai
 *
 */
public class $70ClimbingStairs {
	public int climbStairs(int n) {
		if (n <= 3)
			return n;
		int counts;
		int one = 2;
		int two = 3;

		for (int i = 4; i <= n; i++) {
			counts = one + two;
			one = two;
			two = counts;
		}
		return two;
	}

	public static void main(String[] args) {
		System.out.println(new $70ClimbingStairs().climbStairs(4));
	}
}
