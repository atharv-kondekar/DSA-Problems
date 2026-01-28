package Array.Assignments;

public class Q2_Element_Present_In_Roated_Array {

	private static int minSearch(int [] nums)
	{
		int left = 0;
		int right=nums.length-1;
		
		while(left < right )
		{
			int mid = left + (right-left)/2;
			
			if(mid>0 && nums[mid-1] > nums[mid]) {
				return mid;
			}
			
			else if (nums[left] <=  nums[mid] && nums[mid] > nums[right])
			{
				left = mid+1;
			}
			
			else {
				right = mid - 1;
			}
		}
		
		return left;
	}
	
	private static int search(int [] nums,int left,int right,int target)
	{
		int l = left;
		int r = right;
		
		while( l <= r )
		{
			int mid =l + (r-1)/2;
			
			if(nums[mid] == target )
				return mid;
			
			else if(nums[mid]>target)
				r=mid-1;
			else
				l=mid+1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
