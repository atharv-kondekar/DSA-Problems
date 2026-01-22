package Array.part_2;

//Time Complexity = O(n^3)
public class Max_Subarray_Sum {
	
	private static int maxSubarraySum(int arr[])
	{
		if(arr.length ==1 )
			return arr[0];
		if(arr.length == 0 )
			return 0;
		
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++) 
			{
				int currentSum = 0;
				for(int k=i ;k<=j;k++)
				{
					 currentSum+=arr[k];
				}
				if(currentSum>maxSum) {
					maxSum=currentSum;
				}
				
			}
		}
		
		return maxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,-1,6,-1,3};
		System.out.print("The Maximum Sum of the Subarray is : "+maxSubarraySum(arr));
	}

}
