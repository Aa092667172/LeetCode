package easy;

/**
 * 透過輸入數字轉為字串 再透過ＳtringBuilder.reverse(）方法判斷回文
 * @author linyukai
 *
 */

public class $9PalindromeNumber {
	public static void main(String[] args) {
		$9PalindromeNumber a = new $9PalindromeNumber();
		System.out.println(a.isPalindrome(-123));
		
	}
	
	
	public boolean isPalindrome(int x) {
		Integer in = x;
        String b = new StringBuilder(String.valueOf(in)).reverse().toString();
        String a = in.toString();
        if(b.equals(a)) {
        	return true;
        }
		return false;
    }
}
