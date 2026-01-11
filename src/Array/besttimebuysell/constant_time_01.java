package Array.besttimebuysell;



class Solution {
	
    public int maxProfit(int[] prices) {
        int buy  = 0 ;

        for(int i = 1 ; i < prices.length ; i++ ){

            if ( prices[buy] < prices[i] ) 
                continue;
            else
                buy = i ;
        }

        if(buy == prices.length-1 )
            return 0;

        int sell=buy;

        for(int j=buy+1 ; j< prices.length ; j++){

            if(prices[sell] > prices[j] )
                continue;
            else
                sell=j;
        }

        return prices[sell] - prices[buy];
    }
}
