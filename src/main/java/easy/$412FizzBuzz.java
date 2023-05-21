package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer , return a string array (1-indexed) where:nanswer
 *
 * answer[i] == "FizzBuzz" if is divisible by and .i35
 * answer[i] == "Fizz" if is divisible by .i3
 * answer[i] == "Buzz" if is divisible by .i5
 * answer[i] == i (as a string) if none of the above conditions are true.
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 *
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
 *
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 *
 *
 * Constraints:
 *
 * 1 <= n <= 104
 */
public class $412FizzBuzz {

  public List<String> fizzBuzz(int n) {
    List<String> answer = new ArrayList<>();
    for(int i=1;i<n+1;i++){
      if(i % 3 == 0 && i % 5 == 0 ){
        answer.add("FizzBuzz");
      }else if(i % 3==0){
        answer.add("Fizz");
      }else if( i % 5 ==0){
        answer.add("Buzz");
      }else {
        answer.add(String .valueOf( i));
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    $412FizzBuzz $412FizzBuzz = new $412FizzBuzz();
    System.out.println($412FizzBuzz.fizzBuzz(3));
  }
}
