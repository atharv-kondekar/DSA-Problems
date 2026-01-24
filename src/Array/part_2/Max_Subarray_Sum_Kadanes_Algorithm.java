package Array.part_2;

public class Max_Subarray_Sum_Kadanes_Algorithm {

	//Approach 1
	private static int kadanesAlgorithm(int [] arr) 
	{
		if(arr.length == 1 ) return arr[0];
		if(arr.length == 0) return 0;
		int count = 0;
		int maxNum = Integer.MIN_VALUE;
		for(int i=0 ;i<arr.length ; i++ ) 
		{
			if(arr[i] < 0 )
				count++;
				maxNum=Math.max(maxNum, arr[i]);
		}
		
		if(count == arr.length)
			return maxNum;
		
		int currSum =0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0 ;i< arr.length ; i++ ) 
		{
			currSum +=arr[i];
			
			if(currSum < 0 )
				currSum = 0;
			
			maxSum = Math.max(maxSum, currSum);
		}
		
		return maxSum;
	}
	
	//Approach 2 
	private static int kadanesAlgo(int []arr)
	{
		if(arr.length == 0 )
			return 0;
		
		int currSum = arr[0];
		int maxSum = arr[0];
		
		//Handles all negative values  
		for(int i=1; i< arr.length ; i++ ) {
			currSum = Math.max(arr[i] ,currSum + arr[i]); // This is main logic 
			maxSum = Math.max(maxSum, currSum);
		}
		
		return maxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []  = {-2,-3,4,-1,-2,1,5,-3};
		int arr2[] = {-1,-2,-3,-4,-5,-6};
		System.out.print("The Max Subarray Sum : "+kadanesAlgorithm(arr));
		System.out.print("\nThe Max Subarray Sum : "+kadanesAlgo(arr2));
	}

}
