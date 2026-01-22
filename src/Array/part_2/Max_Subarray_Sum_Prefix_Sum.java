package Array.part_2;

// Time Complexity = O(n^2)
public class Max_Subarray_Sum_Prefix_Sum {

	private static int subarraySum(int numbers[])
	{
		if(numbers.length ==1 ) return numbers[0];
		if(numbers.length ==0) return 0;
		
		int prefixSum [] = new int[numbers.length];
		prefixSum[0] = numbers[0];
		
		for(int i= 1 ; i < numbers.length ; i++ ) {	
			prefixSum[i] = prefixSum[i-1]+numbers[i]; 
		}
		
		int maxSum = Integer.MIN_VALUE;
		int currSum=0;
		
		for(int i=0;i<numbers.length ; i++ ) 
		{
			int start = i ;
			
			for(int j=i;j<numbers.length;j++) 
			{
				int end = j ;
				
				currSum = (start==0) ? prefixSum[end] : prefixSum[end]-prefixSum[start-1];
				
				if(currSum>maxSum)
					maxSum=currSum;
			}
		}
		
		return maxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,-2,6,-1};
		System.out.print("The Maximum Sum of the Subarray is : "+subarraySum(arr));
	}

}
