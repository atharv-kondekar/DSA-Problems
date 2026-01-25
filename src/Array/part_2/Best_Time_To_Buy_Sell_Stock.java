package Array.part_2;
	
public class Best_Time_To_Buy_Sell_Stock {
	
	private static int bestTimeToBuySell(int [] price){
		int n = price.length;
		if(n <=1)
			return 0;
		
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		
		for(int i = 0 ; i < n ; i++) 
		{
			if(price[i] > buyPrice) {
				int profit = price[i]-buyPrice;
				maxProfit= Math.max(maxProfit, profit);
			}
			else {
				buyPrice = price[i];
			}
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,2,5,3,6,4};
		System.out.print("The Maximum Profit : "+bestTimeToBuySell(arr));
	}
	
}	