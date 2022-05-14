
public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{7,1,5,3,6,4};
        int[] nums1 = new int[]{1,2,3,4,5};
        int k = maxProfit(nums);
        System.out.println(">>>>>>>>>?? "+ k);
    }
    public static int maxProfit(int[] prices) {
        int buy =0, sell = 0, profit = 0;

        for(int i=0; i < prices.length-1; i++){
            buy = prices[i];
            sell = prices[i+1];
            if(sell > buy){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}

