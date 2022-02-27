package easy;
/**
 * 解題思路:透過方法本身遞回
 * 1 1 2 3 5 8
 * 依照費氏定律 f(n) = f(n-1) + f(n-2) 
 * 按照此思路回乎加總先前的值
 * @author linyukai
 *
 */

public class $509FibonacciNumber {
	 public int fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+ fib(n-2);
	 }
	 
	//動態規劃
//	public int fib(int n) {
//		if(n==0) {
//			return 0;
//		}
//		int chang=0;
//		int one =0;
//		int two =1;
//		for(int i=2;i<=n;i++) {
//			chang = one + two;
//			one = two;
//			two = chang;
//		}
//		
//		return two;
//	}
	
	
	public static void main(String[] args) {
		var v = new $509FibonacciNumber();
		System.out.println(v.fib(5));
	}
}
