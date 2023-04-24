package easy;

import java.util.Arrays;

public class $434NumberofSegmentsinaString {
  public int countSegments(String s) {
    return (int) Arrays.stream(s.trim().split(" ")).filter(str -> str.length() > 0).count();
  }

  public static void main(String[] args) {
    String s = "Hello, my name is John";
    $434NumberofSegmentsinaString $434NumberofSegmentsinaString = new $434NumberofSegmentsinaString();
    System.out.println($434NumberofSegmentsinaString.countSegments(s));
  }
}
