package Array.Assignments;

public class Q1_Contains_Duplicate{

	private static boolean containsDuplicate(int []arr)
	{
		int n = arr.length;
		
		for(int i = 0 ; i < n ; i++)
		{
			for(int j=i+1 ; j<n ; j++ )
			{
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,6,7,8,9,2};
		if(containsDuplicate(arr))
			System.out.print("The Array is Not Distinct ");
		else
			System.out.print("The Array is Distinct ");
	}

}
