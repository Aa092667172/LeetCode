package easy;

public class $121BestTimetoBuyandSellStock {

  public int maxProfit(int[] prices) {
    int max = Integer.MAX_VALUE;
    int min = 0;
    for (int i = 0; i < prices.length; i++) {
      //取最小的當作max
      max = Math.min(max, prices[i]);
      int result = prices[i] - max;
      //取最大的獲利
      min = Math.max(min, result);
    }
    return min;
  }
  public static void main(String[] args) {
    $121BestTimetoBuyandSellStock $121BestTimetoBuyandSellStock = new $121BestTimetoBuyandSellStock();
    System.out.println($121BestTimetoBuyandSellStock.maxProfit(new int[]{7,1,5,3,6,4}));
  }
}
