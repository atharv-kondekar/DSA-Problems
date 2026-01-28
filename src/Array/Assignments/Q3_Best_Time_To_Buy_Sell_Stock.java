package Array.Assignments;

public class Q3_Best_Time_To_Buy_Sell_Stock {

	private static int bestTimeToBuySellStock(int [] prices )
	{
		int n = prices.length;
		
		int maxProfit = 0;
		int buyPrice = Integer.MAX_VALUE;
		
		for(int i= 0 ; i<n ; i++ ) {
			// CP < SP = profit ✅
			if( buyPrice < prices[i]){
				
				int profit = prices[i] - buyPrice;
				// "profit = SP - CP"  
				maxProfit = Math.max(maxProfit, profit);
			}
			else {
				buyPrice= prices[i];
			}
		}
		
		return maxProfit;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = {1,2,7,0,5};
		System.out.print("Max profit : "+  bestTimeToBuySellStock(prices) );
	}

}
